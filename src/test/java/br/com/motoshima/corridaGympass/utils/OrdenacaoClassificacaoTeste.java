package br.com.motoshima.corridaGympass.utils;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.motoshima.corridaGympass.modelo.Classificacao;
import br.com.motoshima.corridaGympass.modelo.Piloto;
import br.com.motoshima.corridaGympass.utils.OrdenacaoClassificacao;

public class OrdenacaoClassificacaoTeste {

	private final OrdenacaoClassificacao ordenacaoClassificacao = new OrdenacaoClassificacao();
	
	@Test
	public void testeIgual() {
		Classificacao classificacaoUm = new Classificacao(1, new Piloto(0, "Piloto1"), 1, 2134, 12, 121);
		Classificacao classificacaoDois = new Classificacao(2, new Piloto(0, "Piloto2"), 1, 2134, 12, 121);
		int resultado = ordenacaoClassificacao.compare(classificacaoUm, classificacaoDois);
		assertTrue("Esperado valor igual", resultado == 0);
	}
	
	@Test
	public void testeMaior() {
		Classificacao classificacaoUm = new Classificacao(1, new Piloto(0, "Piloto1"), 1, 2150, 12, 121);
		Classificacao classificacaoDois = new Classificacao(2, new Piloto(0, "Piloto2"), 1, 2134, 12, 121);
		int resultado = ordenacaoClassificacao.compare(classificacaoUm, classificacaoDois);
		assertTrue("Esperado valor maior", resultado >= 1);
	}
	
	@Test
	public void testeMenor() {
		Classificacao classificacaoUm = new Classificacao(1, new Piloto(0, "Piloto1"), 1, 1000, 12, 121);
		Classificacao classificacaoDois = new Classificacao(2, new Piloto(0, "Piloto2"), 1, 2134, 12, 121);
		int resultado = ordenacaoClassificacao.compare(classificacaoUm, classificacaoDois);
		assertTrue("Esperado valor menor", resultado <= -1);
	}
}
