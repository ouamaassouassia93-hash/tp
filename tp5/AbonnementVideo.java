package tp5;
public class AbonnementVideo extends Abonnement implements Reducible{
   protected boolean optionHD;
   protected boolean option4K;
   public AbonnementVideo(String name,double prixBase,
		   int nbProfils, boolean optionHD,boolean option4K) {
	   super( name,prixBase,nbProfils);
	   this.optionHD=optionHD;
	   this.option4K=option4K;
   }
	public double calculerCoutMensuel() {
		double total=getPrixBase() ;
		if(optionHD) {
			total+=10;
		}
		if(option4K) {
			total+=20;
		}
		return total;
		}
	public int calculerSatisfaction() {
		int score=60;
		if(optionHD) {
			score+=10;
		}
		if(option4K) {
			score+=20;
	}
	 if(getNbProfils()>=4) {
		 score+=10;
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
