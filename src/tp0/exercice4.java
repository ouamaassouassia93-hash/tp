package tp0;
import java.util.Scanner;
public class exercice4 {
  public static void main(String[] args) {
	  System.out.println("saisir le dernier entiers:   ");
	  Scanner sc=new Scanner(System.in);
	  int N=sc.nextInt();
	  int i=0;
	  int S=0;
	  while (i<=N) {
		  S=S+i;
		  i++;
	  }
	  System.out.println("la somme des entiers "+S);
	  
  }
}
