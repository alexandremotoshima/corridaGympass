package br.com.motoshima.corridaGympass.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import br.com.motoshima.corridaGympass.utils.TempoUtils;

public class TempoUtilsTeste {
	
	@Test
	public void tempoEmMilisegundosTeste() {
		
		String valor = "1:02.852";
		int valorEsperado = 62852;
		int valorRetornado = TempoUtils.tempoEmMilisegundos(valor);		
		
		assertEquals(valorEsperado, valorRetornado);
	}
	@Test
	public void converterTempo() {
		
		int valor = 62852;
		String valorEsperado = "01:02.852";
		String valorRetornado = TempoUtils.converterTempo(valor);		
		
		assertEquals(valorEsperado, valorRetornado);
	}	

}
