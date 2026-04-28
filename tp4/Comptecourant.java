package tp4;

public class Comptecourant extends Compte {
	private double decouvertAutorise;
	public Comptecourant(String numero,String titulaire,double solde,double decouvertAutorise) {
		super(numero,titulaire,solde);
		this.decouvertAutorise=decouvertAutorise;
	}
	public void retirer(double montant) {
		if(solde-montant>=decouvertAutorise) {
			solde-=montant;}
		else {
			System.out.println("impossible de retirer vous avez depasser le decouvert autorisé");
		}}
		public void afficher() {
			super.afficher();
			System.out.println("decouvert autorisé"+decouvertAutorise);}
		}

