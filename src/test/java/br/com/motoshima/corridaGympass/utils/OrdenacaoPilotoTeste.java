package br.com.motoshima.corridaGympass.utils;

import static org.junit.Assert.assertTrue;

import java.time.LocalTime;

import org.junit.Test;

import br.com.motoshima.corridaGympass.modelo.Piloto;
import br.com.motoshima.corridaGympass.modelo.Volta;

public class OrdenacaoPilotoTeste {

	private final OrdenacaoPiloto ordenacaoPiloto = new OrdenacaoPiloto();
	
	@Test
	public void testeIgual() {
		LocalTime hora = LocalTime.now();
		Volta voltaUm = new Volta(hora, new Piloto(1, "piloto1"), 1, 4300, 30);
		Volta voltaDois = new Volta(hora, new Piloto(1, "piloto1"), 1, 4300, 30);
		int resultado = ordenacaoPiloto.compare(voltaUm, voltaDois);
		assertTrue("Esperado valor igual", resultado == 0);
	}
	
	@Test
	public void testeMaior() {
		LocalTime hora = LocalTime.now();
		Volta voltaUm = new Volta(hora, new Piloto(2, "piloto2"), 1, 4300, 30);
		Volta voltaDois = new Volta(hora, new Piloto(1, "piloto1"), 1, 4300, 30);
		int resultado = ordenacaoPiloto.compare(voltaUm, voltaDois);
		
		assertTrue("Esperado valor maior", resultado >= 1);
	}
	
	@Test
	public void testeMenor() {
		LocalTime hora = LocalTime.now();
		Volta voltaUm = new Volta(hora, new Piloto(1, "piloto1"), 1, 4300, 30);
		Volta voltaDois = new Volta(hora, new Piloto(2, "piloto2"), 1, 4300, 30);
		int resultado = ordenacaoPiloto.compare(voltaUm, voltaDois);
		
		assertTrue("Esperado valor menor", resultado <= -1);
	}
	
}
