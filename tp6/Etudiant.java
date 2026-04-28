package tp6;
public class Etudiant {
	int Id;
	 String Nom;
	 double Moyenne;
	public Etudiant(int Id,String Nom,double Moyenne) {
		this.Id=Id;
		this.Nom=Nom;
		this.Moyenne=Moyenne;
	}
	public String toString() {
		return "Etudiant { Id="+Id+", Nom="+Nom+", Moyenne="+Moyenne+"}";
	}
}
	
