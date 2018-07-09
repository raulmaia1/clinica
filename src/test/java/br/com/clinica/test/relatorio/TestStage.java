package br.com.clinica.test.relatorio;

import br.com.clinica.app.Inicio;
import br.com.clinica.enums.EnumController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TestStage extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		 BorderPane load = FXMLLoader.load(Inicio.class.getResource(EnumController.ASORISCO.getNome()));
		 Scene scene = new Scene(load);
		 primaryStage.setScene(scene);
		 primaryStage.show();
	}
	
}
