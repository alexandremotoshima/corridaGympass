package br.com.motoshima.corridaGympass.utils;

import java.util.Comparator;

import br.com.motoshima.corridaGympass.modelo.Classificacao;

public class OrdenacaoClassificacao implements Comparator<Classificacao> 
{ 
    public int compare(Classificacao classsificacao1, Classificacao classificacao2) 
    { 
    	if(classsificacao1.getQtdVoltas() != classificacao2.getQtdVoltas())
    		return classificacao2.getQtdVoltas() - classsificacao1.getQtdVoltas();
    	else
    		return classsificacao1.getTempoTotal() - classificacao2.getTempoTotal();
    } 
}