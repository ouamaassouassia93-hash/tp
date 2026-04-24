package tp5;
public abstract class Abonnement {
	private String name;
	private double prixBase;
	private int nbProfils;
 public Abonnement(String name,double prixBase,int nbProfils) {
		 this.prixBase=prixBase;
		 this.name=name;
		 this.nbProfils=nbProfils;
		 if(prixBase<=0) {
			 prixBase=100;
		 }
		 if(nbProfils<=0) {
			 nbProfils=1;
		 }}
		 public String getname() {
			 return name;}
		 public double getPrixBase() {
			 return prixBase;}
		 public int getNbProfils() {
			 return nbProfils;}
		 public void setnom(String name) {
			  this.name=name;
		 }
		 public void setprix(double prixBase) {
			 this.prixBase=prixBase;
		 }
		 public void setProfils(int nbProfils) {
			 this.nbProfils=nbProfils;
		 }
		 public boolean estPartatgeFamilial() {
		  if(nbProfils>=3) {
			  return true;
		  }
		  else {
			  return false;
		  }}
	  public void afficherInfos() {
		  System.out.println(" nom: "+name);
		  System.out.println("pris de base: "+prixBase);
		  System.out.println(" profils: "+nbProfils);
		  System.out.println("Partage familiale: "+estPartatgeFamilial());
	  }
	  public abstract double  calculerCoutMensuel() ;
	public abstract int calculerSatisfaction();}
 

