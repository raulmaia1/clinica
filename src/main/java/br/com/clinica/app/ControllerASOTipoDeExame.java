package br.com.clinica.app;

import java.util.Optional;

import br.com.clinica.bean.TipoDeExame;
import br.com.clinica.builder.TipoDeExameBuilder;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class ControllerASOTipoDeExame extends Controller {
	
	@FXML
	private ToggleGroup group;
	
	@FXML
	private RadioButton radioAdmissional,radioPeriodico,radioMudanca,radioDemissional,radioRetorno;
	private TipoDeExame tipoDeExame;
	
	@FXML
	private void gerar() {
		this.tipoDeExame = new TipoDeExameBuilder()
			.selecionadoAdmissional(radioAdmissional.isSelected())
			.selecionadoPeriodico(radioPeriodico.isSelected())
			.selecionadoMudanca(radioMudanca.isSelected())
			.selecionadoDemissional(radioDemissional.isSelected())
			.selecinadoRetorno(radioRetorno.isSelected())
			.criar();
		
		this.getStage().close();
	}
	
	public Optional<TipoDeExame> getTipoDeExame() {
		return Optional.ofNullable(tipoDeExame);
	}
	
}
