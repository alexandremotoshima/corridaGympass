package br.com.motoshima.corridaGympass.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TempoUtils {
	
	public static String converterTempo(int tempoMilisegundos) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(tempoMilisegundos);
		SimpleDateFormat s = new SimpleDateFormat("mm:ss.SSS"); 
		
		return s.format(calendar.getTime()); 
	}
	
	public static int tempoEmMilisegundos(final String tempoVoltaString) {

		String[] tempos = tempoVoltaString.replace(".", ":").split(":");
		int minutos = Integer.parseInt(tempos[0])*60*1000;
		int segundos = Integer.parseInt(tempos[1])*1000;
		int milisegundos = Integer.parseInt(tempos[2]);

		return minutos + segundos+ milisegundos;
	}
}
