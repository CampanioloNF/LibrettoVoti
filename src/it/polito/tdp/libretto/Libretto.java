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
	
	/**
	 * Selezione un sottoinsime di voti con il punteggio specificato
	 * @param punti
	 * @return lista di {@link Voto} aventi quel punteggio (eventualmente vuota)
	 */
	
	public List<Voto> cercaVoti (int voto){
		
		List <Voto> result = new ArrayList <Voto>();
		
		for(Voto v : this.voti) {
			if(v.getPunti()==voto)
				result.add(v);
		}
		
		return result;
	}
	
	/**
	 * Ricerca un {@link Voto} a partire dal nome del corso inserito come parametro
	 * 
	 * @param nomeEsame
	 * @return il {@link Voto} dell'esame trovoto (eventualmente {@code null})
	 */
	
	public Voto cercaEsame (String nomeEsame) {
		
		
		for(Voto v : this.voti) {
			if(v.getNomeCorso().equals(nomeEsame))
				return v;
		}
		return null;
	}

}
