package br.com.motoshima.corridaGympass.utils;

import java.util.Comparator;

import br.com.motoshima.corridaGympass.modelo.Classificacao;

public class OrdenacaoClassificacao implements Comparator<Classificacao> 
{ 
    public int compare(Classificacao classificacao1, Classificacao classificacao2) 
    { 
    	return classificacao1.getTempoTotal() - classificacao2.getTempoTotal();
    } 
}