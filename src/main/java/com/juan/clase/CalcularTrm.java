package com.juan.clase;

public class CalcularTrm {

	private double pessos;
	private double dolares;
	private double trm;
	//private double base;
	//private double valor;

	public CalcularTrm(double trm, double base, double valor) {
		super();
		this.trm = trm;
		
		if (base==1) {
			calcularValorDolar(valor);
		}else {
			calcularValorPeso(valor);
		}
	}

	public void calcularValorDolar(double valor) {
		pessos=valor;
		dolares=trm/valor;

	}

	public void calcularValorPeso(double valor) {
		dolares=valor;
		pessos=valor*trm;

	}

	public double getPessos() {
		return pessos;
	}

	public void setPessos(double pessos) {
		this.pessos = pessos;
	}

	public double getDolares() {
		return dolares;
	}

	public void setDolares(double dolares) {
		this.dolares = dolares;
	}

	public double getTrm() {
		return trm;
	}

	public void setTrm(double trm) {
		this.trm = trm;
	}

}