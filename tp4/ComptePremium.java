package tp4;
public class ComptePremium extends Compte {
    private double plafondRetrait;
    public ComptePremium(String numero,String titulaire,double solde) {
    	super(numero,titulaire,solde);
    	this.plafondRetrait=plafondRetrait;
    }
    public void retirer(double montant) {
    	if(montant>plafondRetrait) {
    		System.out.println("retrait refusé");
    	}
    	else if(montant<=solde) {
    		solde=solde-montant;
    	}
    	else {
    		System.out.println("solde inssufisant");
    	}
    }
}
