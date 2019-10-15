package Ordine;

import Negozio.Prodotto;

public class LineaOrdine {

	private int quantita;
	private String codiceID;
	
	private Prodotto prodotto;
	
	
	
	

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public String getCodiceID() {
		return codiceID;
	}

	public void setCodiceID(String codiceID) {
		this.codiceID = codiceID;
	}

	public Prodotto getProdotto() {
		return prodotto;
	}

	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}
	
		
}
