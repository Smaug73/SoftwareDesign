package Negozio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Magazzino {

	private HashMap<String,Prodotto> magazzino;
	
	
	//METODI DI CREAZIONE
	public Magazzino() {
		magazzino = new HashMap<String,Prodotto>();
	}
	
	public Magazzino(List<Prodotto> prodotti) {
		super();
		magazzino= new HashMap<String,Prodotto>();
		for(Prodotto p :prodotti) {
			this.addProduct(p);
		}	
	}
	
	
	

	
	//POPOLARE IL MAGAZZINO	
	public void addProduct(Prodotto p) {
		magazzino.put(p.getId() , p);
	}
	
	public Prodotto getProdottoByID(String id) {
		return magazzino.get(id);
	}
	
	public List<Prodotto> getAllProduct(){
		return (List<Prodotto>) magazzino.values();
	}
	
	
}
