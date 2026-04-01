package tp1;
public class CompteBancaire {
   private int numero;
   private String titulaire;
   private double solde;
   private double decouvertAutorise;
   private static int nbCompte=0;
   private static double taux_interet=0.03;
   public CompteBancaire() {
	   this.numero=0;
	   this.titulaire="Unclient";
	   this.solde=0;
	   this.decouvertAutorise=0;
	   nbCompte++;
   }
   public CompteBancaire(String titulaire,double solde,double decouvertAutorise) {
	   nbCompte++;
	   this.numero=nbCompte;
	   this.titulaire=titulaire;
	   this.solde=solde;
   }
   public String getTitulaire() {
	   return titulaire;
   }
   public void setTitulaire(String tituaire) {
	   if(titulaire !=null && !titulaire.isEmpty()) {
		   this.titulaire=titulaire;}
	   else {
		   System.out.println("titulaire vide");
	   }
   }
   public double getDecouvert() {
	   return decouvertAutorise;
   }
   public void setDecouvertAutorise(double decouvertAutorise) {
	   if(decouvertAutorise>=0) {
		   this.decouvertAutorise=decouvertAutorise; 
	   }
	   else {
		   System.out.println("decouvert negatif");
	   }
   }
   public void afficher() {
	   System.out.println("Compt n° "+numero+ "Titulaire: "+titulaire+
			   "Solde : " +solde+ "Découvert autorisé: " +decouvertAutorise);}
   public void deposer(double montant) {
	   if(montant>0) {
		   solde=solde+montant;
	   }
	   else {
		   System.out.println("Montant de depot est invalid");
	   }   
   }
   public void retirer(double montant) {
	   if(montant>0 && solde+decouvertAutorise>=montant) {
		   solde=solde-montant;
	   }
	   else {
		   System.out.println("Retrait refusé");
	   }
   }
   public void virementVers(CompteBancaire autre , double montant) {
	   if(montant>0 && solde+decouvertAutorise>=montant) {
		   this.solde-=montant;
		   autre.deposer(montant);
	   }
	   else {
		   System.out.println("Virement impossible : "
		   		+ "montant ou solde insuffisant.");
	   }
   }
   public double CalculerAvecInterets() {
	   solde=solde+solde*taux_interet;
	   return solde;
   }
   public double CalculerAvecInterets(double bonus) {
	   solde=solde+solde*(taux_interet+bonus);
	   return solde;
   }
   public static double getTauxInteretAnnuel() {
	   return taux_interet;
   }
   public static double getNbComptes() {
	   return nbCompte;
   }
   }


