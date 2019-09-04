package br.com.motoshima.corridaGympass.utils;

import java.util.Comparator;
import br.com.motoshima.corridaGympass.modelo.Volta;

public class OrdenacaoPiloto implements Comparator<Volta> 
{ 
    public int compare(Volta a, Volta b) 
    { 
        return a.getPiloto().getCodigo() - b.getPiloto().getCodigo(); 
    } 
}