package tp6;
import java.util.Scanner;
import java.util.LinkedList;
public class TestClientbanque { 
	public static void main(String[] args) {
		LinkedList<clientbanque> structure=new LinkedList<>();
		structure.addLast(new clientbanque(1,"meriem"));
		structure.addLast(new clientbanque(2,"said"));
		structure.addLast(new clientbanque(3,"moha"));
		structure.addLast(new clientbanque(4,"aissam"));
		structure.addLast(new clientbanque(5,"bouchra"));
		structure.addLast(new clientbanque(6,"mina"));
		structure.addLast(new clientbanque(7,"hiba"));
		structure.addLast(new clientbanque(8,"ayoub"));
		structure.addLast(new clientbanque(9,"jon"));
		System.out.println("l'affichage des clients");
	for(clientbanque i:structure) {
		System.out.println(i);
	}
	clientbanque client_servi=structure.removeFirst();
	structure.addLast(new clientbanque(10,"Soumia"));
	System.out.println("la premier client est:");
	System.out.println(structure.getFirst());
}}
