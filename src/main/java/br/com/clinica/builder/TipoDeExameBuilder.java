package br.com.clinica.builder;

import br.com.clinica.bean.TipoDeExame;

public class TipoDeExameBuilder {

	private boolean isRetornoAoTrabalho, isDemissional, isMudancaDeFuncao, isPeriodico, isAdmissional;

	public TipoDeExameBuilder selecionadoAdmissional(boolean admissional) {
		this.isAdmissional = admissional;
		return this;
	}

	public TipoDeExameBuilder selecionadoPeriodico(boolean periodico) {
		this.isPeriodico = periodico;
		return this;
	}

	public TipoDeExameBuilder selecionadoMudanca(boolean mudanca) {
		this.isMudancaDeFuncao = mudanca;
		return this;
	}

	public TipoDeExameBuilder selecionadoDemissional(boolean demissional) {
		this.isDemissional = demissional;
		return this;
	}

	public TipoDeExameBuilder selecinadoRetorno(boolean retorno) {
		this.isRetornoAoTrabalho = retorno;
		return this;
	}

	public TipoDeExame criar() {
		TipoDeExame tipo = new TipoDeExame();
		tipo.setAdmissional(isAdmissional);
		tipo.setDemissional(isDemissional);
		tipo.setMudancaDeFuncao(isMudancaDeFuncao);
		tipo.setPeriodico(isPeriodico);
		tipo.setRetornoAoTrabalho(isRetornoAoTrabalho);
		return tipo;
	}

}
