package Negozio;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import id.databasemaster.hibernate.ProgettoHibernate.Employee;


@Entity
@Table(name = "PRODOTTI")
public class Prodotto implements Serializable {
	
	@Id
	@Column(name="id" , nullable= false)
	private String id;
	
	

	@Column(name="NOME" , nullable= false)
	private String nome;
	
	@Column(name="DESCRIZIONE" , nullable= false)
	private String descrizione;
	
	@Column(name="GIACENZA" , nullable= false)
	private int giacenza;
	
	@Column(name="QUANTITAMINIMA" , nullable= false)
	private int quantitaMinima;
	
	@Column(name="PREZZO" , nullable= false)
	private double prezzo;
	
	
	//COSTRUTTORI
	public Prodotto() {}
	
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getId() {
		return id;
	}
	public void setId(String codice) {
		this.id = codice;
	}
	public int getGiacenza() {
		return giacenza;
	}
	public void setGiacenza(int giacenza) {
		this.giacenza = giacenza;
	}
	public int getQuantitaMinima() {
		return quantitaMinima;
	}
	public void setQuantitaMinima(int quantitaMinima) {
		this.quantitaMinima = quantitaMinima;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	
	 public Prodotto(String id, String nome, String descrizione, int giacenza, int quantitaMinima, double prezzo) {
		super();
		this.id = id;
		this.nome = nome;
		this.descrizione = descrizione;
		this.giacenza = giacenza;
		this.quantitaMinima = quantitaMinima;
		this.prezzo = prezzo;
	}

	@Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + (int)prezzo;
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
	 
	 @Override
		public String toString() {
			return "Prodotto [id=" + id + ", nome=" + nome + ", descrizione=" + descrizione + ", giacenza=" + giacenza
					+ ", quantitaMinima=" + quantitaMinima + ", prezzo=" + prezzo + "]";
		}
	
}