package tp6;

public class livre {
	String ISBN;
	String titre;
	String auteur;
    int annee;
	public livre(String ISBN,String titre,String auteur,int annee) {
		this.ISBN=ISBN;
		this.titre=titre;
		this.auteur=auteur;
		this.annee=annee;
	}
	public String toString() {
		return  "livre { ISBN="+ISBN+", titre="+titre+", auteur="+auteur+", annee="+annee+"}";}
}
