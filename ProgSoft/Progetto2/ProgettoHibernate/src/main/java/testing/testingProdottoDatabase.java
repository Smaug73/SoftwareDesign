package testing;

import java.util.List;

import Negozio.Prodotto;
import Persistenza.GestoreDB;

public class testingProdottoDatabase {

	
	/*
	 * Semplice testing del funzionamento del GestoreDB e il prodotto
	 * 
	 */
	public static void main(String[] args) {
		//Creiamo dei prodotti da salvere
		
		GestoreDB dao= GestoreDB.getInstance();
		/*
		Prodotto p1=new Prodotto("AE30","PIZZA MARGHERITA","La migliore pizza surgelata.",20,5,4.0);
		Prodotto p2=new Prodotto("AE31","PIZZA MARGHERITA","La migliore pizza surgelata.",20,5,4.0);
		Prodotto p3=new Prodotto("AE32","PASTA","La migliore pasta.",20,5,4.0);
		Prodotto p4=new Prodotto("AE33","POLPETTE","La migliore polpetta.",20,5,4.0);
		Prodotto p5=new Prodotto("AE34","VONGOLE","La migliore vongola.",20,5,4.0);
		Prodotto p6=new Prodotto("AE35","PATATE","La migliore patata.",20,5,4.0);
		
		
		
		//SALVIAMO I PRODOTTI
		dao.saveProdotto(p1);
		dao.saveProdotto(p2);
		dao.saveProdotto(p3);
		dao.saveProdotto(p4);
		dao.saveProdotto(p5);
		dao.saveProdotto(p6);
	*/
		//test getProdotti
		List<Prodotto> prodotti= dao.getAllProdotti();
		for(Prodotto p: prodotti)
	    	System.out.println(p.toString());
	
		
		//modifichiamo le giacenze dei prodotti settandole a 2
		for(Prodotto p: prodotti) {
			p.setGiacenza(4);
			//System.out.println(p.getGiacenza());
		}
			
		//test update prodotti
		dao.updateProdotti(prodotti);
		
	}

	
}
