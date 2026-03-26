package partie3;
import java.util.Scanner;
public class exercice9 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int[][] t=new int[3][3];
	   System.out.println("Saisir les valeur de votre matrice");
	   for(int i=0;i<3;i++) {
		   for(int j=0;j<3;j++) {
			   System.out.print("t["+(i+1)+"]["+(j+1)+"]=");
			    t[i][j]=sc.nextInt();}}
	   int sum=0;
	   for(int i=0;i<3;i++) {
		   for(int j=0;j<3;j++) {
			   sum=sum+t[i][j];}}
	   System.out.println("la somme des valeurs de"
	   		+ " la matrice  est : "+sum);
sc.close();}}
