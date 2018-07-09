package br.com.clinica.test.relatorio;

import br.com.clinica.bean.AtestadoMedicoDeSaudeOcupacional;
import br.com.clinica.bean.TipoDeExame;
import br.com.clinica.relatorio.GeraRelatorioAtestadoASO;

public class TestRelatorioAtestado {
	public static void main(String[] args) {
//		Atestado atestado = new Atestado();
//		
//		atestado.setPaciente(new PacienteBuilder()
//				.comNome("Eduardo")
//				.comCPF("045964833-02")
//				.comRg("11111111111")
//				.naCertificadora("SSP/MA")
//				.criar());
//		
//		atestado.setDiagnostico(new DiagnosticoBuilder()
//				.comDescricao("trauma no ombro")
////				.comCID("G 56.3")
//				.criar());
		
		AtestadoMedicoDeSaudeOcupacional aso = new  AtestadoMedicoDeSaudeOcupacional();
				
		TipoDeExame tipoDeExame = new TipoDeExame();
		tipoDeExame.setDemissional(Boolean.TRUE);
		
		aso.setTipoDeExame(tipoDeExame);
		
		new GeraRelatorioAtestadoASO().gera(aso);
	}
}
