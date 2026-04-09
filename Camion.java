package TP3;
public class Camion extends vehicul {
	 private double chargeMax;
	   public Camion(String matricule, String marque, double chargeMax) {
		    super(matricule, marque);
		    this.chargeMax =chargeMax;
		}
	   @Override
	   public void stationner() {
			 System.out.println("Le camion se gare dans une zone pour véhicules lourds.");}
	   @Override
	   public void afficher() {
			super.afficher();
			System.out.println("charge maximale : "+chargeMax);}
}