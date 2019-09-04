package br.com.motoshima.corridaGympass.utils;

import java.util.Comparator;

import br.com.motoshima.corridaGympass.modelo.Volta;

public class OrdenacaoVolta implements Comparator<Volta> {

	@Override
	public int compare(Volta volta1, Volta volta2) {
		return volta1.getTempo() - volta2.getTempo();
	}

}
