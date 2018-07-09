package br.com.clinica.app;

import javafx.stage.Stage;

public class Controller {
	private Stage stage;

	public void adicionaStage(Stage stage) {
		this.stage = stage;
	}
	
	Stage getStage() {
		return stage;
	}
}
