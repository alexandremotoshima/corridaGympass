package br.com.motoshima.corridaGympass.modelo;

import java.time.LocalTime;

public class Volta {
	private LocalTime hora;
	private Piloto piloto;
	private int numero;
	private int tempo;
	private double velocidadeMedia;
		
public Volta(LocalTime hora, Piloto piloto, int numero, int tempo, double velocidadeMedia) {
		super();
		this.hora = hora;
		this.piloto = piloto;
		this.numero = numero;
		this.tempo = tempo;
		this.velocidadeMedia = velocidadeMedia;
	}

	public Volta() {
		// TODO Auto-generated constructor stub
	}

	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public Piloto getPiloto() {
		return piloto;
	}
	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public double getVelocidadeMedia() {
		return velocidadeMedia;
	}
	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	} 
}