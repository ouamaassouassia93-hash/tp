package tp1;
public class Banque {
 private String  nom;
 private CompteBancaire[] comptes;
 private int nbActuels;
  public Banque(String nom , int capaciteMax) {
	  this.nom=nom;
	  comptes=new CompteBancaire[capaciteMax];
	  nbActuels=0;
  }
  public void ajouterCompte(CompteBancaire c) {
	  if(nbActuels<comptes.length) {
		  comptes[nbActuels]=c;
		  nbActuels++;}
	  else {
		  System.out.println("impossible d'ajouter votre comptes");
	  }
  }
  public void afficherTous() {
	  for(int i=0;i<nbActuels;i++) {
		  comptes[i].afficher();
	  }
  }
}
