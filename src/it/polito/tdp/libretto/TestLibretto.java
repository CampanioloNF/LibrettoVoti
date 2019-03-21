package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {

	public static void main(String[] args) {
		
		Libretto lib = new Libretto();
		
		lib.add(new Voto(30, "Analisi I", LocalDate.of(2017, 1, 15)));
		lib.add(new Voto(21, "Analisi II", LocalDate.of(2018, 1, 15)));
		lib.add(new Voto(25, "Fisica I", LocalDate.of(2017, 6, 10)));
		lib.add(new Voto(28, "Fisica II", LocalDate.of(2018, 9, 3)));
		lib.add(new Voto(18, "Geometria", LocalDate.of(2017, 9, 10)));
		lib.add(new Voto(20, "Economia", LocalDate.of(2018, 2, 15)));
		lib.add(new Voto(25, "Ricerca Operativa", LocalDate.of(2019, 2, 5)));
		lib.add(new Voto(24, "Complement di Economia", LocalDate.of(2019,2, 17)));
		lib.add(new Voto(25, "Logistica", LocalDate.of(2019, 1, 25)));
		lib.add(new Voto(27, "Programmazione Oggetti", LocalDate.of(2019, 1, 25)));
		
		List <Voto> venticinque = lib.cercaVoti(25);
		System.out.println(venticinque);
		
		System.out.println(lib.cercaEsame("Analisi I"));
		System.out.println(lib.cercaEsame("Analisi III"));
		
	}

}
