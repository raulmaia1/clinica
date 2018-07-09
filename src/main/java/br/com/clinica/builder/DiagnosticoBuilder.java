package br.com.clinica.builder;

import br.com.clinica.bean.Diagnostico;

public class DiagnosticoBuilder {

	private String descricao,cid;

	public DiagnosticoBuilder comDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	public DiagnosticoBuilder comCID(String cid) {
		this.cid = cid;
		return this;
	}

	public Diagnostico criar() {
		Diagnostico diagnostico = new Diagnostico();
		diagnostico.setDescricaoDoDiagnostico(descricao);
		diagnostico.setCID(cid);
		return diagnostico;
	}

}
