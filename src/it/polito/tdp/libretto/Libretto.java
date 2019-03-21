 package it.polito.tdp.libretto;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	    // uso un'interfaccia
	private List <Voto> voti;
	
	public Libretto() {
		           // devo necessariamente usare una classe
		voti = new ArrayList <Voto>();
		
		
	}
	
	/**
	 * Aggiunge un nuovo voto al libretto
	 * @param v il {@link Voto} da aggiungere
	 */
	public void add(Voto v) {
		
		voti.add(v);
		 
	}

}
