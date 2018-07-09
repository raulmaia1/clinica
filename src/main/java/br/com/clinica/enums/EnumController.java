package br.com.clinica.enums;

public enum EnumController {
	ATESTADO {
		@Override
		public String getNome() {
			return "ControllerAtestado.fxml";
		}
	},DENSITOMETRIA {
		@Override
		public String getNome() {
			return "ControllerDensitometria.fxml";
		}
	},DECLARACAOPRIMEIRO {
		@Override
		public String getNome() {
			return "ControllerDeclaracaoPrimeiroAtendimento.fxml";
		}
	}, INICIO {
		@Override
		public String getNome() {
			return "ControllerInicio.fxml";
		}
	},ASOEXAME {
		@Override
		public String getNome() {
			return "ControllerASOExame.fxml";
		}
	}, ASORISCO {
		@Override
		public String getNome() {
			return "ControllerASORisco.fxml";
		}
	}, ASO {
		@Override
		public String getNome() {
			return "ControllerASO.fxml";
		}
	}, ASOTIPOEXAME {
		@Override
		public String getNome() {
			return "ControllerASOTipoDeExame.fxml";
		}
	};
	
	public abstract String getNome();
}
