package br.com.clinica.app;

import br.com.clinica.bean.Atestado;
import br.com.clinica.bean.Diagnostico;
import br.com.clinica.bean.Paciente;
import br.com.clinica.builder.DiagnosticoBuilder;
import br.com.clinica.builder.PacienteBuilder;
import br.com.clinica.enums.EnumRelatorio;
import br.com.clinica.relatorio.GeraRelatorioAtestado;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControllerAtestado extends Controller {
	@FXML
	private TextField textNome,textRG,textCPF,textCertificadora,textCID;
	@FXML
	private TextArea textDiagnostico;

	@FXML
	private void gerar() {
		// Isso nao eh um atestado pq eh utilizado como declaracao
		Atestado atestado = new Atestado();
		
		Paciente paciente = new PacienteBuilder()
				.comNome(textNome.getText())
				.comRg(textRG.getText())
				.comCPF(textCPF.getText())
				.naCertificadora(textCertificadora.getText())
				.criar();
		
		Diagnostico diagnostico = new DiagnosticoBuilder()
				.comDescricao(textDiagnostico.getText())
				.comCID(textCID.getText())
				.criar();

		atestado.setPaciente(paciente);
		atestado.setDiagnostico(diagnostico);
		new GeraRelatorioAtestado().gerar(EnumRelatorio.ATESTADO,atestado);
	}
}
