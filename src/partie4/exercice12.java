package partie4;
import java.util.Scanner;
public class exercice12 {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	  System.out.println("saisir votre chaine de caractere : ");
	  String variable=sc.nextLine();
	  int nbr_voyelle=0;
	  for(int i=0;i<variable.length();i++) {
		  if(variable.charAt(i)=='a'||variable.charAt(i)=='e'
				  ||variable.charAt(i)=='i'||
				  variable.charAt(i)=='o'||variable.charAt(i)=='u'
				  ||variable.charAt(i)=='y') {
	  nbr_voyelle=nbr_voyelle+1;}}
	  System.out.println("le nombre de voyelle de votre chaine"
	  		+ " de caractere est"+nbr_voyelle);
	  
	  sc.close();
 }
}
