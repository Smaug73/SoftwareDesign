package Acquisto;

import java.io.Serializable;

import Negozio.Prodotto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Recensioni")
public class Recensione implements Serializable{
	@Column(name = "stelle", nullable = false)
	private int stelle;
	
	@Column(name = "descrizione", nullable = false)
	private String descrizione;

	@Column(name = "titolo", nullable = false)
	private String titolo;

	@Id
	@Column(name = "id", nullable = false)
	private String codiceID;
	
	@Column(name = "prodottoId" , nullable = false)
	private String prodottoId;
	
	
	private Prodotto prodotto;//da capire quando si risolve
	
	

	public Recensione(){}

	public Recensione(int stelle, String descrizione,String titolo,String codiceId,String prodottoId){
		this.stelle=stelle;
		this.descrizione=descrizione;
		this.titolo= titolo;
		this.codiceID=codiceId;
		this.prodottoId=prodottoId;

	}

	

	@Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + Integer.parseInt(this.codiceID);
	        return result;
	    }


	@Override
	 public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (!(obj instanceof Prodotto))
	            return false;
	        Prodotto other = (Prodotto) obj;
	        if (id != other.id  )
	            return false;
	        return true;
	 }	



//GENERARE METODI GET E SET E TOSTRING

	public int getStelle(){
		return this.stelle;
	}
	
	
	
	

	
}
