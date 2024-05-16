package Managermvc.Metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  idTransact;
	private int montant;
	private String catégorie;
	private int date;
	private String description;
	
	public transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public transaction(int montant, String catégorie, int date, String description) {
		super();
		this.montant = montant;
		this.catégorie = catégorie;
		this.date = date;
		this.description = description;
	}
	
	
	public int getIdTransact() {
		return idTransact;
	}
	public void setIdTransact(int idTransact) {
		this.idTransact = idTransact;
	}
	public int getMontant() {
		return montant;
	}
	public void setMontant(int montant) {
		this.montant = montant;
	}
	public String getCatégorie() {
		return catégorie;
	}
	public void setCatégorie(String catégorie) {
		this.catégorie = catégorie;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "transaction [idTransact=" + idTransact + ", montant=" + montant + ", catégorie=" + catégorie + ", date="
				+ date + ", description=" + description + "]";
	}

	
	
}
