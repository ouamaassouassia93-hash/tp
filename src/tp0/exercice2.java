package  tp0;
import java.util.Scanner;
public class exercice2 {
	public static void main(String[] args) {
		Scanner lire=new Scanner(System.in);
		System.out.print("Saisir le premier nombre :  ");
		int a=lire.nextInt();
		System.out.print("Saisir le deusieme nombre:   ");
		int b=lire.nextInt();
		System.out.print("Saisir le troisieme nombre :  ");
		int c=lire.nextInt();
        if(a>b && a>c) {
        	System.out.println("le plus grand est "+a);
        }
        if(b>a && b>c) {
        	System.out.println("le plus grand est "+b);
        }
        if(c>a && c>b) {
        	System.out.println("le plus grand est  "+c);
        }
        lire.close();
	}
}
