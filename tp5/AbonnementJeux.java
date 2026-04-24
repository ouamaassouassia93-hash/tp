package tp5;

public class AbonnementJeux extends Abonnement {
	 protected int nbJeuxInclus ;
	   protected int  heuresJeuParMois;
	   public AbonnementJeux(String name,double prixBase,
			   int nbProfils, int nbJeuxInclus,int  heuresJeuParMois) {
		   super( name,prixBase,nbProfils);
		   this.nbJeuxInclus=nbJeuxInclus;
		   this.heuresJeuParMois=heuresJeuParMois;
	   }
	   public double calculerCoutMensuel() {
			double total=getPrixBase() ;
			if(nbJeuxInclus>50) {
				total+=25;
			}
			if(heuresJeuParMois>40) {
				total+=15;
			}
			return total;
			}
	   public int calculerSatisfaction() {
			int score=40;
			if( nbJeuxInclus>=30) {
				score+=20;
			}
			if( heuresJeuParMois>20) {
				score+=20;
		}
		 if(getNbProfils()>2) {
			 score+=10;
		 }
		 if(score>100) {
			 score=100;
		 }
		 return score;}
}
	
	   
	   
	