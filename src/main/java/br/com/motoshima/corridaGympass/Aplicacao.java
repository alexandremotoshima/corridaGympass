package br.com.motoshima.corridaGympass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.motoshima.corridaGympass.modelo.Corrida;
import br.com.motoshima.corridaGympass.modelo.Piloto;
import br.com.motoshima.corridaGympass.modelo.Volta;
import br.com.motoshima.corridaGympass.utils.TempoUtils;

public class Aplicacao {

	
	public static void main(String[] args) throws IOException, ParseException {
		try {
			ArrayList<Volta> voltas = new ArrayList<Volta>();	
			
			Scanner sc = new Scanner(new BufferedReader(new FileReader("log.log")));
			//Pular primeira linha
			sc.nextLine();
			
			while (sc.hasNext()) {
				LocalTime hora = LocalTime.parse(sc.next());
				int codigoPiloto = sc.nextInt();
				sc.next();
				String nomePiloto = sc.next();
				int volta = sc.nextInt();
				int tempo = TempoUtils.tempoEmMilisegundos(sc.next());
				double velocidadeMedia = sc.nextDouble();
	
				voltas.add(new Volta(hora,new Piloto(codigoPiloto,nomePiloto),volta,tempo,velocidadeMedia));
			}
			Corrida corrida = new Corrida(voltas);
			corrida.resultadoCorrida();
	
			sc.close();
		}catch (Exception e) {
			System.out.println("Ocorreu um erro ao tentar verificar resultados da corrida.");
			e.printStackTrace();
//			logger.log(Level.SEVERE, "Ocorreu um erro ao tentar verificar resultados da corrida.", e);
		}
	}
}
