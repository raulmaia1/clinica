package br.com.clinica.bean;

public class TipoDeExame {
	private boolean isAdmissional,isPeriodico, isMudancaDeFuncao, isDemissional,isRetornoAoTrabalho;
		
	public void setAdmissional(boolean isAdmissional) {
		this.isAdmissional = isAdmissional;
	}

	public void setPeriodico(boolean isPeriodico) {
		this.isPeriodico = isPeriodico;
	}
	
	public void setMudancaDeFuncao(boolean isMudancaDeFuncao) {
		this.isMudancaDeFuncao = isMudancaDeFuncao;
	}
	
	public void setDemissional(boolean isDemissional) {
		this.isDemissional = isDemissional;
	}
	
	public void setRetornoAoTrabalho(boolean isRetornoAoTrabalho) {
		this.isRetornoAoTrabalho = isRetornoAoTrabalho;
	}
	
	public boolean getPeriodico() {
		return isPeriodico;
	}
	
	public Boolean getAdmissional() {
		return isAdmissional;
	}

	public boolean getMudancaDeFuncao() {
		return isMudancaDeFuncao;
	}
	
	public boolean getDemissional() {
		return isDemissional;
	}
	
	public boolean getRetornoAoTrabalho() {
		return isRetornoAoTrabalho;
	}
	
	
//	(   ) Admissional		               (X) Demissional
//    (   ) Periódico			 (  ) Retorno ao Trabalho
//    (   ) Mudança de Função
	
}
