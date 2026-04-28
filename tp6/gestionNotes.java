package tp6;
import java.util.HashMap;
public class gestionNotes {
	public static void main(String[] args) {
   HashMap<String,Double> notes=new HashMap<>();
   notes.put("Samira",12.3);
   notes.put("Fatiha",14.7);
   notes.put("khadija",19.95);
   notes.put("moujahid",18.5);
   notes.put("hassan",16.57);
   notes.put("youssef",19.00);
   notes.put("ali",17.89);
   System.out.println("la liste des etudiants avec leurs notes est:");
   for(String i:notes.keySet()) {
	   Double j=notes.get(i);
	     System.out.println("Nom:"+i+"\nnote:"+j);
		   }
   System.out.println("rechercher la note d'un etudiant");
   String nom_chercher="moujahid";
   if(notes.containsKey(nom_chercher)) {
	   System.out.println("la note de " +nom_chercher+  "  est: "+notes.get(nom_chercher));
   }
   else {
	   System.out.println("ce/cettte etudiant n'est  pas dans la liste");
   }
   System.out.println("modifier la note d'un etudiant:");
   String nom_modifier="Samira";
   if(notes.containsKey(nom_modifier)) {
	  double nouvelle_note=notes.put(nom_modifier, 10.7);
	   System.out.println("la nouvelle note de "  +nom_modifier+ " est: " +nouvelle_note);
   }

   String etudiant_supprimer="hassan";
   if(notes.containsKey(etudiant_supprimer)) {
	   notes.remove(etudiant_supprimer);
   }
   System.out.println("la liste apres suppression de l'etudiant  "  +etudiant_supprimer+  "  est : ");
   for(String i:notes.keySet()) {
	   Double j=notes.get(i);
	     System.out.println("Nom:"+i+"\nnote:"+j);}
   
   double somme=0;
   for(String r:notes.keySet()) {
	   double k=notes.get(r);
	   somme=somme+k;
   }
   double moyenne=somme/notes.size();
   System.out.println("Moyenne générale:  " + moyenne);
}}
