package tp4;

public class Testerbanque {

	public static void main(String[] args) {
		Compte[] comptes=new Compte[4];
		comptes[0] = new Comptecourant("C001", "Assia", 5000, 1000);
        comptes[1] = new CompteEpargne("E001", "Sara",  0.03);
        comptes[2] = new ComptePremium("P001", "Yassine",3000);
        comptes[3] = new Comptecourant("C002", "Omar", 2000, 500);
		for (Compte c : comptes) {
            c.deposer(500);
            c.retirer(1000);
            c.afficher();
        }	
		System.out.println("Comptes Épargne :");
        for (Compte c : comptes) {
            if (c instanceof CompteEpargne) {
                c.afficher();
            }
        }
        System.out.println("Test Downcasting:");
        Compte c = new CompteEpargne("E002", "Lina", 0.02);

        try {
            Comptecourant cc = (Comptecourant) c;
        } catch (ClassCastException e) {
            System.out.println("impossible de transmettre  un CompteEpargne en CompteCourant");
        }

	}

}
