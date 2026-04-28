package tp4;
public class CompteEpargne extends Compte {
	private double tauxInteret;
	public CompteEpargne(String numero,String titulaire,double solde) {
		super(numero,titulaire,solde);
		this.tauxInteret=tauxInteret;
	}
	public void calculerInteret() {
		solde+=solde*tauxInteret;
	}
	public void retirer(double montant) {
		if(montant<=solde) {
			solde=solde-montant;
		}
		else {
			System.out.println("solde insuffisant");
		}
	}

}
