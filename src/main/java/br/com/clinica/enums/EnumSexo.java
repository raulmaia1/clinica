package br.com.clinica.enums;

public enum EnumSexo {
	MASCULINO {
		@Override
		public String getNome() {
			return "MASCULINO";
		}
	},
	FEMININO {
		@Override
		public String getNome() {
			return "FEMININO";
		}
	}, INDEFINIDO {
		@Override
		public String getNome() {
			return "INDEFINIDO";
		}
	};
	
	public abstract String getNome();
}
