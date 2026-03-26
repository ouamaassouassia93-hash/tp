package  tp0;
import java.util.Scanner;
public class exercice3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("saisir le nombre pour afficher sa table: ");
		int a=sc.nextInt();
		int Mul;
		System.out.println("la table de multiplication est ");
		for(int i=1;i<=10;i++) {
			Mul=a*i;
			System.out.println(a+"*"+i+"="+Mul);}
		sc.close();
}}
