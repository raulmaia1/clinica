package br.com.clinica.bean;

public class AtestadoMedicoDeSaudeOcupacional {

	private Paciente paciente;
	private Risco risco;
	private Exame exame;
	private TipoDeExame tipoDeExame;
	private Data data = new Data();
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public void setRisco(Risco risco) {
		this.risco = risco;		
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	public void setTipoDeExame(TipoDeExame tipoDeExame) {
		this.tipoDeExame = tipoDeExame;
	}
	
	public void setData(Data data) {
		this.data = data;
	}
	
	public Exame getExame() {
		return exame;
	}
		
	public Data getData() {
		return data;
	}
	
	public TipoDeExame getTipoDeExame() {
		return tipoDeExame;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	
	public Risco getRisco() {
		return risco;
	}
}
