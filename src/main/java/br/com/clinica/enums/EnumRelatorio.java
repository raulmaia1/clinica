package br.com.clinica.enums;

public enum EnumRelatorio {
	
	ATESTADO {
		@Override
		public String getStream() {
			return gera("atestado.jasper");
		}
	}, DECLARACAO {
		@Override
		public String getStream() {
			return gera("declaracaoprimeiro.jasper");
		}
	}, ASO {
		@Override
		public String getStream() {
			return gera("aso.jasper");
		}
	};
	
	
	
	private static String gera(String nome) {
		return  "relatorios/"+nome;
	}
	
	public abstract String getStream();

}
