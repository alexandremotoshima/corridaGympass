package br.com.motoshima.corridaGympass;

import org.junit.Test;

import junit.framework.TestCase;

public class AplicacaoTeste extends TestCase {

	@Test
	public void testeTempoEmMilisegundos() {
		String valor = "1:02.852";
		int valorEsperado = 62852;
		int valorRetornado = Aplicacao.tempoEmMilisegundos(valor);
		
		assertEquals(valorEsperado, valorRetornado);
	}
}
