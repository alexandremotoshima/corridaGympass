package br.com.motoshima.corridaGympass.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import br.com.motoshima.corridaGympass.utils.OrdenacaoClassificacao;
import br.com.motoshima.corridaGympass.utils.OrdenacaoPiloto;
import br.com.motoshima.corridaGympass.utils.OrdenacaoVolta;
import br.com.motoshima.corridaGympass.utils.TempoUtils;

public class Corrida {
	private Volta melhorVolta = new Volta();
	private List<Volta> voltas = new ArrayList<Volta>();
	private ArrayList<Classificacao> classificacao = new ArrayList<Classificacao>();
	
	public Corrida(ArrayList<Volta> voltas) {
		this.voltas = voltas;
	}
	
	public void resultadoCorrida(){
		Collections.sort(voltas, new OrdenacaoVolta());
		melhorVolta = voltas.get(0);
		
		Collections.sort(voltas, new OrdenacaoPiloto());
		for (Volta volta : voltas) {
			int ultimoClassificacao = classificacao.size()-1;
			if(classificacao.size() == 0 
			|| classificacao.get(ultimoClassificacao).getPiloto().getCodigo() != volta.getPiloto().getCodigo()) {
				classificacao.add(new Classificacao(0,volta.getPiloto(),1,volta.getTempo(), volta.getTempo(), volta.getVelocidadeMedia()));
			}else {
				classificacao.get(ultimoClassificacao).setQtdVoltas(classificacao.get(ultimoClassificacao).getQtdVoltas()+1);
				classificacao.get(ultimoClassificacao).setTempoTotal(classificacao.get(ultimoClassificacao).getTempoTotal()+volta.getTempo());
				//Calcular a Melhor Volta
				int melhorVolta = volta.getTempo() > classificacao.get(ultimoClassificacao).getMelhorVolta() ? classificacao.get(ultimoClassificacao).getMelhorVolta() : volta.getTempo();
				classificacao.get(ultimoClassificacao).setMelhorVolta(melhorVolta);
				double mediaVelocidade = 
						voltas
							.stream()
							.filter(v -> v.getPiloto().getCodigo() == classificacao.get(ultimoClassificacao).getPiloto().getCodigo())
							.collect(Collectors.averagingDouble(v -> v.getVelocidadeMedia()));
				classificacao.get(ultimoClassificacao).setVelocidadeMedia(mediaVelocidade);
			}
		}
		
		
		Collections.sort(classificacao, new OrdenacaoClassificacao());
		int posicao = 1;
		for (Classificacao classificacaoFinal : classificacao) {
			System.out.println("Posição: " + posicao);
			System.out.println("Código do Piloto: " + classificacaoFinal.getPiloto().getCodigo());
			System.out.println("Nome do Piloto: " + classificacaoFinal.getPiloto().getNome());			
			System.out.println("Quantidade de Voltas Completadas: " + classificacaoFinal.getQtdVoltas());
			System.out.println("Melhor volta do Piloto: " + TempoUtils.converterTempo(classificacaoFinal.getMelhorVolta()));
			System.out.println("Tempo Total de Prova: " + TempoUtils.converterTempo(classificacaoFinal.getTempoTotal()));
			System.out.println("Velocidade Média de Prova: " + classificacaoFinal.getVelocidadeMedia());
			System.out.println("Tempo Após o Vencedor: " + TempoUtils.converterTempo(classificacaoFinal.getTempoTotal()-classificacao.get(0).getTempoTotal()));
			System.out.println();
			posicao++;
		}
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Melhor Volta:");
		System.out.println("Código do Piloto: " + melhorVolta.getPiloto().getCodigo());
		System.out.println("Nome do Piloto: " + melhorVolta.getPiloto().getNome());			
		System.out.println("Tempo: " + TempoUtils.converterTempo(melhorVolta.getTempo()));
		
		
	}
}
