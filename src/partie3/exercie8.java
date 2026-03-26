package partie3;
import java.util.Scanner;
public class exercie8 {
	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int[][] t=new int[3][3];
   System.out.println("Saisir les valeurs de votre matrice");
   for(int i=0;i<3;i++) {
	   for(int j=0;j<3;j++) {
		   System.out.print("t["+(i+1)+"]["+(j+1)+"]=");
		    t[i][j]=sc.nextInt();}}
   System.out.println("affichage des elements");
   for(int i=0;i<3;i++) {
	   for(int j=0;j<3;j++) {
		   System.out.println("element t["+(i+1)+"]["+(j+1)+"]="
		   		+ " "+t[i][j]);}}
	   sc.close();
	   }}
