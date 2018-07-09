package br.com.clinica.app;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import br.com.clinica.bean.Data;
import br.com.clinica.bean.Paciente;
import br.com.clinica.builder.PacienteBuilder;
import br.com.clinica.enums.EnumSexo;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class ControllerASO extends Controller implements Initializable {
	@FXML
	private TextField textCPF, textNome, textRG, textCertificadora, 
		textPeso, textAltura, textPA, textFuncao;
	
	@FXML
	private ComboBox<EnumSexo> comboSexo;
	
	@FXML 
	private DatePicker dataDeNascimento;
	
	private Paciente paciente;
	
	@FXML
	private void gerar() {
		this.paciente = new PacienteBuilder()
			.comCPF(textCPF.getText())
			.comNome(textNome.getText())
			.comRg(textRG.getText())
			.naCertificadora(textCertificadora.getText())
			.comAltura(textAltura.getText())
			.comPA(textPA.getText())
			.comFuncao(textFuncao.getText())
			.comPeso(textPeso.getText())
			.comDataDeNascimento(new Data(dataDeNascimento.getValue()))
			.comSexo(comboSexo.getSelectionModel().getSelectedItem())
			.criar();

		this.getStage().close();
	}
	
	public Optional<Paciente> getPaciente() {
		return Optional.ofNullable(paciente);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//https://docs.oracle.com/javafx/2/ui_controls/combo-box.htm
		comboSexo.setItems(
				FXCollections.observableArrayList(EnumSexo.MASCULINO,EnumSexo.FEMININO));
	}
	
	
	
}
