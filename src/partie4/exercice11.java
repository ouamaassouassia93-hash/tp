package partie4;
import java.util.Scanner;
public class exercice11 {
  public static void main(String[] main) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("saisir votre chaine de caractere : ");
	  String variable=sc.nextLine();
	  int longeur=variable.length();
	  System.out.println("la taile de votre chaine "
	  		+ "de caractere est :"+longeur);
	  sc.close();}}
 