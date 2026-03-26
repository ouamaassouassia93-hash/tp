package tp0;
import java.util.Scanner;
public class exercice6 {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int[] t=new int[10];
	 System.out.println("entrer les elements du tableau");
	 for(int i=0;i<10;i++) {
		 System.out.print("element t["+(i+1)+"]= ");
		 t[i]=sc.nextInt();}
	 System.out.print("saisir le nombre que vous voulez rechercher");
	 int valeur_rechercher=sc.nextInt();
	 int indice_valeur_rechercher=-100;
	for(int i=0;i<10;i++) {
		if(t[i]==valeur_rechercher) {
			indice_valeur_rechercher=i+1;
			break;}}
	if(indice_valeur_rechercher!= -100) {
	    System.out.println("La position de la valeur recherchée est : "
	    		+ "" + indice_valeur_rechercher);
	} else {
	    System.out.println("La valeur que vous recherchez"
	    		+ " n'existe pas dans le tableau.");
	}
		sc.close();}}

	 

