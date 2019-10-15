package control;

import Design.Facade;
import Persistenza.GestoreDB;
import Negozio.Magazzino;
import Negozio.Prodotto;

public class CassaController {

	private Magazzino magazzino;
	private GestoreDB dao;
	private Facade facede;
	
	
	//I METODI DEL CONTROLLER SON PRIVATE PERCHE' LI AVVIA SOLO LUI
	
	
	
	/*
	 * METODI DA IMPLEMENTARE PER IL DATABASE
	private Prodotto getProdotto() {}   //da capire come fare
	
	
	*/
	
	
	//POPOLAMENTO MAGAZZINO
	private void addProdottoMagazzino() {	//SI POTREBBE FARE PASSANDO DIRETTAMENTE TUTTA LA LISTA AL MAGAZZINO
	}
	
	
	/*CHIUSURA NEGOZIO
	private void chiusura(){
		
	
	}
	*/
	
	
}
