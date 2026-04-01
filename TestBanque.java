package tp1;

public class TestBanque {
 public static void main(String[] args) {
	 Banque a=new Banque("MarocBank",1500);
	 CompteBancaire c1=new CompteBancaire("assia",3000,500);
	 CompteBancaire c2=new CompteBancaire("Med",6000,700);
	 CompteBancaire c3=new CompteBancaire("soufiane",2000,150);
	 a.ajouterCompte(c1);
	 a.ajouterCompte(c2);
	 a.ajouterCompte(c3);
	 c1.retirer(500);
	 c2.deposer(700);
	 c2.virementVers(c3,200);
	 a.afficherTous();
	 System.out.println("calculer solde avec Interet: "+c2.CalculerAvecInterets());
	 System.out.println("calculer solde avec Interet avec bonnus : "+c2.CalculerAvecInterets(0.015));
	 System.out.println("Nombre total des comptes est :"+CompteBancaire.getNbComptes());
	 System.out.println("Taux d'interet annuel :"+CompteBancaire.getTauxInteretAnnuel());
 }
}
