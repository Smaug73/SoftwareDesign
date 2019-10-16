package Contabilita;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import Acquisto.Carrello;

@Entity
@Table(name = "RICEVUTE")
public class Ricevuta implements Serializable{
	@Id
	@Column(name="id" , nullable= false)
	private String codID;
	
	@Column(name="date" , nullable= false)
	private Date date;
	//private Time orario;
	
	@Column(name="pagamentoID" , nullable= false)
	private String pagamentoID;
	
	@Column(name="carrelloId" , nullable= false)
	private String carrelloId;
	

	//COSTRUTTORI
	public Ricevuta(){}

	public Ricevuta(String codId,Date date,String pagamentoId,String carrelloId){
		this.codID=codId;
		this.date=date;
		this.pagamentoID=pagamentoId;
		this.carrelloId=carrelloId;
	}


	@Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + Integer.parseInt(this.codID);
	        return result;
		}
		
	//METODO EQUALS


	//METODI GET & SET
	
	
	
}
