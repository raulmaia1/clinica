package br.com.clinica.janela;

import java.io.IOException;
import java.util.Optional;

import br.com.clinica.app.Controller;
import br.com.clinica.app.Inicio;
import br.com.clinica.enums.EnumController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JanelaStage {

	private Controller controller;

	public Optional<Stage> geraStage(EnumController enumController) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader();
			fxmlLoader.setLocation(Inicio.class.getResource(enumController.getNome()));
			BorderPane load = fxmlLoader.load();
			Scene scene = new Scene(load);
			Stage stage = new Stage();
			stage.setScene(scene);

			this.controller = fxmlLoader.getController();
			this.controller.adicionaStage(stage);

			return Optional.ofNullable(stage);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Optional.empty();
	}

	public Controller getController() {
		return controller;
	}

}
