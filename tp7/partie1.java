package tp7;
public class partie1 {
		public static double effectuerPaiement(double montant,double solde) throws Exception {
			if(montant<=0) {
				throw new IllegalArgumentException("le montant doit etre superieur à zero");
			}
			if(montant>solde) {
				throw new Exception("Solde insuffisant pour effectuer le paiement");
			}
			return solde-montant;
		}
		public static double lireMontant(String valeur) {
			
				double montant=Double.parseDouble(valeur);
				if(montant<0) {
					throw new IllegalArgumentException("le montant ne peut pas etre negatif");
				}
				return montant;
		
		}
		public static double lireTransaction(double[] tab, int index) {

		    return tab[index]; }
		
		public static void main(String[] args) {
			double solde=500;
			double montant=-50;
			try {
				double nouveau_solde=effectuerPaiement(montant , solde);
				System.out.println("paiement effectué,votre nouveau solde est"+nouveau_solde);}
			catch(IllegalArgumentException i) {
				System.out.println("montant saisie invalide"+i.getMessage());}
			catch(Exception i) {
				System.out.println("erreur de paiement"+i.getMessage());}
			finally {
				System.out.println("c'est la fin de la transaction ");}
			String texte ="-20";
			try {
				double m=lireMontant(texte);
				System.out.println("montant li: "+m);}
			catch (NumberFormatException e) {
			    System.out.println("Erreur : valeur non numérique");

			} catch (IllegalArgumentException e) {
			    System.out.println("Erreur : " + e.getMessage());

			} catch (Exception e) {
			    System.out.println("Autre erreur : " + e.getMessage());}
			double[] transactions = {100.0, 200.0, 300.0};
			int index = 5;
			try {
			    double t = lireTransaction(transactions, index);
			    System.out.println("Transaction lue : " + t);

			} catch (ArrayIndexOutOfBoundsException e) {
			    System.out.println("Erreur : index invalide (hors limites du tableau)");

			} catch (NullPointerException e) {
			    System.out.println("Erreur : le tableau n'est pas initialisé");

			} catch (Exception e) {
			    System.out.println("Autre erreur : " + e.getMessage());
			}
		}}
			
		
