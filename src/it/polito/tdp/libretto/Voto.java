package it.polito.tdp.libretto;

import java.time.LocalDate;

public class Voto {
	
	private int punti;
	private String nomeCorso;
	private LocalDate data;
	
	
	public Voto(int voto, String nomeCorso, LocalDate data) {
		super();
		this.punti = voto;
		this.nomeCorso = nomeCorso;
		this.data = data;
	}


	public int getPunti() {
		return punti;
	}


	public void setPunti(int voto) {
		this.punti = voto;
	}


	public String getNomeCorso() {
		return nomeCorso;
	}


	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return String.format("Voto [voto=%s, corso=%s, data=%s]", punti, nomeCorso, data);
	}


	
	
	
	

}
