package br.com.clinica.builder;

import br.com.clinica.bean.Risco;

public class RiscoBuilder {

	private boolean isRuido, isRadiacaoNaoIonizada, isUmidade, isVibracao, isRadiacaoIonizada, isPoeira, isFumos,
			isNevoa, isNeblina, isGases, isVapores, isProdutosQuimicos, isEsforcoFisicoIntenso, isPosturaInadequada,
			isLevantamentoTransporte, isTrabalhoEmTurno, isMonotonia, isVirus, isBacterias, isProtozoario, isFungo,
			isArranjoFisico, isFerramentaInadequada, isEletricidade, isOutraSituacao, isIluminacaoInadequada,
			isProbabilidade, isMaquina;

	public Risco criar() {
		Risco risco = new Risco();
		
		risco.setRuido(isRuido);
		risco.setRadiacaoNaoIonizada(isRadiacaoNaoIonizada);
		risco.setUmidade(isUmidade);
		risco.setVibracao(isVibracao);
		risco.setRadiacaoIonizada(isRadiacaoIonizada);
		risco.setPoeira(isPoeira);
		risco.setFumos(isFumos);
		risco.setNevoa(isNevoa);
		risco.setNeblina(isNeblina);
		risco.setGases(isGases);
		risco.setVapores(isVapores);
		risco.setProdutosQuimicos(isProdutosQuimicos);
		risco.setEsforcoFisicoIntenso(isEsforcoFisicoIntenso);
		risco.setPosturaInadequada(isPosturaInadequada);
		risco.setLevantamentoTransporte(isLevantamentoTransporte);
		risco.setTrabalhoEmTurno(isTrabalhoEmTurno);
		risco.setMonotonia(isMonotonia);
		risco.setVirus(isVirus);
		risco.setBacterias(isBacterias);
		risco.setProtozoario(isProtozoario);
		risco.setFungo(isFungo);
		risco.setArranjoFisico(isArranjoFisico);
		risco.setFerramentaInadequada(isFerramentaInadequada);
		risco.setEletricidade(isEletricidade);
		risco.setOutraSituacao(isOutraSituacao);
		
		risco.setIluminacaoInadequada(isIluminacaoInadequada);
		risco.setProbabilidade(isProbabilidade);
		risco.setMaquina(isMaquina);
		return risco;
	}

	public RiscoBuilder comRuido(boolean isRuido) {
		this.isRuido = isRuido;
		return this;
	}

	public RiscoBuilder comRadiacaoNaoIonizada(boolean isRadiacaoNaoIonizada) {
		this.isRadiacaoNaoIonizada = isRadiacaoNaoIonizada;
		return this;
	}

	public RiscoBuilder comUmidade(boolean isUmidade) {
		this.isUmidade = isUmidade;
		return this;
	}

	public RiscoBuilder comVibracao(boolean isVibracao) {
		this.isVibracao = isVibracao;
		return this;
	}

	public RiscoBuilder comRadiacaoIonizada(boolean isRadiacaoIonizada) {
		this.isRadiacaoIonizada = isRadiacaoIonizada;
		return this;
	}

	public RiscoBuilder comPoeira(boolean isPoeira) {
		this.isPoeira = isPoeira;
		return this;
	}

	public RiscoBuilder comFumos(boolean isFumos) {
		this.isFumos = isFumos;
		return this;
	}

	public RiscoBuilder comNevoa(boolean isNevoa) {
		this.isNevoa = isNevoa;
		return this;
	}

	public RiscoBuilder comNeblina(boolean isNeblina) {
		this.isNeblina = isNeblina;
		return this;
	}

	public RiscoBuilder comGases(boolean isGases) {
		this.isGases = isGases;
		return this;
	}

	public RiscoBuilder comVapores(boolean isVapores) {
		this.isVapores = isVapores;
		return this;
	}

	public RiscoBuilder comProdutosQuimicos(boolean isProdutosQuimicos) {
		this.isProdutosQuimicos = isProdutosQuimicos;
		return this;
	}

	public RiscoBuilder comEsforcoFisicoIntenso(boolean isEsforcoFisicoIntenso) {
		this.isEsforcoFisicoIntenso = isEsforcoFisicoIntenso;
		return this;
	}

	public RiscoBuilder comPosturaInadequada(boolean isPosturaInadequada) {
		this.isPosturaInadequada = isPosturaInadequada;
		return this;
	}

	public RiscoBuilder comLevantamentoTransporte(boolean isLevantamentoTransporte) {
		this.isLevantamentoTransporte = isLevantamentoTransporte;
		return this;
	}

	public RiscoBuilder comTrabalhoEmTurno(boolean isTrabalhoEmTurno) {
		this.isTrabalhoEmTurno = isTrabalhoEmTurno;
		return this;
	}

	public RiscoBuilder comMonotonia(boolean isMonotonia) {
		this.isMonotonia = isMonotonia;
		return this;
	}

	public RiscoBuilder comVirus(boolean isVirus) {
		this.isVirus = isVirus;
		return this;
	}

	public RiscoBuilder comBacterias(boolean isBacterias) {
		this.isBacterias = isBacterias;
		return this;
	}

	public RiscoBuilder comProtozoario(boolean isProtozoario) {
		this.isProtozoario = isProtozoario;
		return this;
	}

	public RiscoBuilder comFungo(boolean isFungo) {
		this.isFungo = isFungo;
		return this;
	}

	public RiscoBuilder comArranjoFisico(boolean isArranjoFisico) {
		this.isArranjoFisico = isArranjoFisico;
		return this;
	}

	public RiscoBuilder comFerramentaInadequada(boolean isFerramentaInadequada) {
		this.isFerramentaInadequada = isFerramentaInadequada;
		return this;
	}

	public RiscoBuilder comEletricidade(boolean isEletricidade) {
		this.isEletricidade = isEletricidade;
		return this;
	}

	public RiscoBuilder comOutraSituacao(boolean isOutraSituacao) {
		this.isOutraSituacao = isOutraSituacao;
		return this;
	}

	public RiscoBuilder comIluminacaoInadequada(boolean isIluminacaoInadequada) {
		this.isIluminacaoInadequada = isIluminacaoInadequada;
		return this;
	}

	public RiscoBuilder comProbabilidade(boolean isProbabilidade) {
		this.isProbabilidade = isProbabilidade;
		return this;
	}

	public RiscoBuilder comMaquina(boolean isMaquina) {
		this.isMaquina = isMaquina;
		return this;
	}

}
