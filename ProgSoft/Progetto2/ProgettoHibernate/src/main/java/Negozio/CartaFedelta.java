package Negozio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CARTE_FEDELTA")
public class CartaFedelta {
	
	@Column(name="punti" , nullable= false)
	private int punti;
	
	@Column(name="attribute" , nullable= false)
	private int attribute;
	
	@Column(name="email" , nullable= false)
	private String email;
	
	@Id
	@Column(name="id" , nullable= false)
	private String codiceID;
	
	@Column(name="cognomeProprietario" , nullable= false)
	private String cognomeProprietario;
	
	@Column(name="nomeProprietario" , nullable= false)
	private String nomeProprietario;
	
	
	
	
	
	public int getPunti() {
		return punti;
	}
	public void setPunti(int punti) {
		this.punti = punti;
	}
	public int getAttribute() {
		return attribute;
	}
	public void setAttribute(int attribute) {
		this.attribute = attribute;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCodiceID() {
		return codiceID;
	}
	public void setCodiceID(String codiceID) {
		this.codiceID = codiceID;
	}
	public String getCognomeProprietario() {
		return cognomeProprietario;
	}
	public void setCognomeProprietario(String cognomeProprietario) {
		this.cognomeProprietario = cognomeProprietario;
	}
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	
	
	
	
}
