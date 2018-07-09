package br.com.clinica.relatorio;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.clinica.enums.EnumRelatorio;
import javafx.application.Platform;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

class GeraRelatorio {

	<T> void gera(EnumRelatorio enumRelatorio, List<T> list) {
		Platform.runLater(() -> {
			try {
				Map<String, Object> param = new HashMap<String, Object>();

				param.put("logoacide", "relatorios/logoacide.png");
				param.put("logo", "relatorios/logo.png");

				JasperReport report = (JasperReport) JRLoader.loadObject(new File(enumRelatorio.getStream()));
				JasperPrint print = JasperFillManager.fillReport(report, param, new JRBeanCollectionDataSource(list));

				JasperViewer jv = new JasperViewer(print, false);
				jv.setTitle("Relatorios");
				jv.setVisible(true);

			} catch (JRException e) {
				e.printStackTrace();
			}
		});
	}

}
