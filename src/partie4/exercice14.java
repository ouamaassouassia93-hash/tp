package partie4;
import java.util.Scanner;
public class exercice14 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("saisir votre chaine de caractere : ");
	  String variable=sc.nextLine();
	  String inverse_variable="";
		 for(int i=variable.length()-1;i>=0;i--) {
			 inverse_variable=inverse_variable+variable.charAt(i);}
		 if(variable.equals(inverse_variable)) {
			 System.out.print("la chaine de caractere est plindrome");}
		 else {
			 System.out.println("la chaine n'est pas plindrome");}
	sc.close();
}}
