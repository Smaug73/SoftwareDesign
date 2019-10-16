package Contabilita;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PAGAMENTO")
public class Pagamento {
	
	@Column(name = "valore", nullable = false)
	private float valore;
	
	@Column(name="resto", nullable = false)
	private float resto;
	
	@Column(name="provenieza", nullable = false)
	private String provenienza;
	
	@Column(name="ricevutaId", nullable=false)
	private String ricevutaId;

	@Id
	@Column(name="id", nullable = false)
	private String id;

	
	private Ricevuta ricevuta;
	
	//COSTRUTTORI
	public Pagamento(){}

	public Pagamento(float valore, float resto, String provenienza,String ricevutaId, String id){
		this.valore=valore;
		this.resto=resto;
		this.provenienza=provenienza;
		this.ricevutaId=ricevutaId;
		this.id=id;
	}

	

	@Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + (int)valore;
	        return result;
	    }




	//metodo equals

	//aggiungere get, set, toString 



	
}
