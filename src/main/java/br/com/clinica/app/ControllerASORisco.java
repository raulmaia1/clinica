package br.com.clinica.app;

import java.util.Optional;

import br.com.clinica.bean.Risco;
import br.com.clinica.builder.RiscoBuilder;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

public class ControllerASORisco extends Controller{
	// Meu Deus
	@FXML
	private CheckBox checkRuido,checkRadiacaoNaoIonizada,
		checkUmidade,checkVibracao,checkRadiacaoIonizada,
		checkPoeira,checkFumos,checkNevoa,checkNeblina,checkGases,
		checkVapores,checkProdutosQuimicos,checkBoxEsforcoFisicoIntenso,
		checkPosturaInadequada,checkLevantamentoTransporte,
		checkTrabalhoEmTurno,checkMonotonia,checkVirus, checkBacterias, checkProtozoario,
		checkFungo,checkArranjoFisico,checkFerramentaInadequada,
		checkEletricidade, checkOutraSituacao,checkIluminacaoInadequada,
		checkProbabilidade,checkMaquina;
	
	private Risco risco;
		
	@FXML
	private void gerar() {
		this.risco = new RiscoBuilder()
			.comRuido(checkRuido.isSelected())
			.comRadiacaoNaoIonizada(checkRadiacaoNaoIonizada.isSelected())
			.comUmidade(checkUmidade.isSelected())
			.comVibracao(checkVibracao.isSelected())
			.comRadiacaoIonizada(checkRadiacaoIonizada.isSelected())
			.comPoeira(checkPoeira.isSelected())
			.comFumos(checkFumos.isSelected())
			.comNevoa(checkNevoa.isSelected())
			.comNeblina(checkNeblina.isSelected())
			.comGases(checkGases.isSelected())
			.comVapores(checkVapores.isSelected())
			.comProdutosQuimicos(checkProdutosQuimicos.isSelected())
			.comEsforcoFisicoIntenso(checkBoxEsforcoFisicoIntenso.isSelected())
			.comPosturaInadequada(checkPosturaInadequada.isSelected())
			.comLevantamentoTransporte(checkLevantamentoTransporte.isSelected())
			.comTrabalhoEmTurno(checkTrabalhoEmTurno.isSelected())
			.comMonotonia(checkMonotonia.isSelected())
			.comVirus(checkVirus.isSelected())
			.comBacterias(checkBacterias.isSelected())
			.comProtozoario(checkProtozoario.isSelected())
			.comFungo(checkFungo.isSelected())
			.comArranjoFisico(checkArranjoFisico.isSelected())
			.comFerramentaInadequada(checkFerramentaInadequada.isSelected())
			.comEletricidade(checkEletricidade.isSelected())
			.comOutraSituacao(checkOutraSituacao.isSelected())
			.comIluminacaoInadequada(checkIluminacaoInadequada.isSelected())
			.comProbabilidade(checkProbabilidade.isSelected())
			.comMaquina(checkMaquina.isSelected())
			.criar();
		
		this.getStage().close();
	}

	public Optional<Risco> getRisco() {
		return Optional.ofNullable(risco);
	}
	
}
