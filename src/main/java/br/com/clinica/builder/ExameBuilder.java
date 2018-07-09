package br.com.clinica.builder;

import br.com.clinica.bean.Exame;

public class ExameBuilder {

	private String exameOcupacional;
	private String exameComplementares;
	private String statusRestricao;

	public ExameBuilder comExameOcupacional(String exameOcupacional) {
		this.exameOcupacional = exameOcupacional;
		return this;
	}

	public ExameBuilder comExameComplementares(String exameComplementares) {
		this.exameComplementares = exameComplementares;
		return this;
	}

	public ExameBuilder statusRestricao(String statusRestricao) {
		this.statusRestricao = statusRestricao;
		return this;
	}

	public Exame criar() {
		Exame exame = new Exame();
		exame.setExameComplementares(exameComplementares);
		exame.setExameOcupacional(exameOcupacional);
		exame.setStatusRestricao(statusRestricao);
		
		return exame;
	}

}
