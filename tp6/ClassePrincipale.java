package tp6;
import java.util.ArrayList;
import java.util.Comparator;
public class ClassePrincipale {
	public static void main(String[] args) {
		ArrayList<Etudiant> liste= new ArrayList<>();
		liste.add(new Etudiant(1,"karima",17.5));
		liste.add(new Etudiant(2,"Assiya",19.5));
		liste.add(new Etudiant(3,"taha",15.0));
		liste.add(new Etudiant(4,"yassin",14.75));
		liste.add(new Etudiant(5,"leila",13.90));
	for(Etudiant i:liste) {
		System.out.println(i);
	}
	String Nom_rechercher="karima";
	for(Etudiant i:liste) {
		if(i.Nom.equalsIgnoreCase(Nom_rechercher)) {
			System.out.println("Nom trouver!Est:"+Nom_rechercher);
			break;
		}
}
	int id_supprimer=4;
	for(Etudiant i:liste) {
		if(i.Id==id_supprimer) {
			liste.remove(i);
			break;
		}}
	liste.sort(Comparator.comparing(i->i.Moyenne));
	int max=18;
	for(Etudiant i:liste) {
		if(i.Moyenne>max) {
			System.out.println("la meilleur moyenne est"+i.Moyenne);}}
	}}
