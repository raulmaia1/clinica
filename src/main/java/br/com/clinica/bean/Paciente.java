package br.com.clinica.bean;

import br.com.clinica.enums.EnumSexo;

public class Paciente {
	private String nome,RG, cpf,certificadora, altura,pa,peso,funcao;
	private Data dataDeNascimento;
	private EnumSexo sexo = EnumSexo.INDEFINIDO;
		
	public String getNome() {
		return nome;
	}
	
	public String getPa() {
		return pa;
	}
	
	public String getAltura() {
		return altura;
	}
	
	public String getPeso() {
		return peso;
	}
	
	public String getSexo() {
		return sexo.getNome();
	}
	
	public String getRG() {
		return RG;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getCertificadora() {
		return certificadora;
	}
	
	public String getFuncao() {
		return funcao;
	}
	
	public String getDataDeNascimento() {
		return dataDeNascimento.getData();
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setSexo(EnumSexo sexo) {
		this.sexo = sexo;
	}
	
	public void setCerficadora(String cerficadora) {
		this.certificadora = cerficadora;
	}
	
	public void setDataDeNascimento(Data data) {
		this.dataDeNascimento = data;
	}
	
	public void setRG(String rG) {
		RG = rG;
	}

	public void setAltura(String altura) {
		this.altura = altura;	
	}

	public void setPa(String pa) {
		this.pa = pa;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
}
