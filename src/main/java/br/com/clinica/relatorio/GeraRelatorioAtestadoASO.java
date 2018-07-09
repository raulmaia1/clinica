package br.com.clinica.relatorio;

import java.util.ArrayList;
import java.util.List;

import br.com.clinica.bean.AtestadoMedicoDeSaudeOcupacional;
import br.com.clinica.enums.EnumRelatorio;

public class GeraRelatorioAtestadoASO {

	public void gera(AtestadoMedicoDeSaudeOcupacional atestado) {
		List<AtestadoMedicoDeSaudeOcupacional> list = new ArrayList<>();
		list.add(atestado);
		
		new GeraRelatorio().gera(EnumRelatorio.ASO, list);
		
	}

}
