package tp5;
public  class AbonnementMusique extends Abonnement implements Reducible {
	 protected int nbPlaylists;
	   protected boolean optionOffline;
	   public AbonnementMusique(String name,double prixBase,
			   int nbProfils, int nbPlaylists,boolean optionOffline) {
		   super( name,prixBase,nbProfils);
		   this.nbPlaylists=nbPlaylists;
		   this.optionOffline=optionOffline;
	   }
	   public double calculerCoutMensuel() {
			double total=getPrixBase() ;
			if(optionOffline) {
				total+=15;
			}
			return total;
			}
	   public int calculerSatisfaction() {
			int score=50;
			if(nbPlaylists>20) {
				score+=20;
			}
			if(optionOffline) {
				score+=20;
		}
		 if(getNbProfils()>1) {
			 score+=20;
		 }
		 if(score>100) {
			 score=100;
		 }
		 return score;}
	   public boolean estEligibleReduction(double pourcentage) {
		    return pourcentage<=30;
		    }
		public double AppliquerReduction(double pourcentage) {
			if(pourcentage<=30) {
				return calculerCoutMensuel()*(1-1/pourcentage);}
			else {
				return calculerCoutMensuel();}}
	} 
