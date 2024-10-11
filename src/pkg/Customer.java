package pkg;

public class Customer {

	private int idCustomer;
	private String nom;
	private String prenom;
	
	public Customer(int idCustomer, String nom, String prenom) {
		this.idCustomer = idCustomer;
		this.nom = nom;
		this.prenom = prenom;
	} 
	
	public int getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
}
