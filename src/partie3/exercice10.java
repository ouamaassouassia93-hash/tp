package partie3;
import java.util.Scanner;
public class exercice10 {
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("saisir le nombre de ligne: ");
     int m=sc.nextInt();
     System.out.print("saisir le nombre de colonne: ");
     int n=sc.nextInt();
     int[][] t=new int[m][n];
     int[][] tb=new int[n][m];
     for(int i=0;i<m;i++) {
    	   for(int j=0;j<n;j++) {
    		   System.out.print("t["+(i+1)+"]["+(j+1)+"]=");
   		    t[i][j]=sc.nextInt();}}
     System.out.println("le  transposée de cette matrice est ");
     for(int i=0;i<m;i++) {
  	   for(int j=0;j<n;j++) {   
  		   tb[j][i]=t[i][j];}}
     for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
             System.out.println("tb["+(i+1)+"]["+(j+1)+"]="+tb[i][j]);}} 
     sc.close();}}
  
