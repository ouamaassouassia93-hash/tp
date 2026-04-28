package tp6;
import java.util.Map;
import java.util.TreeMap;
public class treemaps {
	public static void main(String[] args) {
		TreeMap<Integer,String> etudiant = new TreeMap<>();
		etudiant.put(300, "khadjo");
		etudiant.put(250, "maha");
		etudiant.put(2300, "dihiya");
		etudiant.put(200, "fadma");
		etudiant.put(201, "basslam");
		etudiant.put(100, "lunis");
		etudiant.put(103, "boujmaa");
		etudiant.put(80, "houria");
		etudiant.put(760, "nouhaila");
 System.out.println("afficher la liste des etudiants triée automatiquement ");
 for(Map.Entry<Integer,String> i:etudiant.entrySet()) {
	 System.out.println("\nnom: " +i.getValue() + "\nnumero: "+i.getKey());
 }
 System.out.println("le premier etudiant est:\n "+etudiant.firstEntry());
 System.out.println("le dernier etudiant est:\n "+etudiant.lastEntry());
 System.out.println("Étudiants avec numéro > 100 : ");
 Map<Integer,String> etudiant_sup_100=etudiant.tailMap(101);
 for(Map.Entry<Integer,String> i:etudiant_sup_100.entrySet()) {
	 System.out.println("\nnom : " + i.getValue() + " ,numero :" + i.getKey());
 }
	}

}
