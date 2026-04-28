package tp4;

public class Compte {
  protected String numero;
  protected String titulaire;
  protected double solde;
  public Compte(String numero,String titulaire,double solde) {
	  this.numero=numero;
	  this.titulaire=titulaire;
	  this.solde=solde;
  }
  public String getnumero() {
	  return numero;
  }
  public String gettitulaire() {
	  return titulaire;
  }
  public double getsolde() {
	  return solde;
  }
  public String setnumero() {
	  return numero;
  }
  public String settitulaire() {
	  return titulaire;
  }
  public double setsolde() {
	  return solde;
  }
  public void deposer(double montant) {
	  solde=solde+montant;
  }
  public void retirer(double montant) {
	  if(montant<=solde) {
		  solde=solde-montant;
	  }
	  else {
		  System.out.println("solde insuffisant");
	  }
  }
  public void afficher() {
	  System.out.println("numero"+numero+"titulaire"+titulaire+"solde"+solde);
  }
}
