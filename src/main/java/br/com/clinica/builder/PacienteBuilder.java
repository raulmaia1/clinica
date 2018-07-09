package br.com.clinica.builder;

import br.com.clinica.bean.Data;
import br.com.clinica.bean.Paciente;
import br.com.clinica.enums.EnumSexo;

public class PacienteBuilder {

	private String nome,rg,cpf,certificadora;
	private String altura;
	private String pa;
	private String funcao;
	private String peso;
	private EnumSexo sexo;
	private Data data;

	public PacienteBuilder comNome(String nome) {
		this.nome = nome;
		return this;
	}

	public PacienteBuilder comRg(String rg) {
		this.rg = rg;
		return this;
	}

	public PacienteBuilder comCPF(String cpf) {
		this.cpf = cpf;
		return this;
	}

	public PacienteBuilder naCertificadora(String certificadora) {
		this.certificadora = certificadora;
		return this;
	}

	public Paciente criar() {
		Paciente paciente = new Paciente();
		paciente.setNome(nome);
		paciente.setCpf(cpf);
		paciente.setRG(rg);
		paciente.setCerficadora(certificadora);
		paciente.setAltura(altura);
		paciente.setPa(pa);
		paciente.setPeso(peso);
		paciente.setFuncao(funcao);
		paciente.setSexo(sexo);
		paciente.setDataDeNascimento(data);
		return paciente;
	}

	public PacienteBuilder comAltura(String altura) {
		this.altura = altura;
		return this;
	}

	public PacienteBuilder comPA(String pa) {
		this.pa = pa;
		return this;
	}

	public PacienteBuilder comFuncao(String funcao) {
		this.funcao = funcao;
		return this;
	}

	public PacienteBuilder comPeso(String peso) {
		this.peso = peso;
		return this;
	}

	public PacienteBuilder comSexo(EnumSexo sexo) {
		this.sexo = sexo;
		return this;
	}

	public PacienteBuilder comDataDeNascimento(Data data) {
		this.data = data;
		return this;
	}
}
