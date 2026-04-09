package TP3;
public class Voiture extends vehicul {
	private int nbPortes;
public Voiture(String matricule,String marque,int nbPortes) {
	super(matricule,marque);
	this.nbPortes=nbPortes;
	}
@Override
public void stationner() {
	 System.out.println("La voiture se gare dans une place standard.");}

public void afficher() {
	super.afficher();
	System.out.println("nombres de portes est: " +nbPortes);
}}