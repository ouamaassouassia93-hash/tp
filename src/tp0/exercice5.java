package tp0;
import java.util.Scanner;
public class exercice5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   System.out.print("saisir la taille du tableau:  ");
	  int  N=sc.nextInt();
	   int[] t=new int[N];
	   System.out.println("saisir les element du tableau: ");
	   for(int i=0;i<N;i++) {
		   System.out.print("saisir l'element "+(i+1)+":"  );
		   t[i]=sc.nextInt();   
	   }
	   System.out.println("les elements du tableau sont:");
	   for(int i=0;i<N;i++) {
		   System.out.print("element : t["+i+"]"+"=");
		   System.out.print(+t[i]);
		   System.out.println(" ") ; }
	   sc.close();
	}

}
