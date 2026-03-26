package partie4;
import java.util.Scanner;
public class exercice13 {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		  System.out.println("saisir votre chaine de caractere : ");
		  String variable=sc.nextLine();
		  String inverse_variable="";
		 for(int i=variable.length()-1;i>=0;i--) {
			 inverse_variable=inverse_variable+variable.charAt(i);
				 }
		 System.out.println("voila votre chaine de caracetere inversé "
		 		+ ""+inverse_variable);
	sc.close();}}