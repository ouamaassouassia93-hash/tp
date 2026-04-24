package tp5;
public class TestAbonnement {

	public static void main(String[] args) {
		Abonnement[] abonnement=new Abonnement[3];
		abonnement[0]=new AbonnementVideo("youtube",150,4,true,false);
		abonnement[1]=new AbonnementMusique("play musique",250,4,5
				,false);
		abonnement[2]=new AbonnementJeux("jeux video",50,4,6,7);
		System.out.println("les informations , "
				+ "cout mensuel, le score :");
		for(int i=0;i<3;i++) {
			abonnement[i].afficherInfos();
			System.out.println("Cout mensuel : "
			+abonnement[i].calculerCoutMensuel());
			System.out.println("Score : "
			+abonnement[i].calculerSatisfaction());}
		Reducible[] reduction=new Reducible[2];
		reduction[0]=(Reducible) abonnement[0];
		reduction[1]=(Reducible) abonnement[1];
		System.out.println("reduire abonnements");
		for(int i=0;i<2;i++) {
			 System.out.println(reduction[i].getClass().getSimpleName()+
					 "Réduction 20% : "
		+reduction[i].AppliquerReduction(20));
			 System.out.println(reduction[i].getClass().getSimpleName()+
					 "Réduction 20% : "
		+reduction[i].AppliquerReduction(50));}
	}}
		
