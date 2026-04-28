package tp6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
public class MiniProjet {
	public static void main(String[] args) {
		ArrayList<livre> Book=new ArrayList<>();
        Book.add(new livre("978-3-447-1122-6","Mathématiques pour Débutants",
        		"Dr. Yassine Ouali",2022));
        Book.add(new livre("978-1-5597-9988-3","Introduction à la Programmation Java",
        		"Karim El Idrissi",2020));
        Book.add(new livre("978-0-141-55678-2","Histoire des Civilisations Africaines",
        		"Nadia K. Mbarek",2017));
        Book.add(new livre(" 978-2-8404-1234-1","Les Secrets du Désert",
        		"Amal Benyoussef",2018));
        Book.add(new livre(" 978-0-3304-5678-9","L’Ombre du Vent Chaud","Sofia Rahmani", 2015));
        HashSet<String> categorie=new HashSet<>();
        categorie.add("scientifique");
        categorie.add("Historique");
        categorie.add("Fantastique");
        categorie.add("Informatique");
        categorie.add("Biographie");
        HashMap<String,String> etudiant_associe=new HashMap<>();
        etudiant_associe.put("Assiya","Mathématiques pour Débutants" );
        String livre_rechercher="978-0-0000-0000-1";
        System.out.println("rechercher le livre "+livre_rechercher);
        boolean livre_trouver=false;
        for(livre i:Book) {
        	if(i.ISBN.equals(livre_rechercher)) {
        		System.out.println("ce livre est dans la list");
        		livre_trouver=true;
        		break;
        	}}
        if(!livre_trouver) {
        	System.out.println("ce livre n'existe pas");
        }
        	livre oui_supprimer=null;
        	 String livre_supprimer="978-1-5597-9988-3";
        	 System.out.println("rechercher pour supprimer le livre"+livre_supprimer);
             for(livre i:Book) {
             	if(i.ISBN.equals(livre_supprimer)) {
             	oui_supprimer=i;
             	break;
             	}   
        }
             if(oui_supprimer!=null) {
            	 Book.remove(oui_supprimer);
            	 System.out.println("livre n'est pas dans la liste");
             }
             System.out.println("affichage de la liste des livres disponible");
             for(livre i:Book) {
            	 System.out.println(i); 
             }
             System.out.println("generer un rapport final");
             System.out.println("nombre de livre disponibile: "+Book.size());
             System.out.println("nombre de categorie diponible: "+categorie.size());
             System.out.println("nombre de livre emprunté: "+etudiant_associe.size());
}}