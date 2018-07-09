package br.com.clinica.bean;

public class Atestado {
	private Paciente paciente;
	private Diagnostico diagnostico;
	private Data data = new Data();
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;		
	}
	
	public Paciente getPaciente() {
		return paciente;
	}

	public Diagnostico getDiagnostico() {
		return diagnostico;
	}
	
	public void setDiagnostico(Diagnostico diagnostico) {
		this.diagnostico = diagnostico;		
	}
	
	public Data getData() {
		return data;
	}
}
