package br.com.motoshima.corridaGympass.modelo;

public class Classificacao {
	private int posicao;
	private Piloto piloto;
	private int qtdVoltas;
	private int tempoTotal;
	private int melhorVolta;
	private double velocidadeMedia;
	
	public Classificacao(int posicao, Piloto piloto, int qtdVoltas, int tempoTotal, int melhorVolta, double velocidadeMedia) {
		this.posicao = posicao;
		this.piloto = piloto;
		this.qtdVoltas = qtdVoltas;
		this.tempoTotal = tempoTotal;
		this.melhorVolta = melhorVolta;
		this.velocidadeMedia = velocidadeMedia;
	}

	public double getVelocidadeMedia() {
		return velocidadeMedia;
	}

	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}

	public int getMelhorVolta() {
		return melhorVolta;
	}

	public void setMelhorVolta(int melhorVolta) {
		this.melhorVolta = melhorVolta;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public int getQtdVoltas() {
		return qtdVoltas;
	}

	public void setQtdVoltas(int qtdVoltas) {
		this.qtdVoltas = qtdVoltas;
	}

	public int getTempoTotal() {
		return tempoTotal;
	}

	public void setTempoTotal(int tempoTotal) {
		this.tempoTotal = tempoTotal;
	}
	
}
