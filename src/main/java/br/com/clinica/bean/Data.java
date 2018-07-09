package br.com.clinica.bean;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Data {
	private LocalDate localDate;
	private String ano, dia, mes;
	private String cidade = "Bacabal";
	
	public Data(LocalDate localDate){
		this.localDate = localDate;
		gera();
	}
	
	public Data(String cidade){
		this.cidade = cidade;		
		localDate = LocalDate.now();
		gera();
	}
	
	public Data() {
		localDate = LocalDate.now();
		gera();
	}

	private void gera() {
		ano = String.valueOf(localDate.getYear());
		dia = String.valueOf(localDate.getDayOfMonth());
		//http://respostas.guj.com.br/18561-java-8---retorno-dos-meses-em-pt_br
		mes = String.valueOf(localDate.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt")));
	}
	
	public String getDataPorExtenso() {
		return cidade + ", " + this.dia +" de "+ this.mes + " de "+ this.ano;
	}
	
	public String getData() {
		return dia +"/"+ String.valueOf(localDate.getMonthValue()) + "/"+ ano;
	}
}
