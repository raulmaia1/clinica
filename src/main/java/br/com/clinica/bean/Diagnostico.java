package br.com.clinica.bean;

public class Diagnostico {
	private String descricao, cid;

	public void setDescricaoDoDiagnostico(String descricao) {
		this.descricao = descricao;
	}

	public void setCID(String cid) {
		this.cid = cid;	
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getCid() {
		return cid;
	}
	
}
