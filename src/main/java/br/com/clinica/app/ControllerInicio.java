package br.com.clinica.app;

import br.com.clinica.bean.AtestadoMedicoDeSaudeOcupacional;
import br.com.clinica.enums.EnumController;
import br.com.clinica.janela.JanelaStage;
import br.com.clinica.relatorio.GeraRelatorioAtestadoASO;
import javafx.fxml.FXML;

public class ControllerInicio {

	// Pode Melhorar
	@FXML
	private void abrirAtestado() {
		new JanelaStage().geraStage(EnumController.ATESTADO).ifPresent(s -> s.show());
	}

	@FXML
	private void abrirDensitometria() {
		new JanelaStage().geraStage(EnumController.DENSITOMETRIA).ifPresent(s -> s.show());
	}

	@FXML
	private void abrirDeclaracaoPrimeiro() {
		new JanelaStage().geraStage(EnumController.DECLARACAOPRIMEIRO).ifPresent(s -> s.show());
	}

	@FXML
	private void abrirAtestadoMedicoDeSaudeOcupacional() {
		AtestadoMedicoDeSaudeOcupacional atestado = new AtestadoMedicoDeSaudeOcupacional();

		JanelaStage asoTipoExame = new JanelaStage();
		asoTipoExame.geraStage(EnumController.ASOTIPOEXAME).ifPresent(s -> {
			s.showAndWait();
			((ControllerASOTipoDeExame) asoTipoExame.getController()).getTipoDeExame().ifPresent(t -> {
				atestado.setTipoDeExame(t);

				JanelaStage aso = new JanelaStage();
				aso.geraStage(EnumController.ASO).ifPresent(stageAso -> {
					stageAso.showAndWait();
					((ControllerASO) aso.getController()).getPaciente().ifPresent(p -> {
						atestado.setPaciente(p);

						JanelaStage asoRisco = new JanelaStage();
						asoRisco.geraStage(EnumController.ASORISCO).ifPresent(stageRisco -> {
							stageRisco.showAndWait();
							((ControllerASORisco) asoRisco.getController()).getRisco().ifPresent(r -> {
								atestado.setRisco(r);

								JanelaStage asoExame = new JanelaStage();
								asoExame.geraStage(EnumController.ASOEXAME).ifPresent(stageExame -> {
									stageExame.showAndWait();
									((ControllerASOExame) asoExame.getController()).getExame().ifPresent(e -> {
										atestado.setExame(e);
										new GeraRelatorioAtestadoASO().gera(atestado);
									});
								});
							});
						});
					});
				});

			});
		});

	}

}
