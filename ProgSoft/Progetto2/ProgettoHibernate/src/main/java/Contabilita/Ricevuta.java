package Contabilita;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import Acquisto.Carrello;

@Entity
@Table(name = "RICEVUTE")
public class Ricevuta {

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
	
	
	
	
}
