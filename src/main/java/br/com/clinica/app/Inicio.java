package br.com.clinica.app;

import br.com.clinica.enums.EnumController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Inicio extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		 BorderPane load = FXMLLoader.load(Inicio.class.getResource(EnumController.INICIO.getNome()));
		 Scene scene = new Scene(load);
		 primaryStage.setScene(scene);
		 primaryStage.show();
	}
}
