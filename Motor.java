package TP3;
public class Motor extends vehicul {
   private boolean avecCasque;
   public Motor(String matricule, String marque, boolean avecCasque) {
	    super(matricule, marque);
	    this.avecCasque = avecCasque;
	}
   @Override
   public void stationner() {
		 System.out.println("La moto se gare dans une place réservée aux deux roues");}
   @Override
   public void afficher() {
		super.afficher();
		System.out.println("Avec casque : "+avecCasque);}
}
