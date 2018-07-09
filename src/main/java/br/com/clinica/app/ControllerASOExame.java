package br.com.clinica.app;

import java.util.Optional;

import br.com.clinica.bean.Exame;
import br.com.clinica.builder.ExameBuilder;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class ControllerASOExame extends Controller{
	@FXML
	private TextField textExameOcupacional,textExameComplementares;
	@FXML
	private ToggleGroup group;
	
	@FXML
	private RadioButton radioComRestricao,radioSemRestricao;
	private Exame exame;
	
	@FXML
	private void concluir() {
		//https://stackoverflow.com/questions/32424915/how-to-get-selected-radio-button-from-togglegroup
		RadioButton radioButton = (RadioButton) group.getSelectedToggle();
			
		this.exame = new ExameBuilder()
				.comExameOcupacional(textExameOcupacional.getText())
				.comExameComplementares(textExameOcupacional.getText())
				.statusRestricao(radioButton.getText())
				.criar();
		
		
		this.getStage().close();
	}
	
	public Optional<Exame> getExame() {
		return Optional.ofNullable(exame);
	}
	
}
