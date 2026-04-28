package tp6;
public class clientbanque {
	private int Numero;
	private String Nom;
	public  clientbanque(int Numero,String Nom) {
		this.Numero=Numero;
		this.Nom=Nom;
	}
	public int getnumero() {
		return Numero;
	}
	public String getnom() {
		return Nom;
	}
	public int setnumero() {
		return Numero;
	}
	public String setnom() {
		return Nom;
	}
public String toString() {
	return"numero du client: "+Numero+" \nnom du client: "+Nom;
}
}