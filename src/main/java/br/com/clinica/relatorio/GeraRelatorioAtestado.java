package br.com.clinica.relatorio;

import java.util.ArrayList;
import java.util.List;

import br.com.clinica.bean.Atestado;
import br.com.clinica.enums.EnumRelatorio;
import javafx.application.Platform;

public class GeraRelatorioAtestado {

	public void gerar(EnumRelatorio enumRelatorio,Atestado atestado) {
		Platform.runLater(() -> {
			List<Atestado> list = new ArrayList<>();
			list.add(atestado);

			new GeraRelatorio().gera(enumRelatorio, list);
			
		});
	}
}
