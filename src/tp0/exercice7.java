package tp0;
import java.util.Scanner;
public class exercice7 {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.print("saisir la taille du tableau:  ");
	  int  N=sc.nextInt();
	   int[] t=new int[N];
	   System.out.println("saisir les element du tableau: ");
	   for(int i=0;i<N;i++) {
		   System.out.print("saisir l'element t["+(i+1)+"]="  );
		   t[i]=sc.nextInt();   
	   }
	   int max=t[0];
	   int indice_max=1;
	   for(int i=0;i<N;i++) {
		   if(t[i]>max) {
			   max=t[i];
			   indice_max=i;}} 
   System.out.println("le plus grand element du tableau est "+max);
   sc.close();
	   }}
	   
   

