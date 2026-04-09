package TP3;
public class TestParking {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    vehicul[] v=new vehicul[4];
    v[0]=new Voiture("26H06","Audi",4);
    v[1]=new Voiture("56Z45","Mercedes",5);
    v[2]=new Motor("23P89","C90",true);
    v[3]=new Camion("02A01","Tmax",17.5);
    for(int i=0;i<v.length;i++) {
    	v[i].afficher();
    	v[i].stationner();}
    for(int i=0;i<v.length;i++) {
    	if(v[i] instanceof Voiture)
    	v[i].afficher();}
    vehicul x = new Motor("11C22", "Yamaha", true);
    if (x instanceof Voiture) {
        Voiture v1 = (Voiture) x;
        System.out.println("Downcasting réussi");}
     else {
        System.out.println("erreur de Downcasting x n'est pas une Voiture");}
	}}
    
    