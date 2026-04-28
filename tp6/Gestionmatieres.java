package tp6;
import java.util.HashSet;
import java.util.TreeSet;
public class Gestionmatieres {

	public static void main(String[] args) {
		HashSet<String> matiere = new HashSet<>();
		matiere.add("Physique");
		matiere.add("Physique");
		matiere.add("Informatique");
		matiere.add("education");
		matiere.add("base de donné");
		if(matiere.add("Physique")) {
			System.out.println("matiere ajouter avec succées");
		}
		else {
			System.out.println("cette matiere est deja ajouter,c'est un doublon!");
		}
		System.out.println("affichage des matieres:");
		for(String i:matiere) {
			System.out.println(i);
		}
		TreeSet<String> matiere_copier=new  TreeSet<>(matiere);
		System.out.println("affichage des matieres triées par ordre alphabetique:");
		for(String i : matiere_copier) {
			System.out.println(i);
		}

	}

}
