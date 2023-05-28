
public class AnimalFamilier {
	int âge;
	float poid;
	float taille;
	String couleur;
	String nom;
	public void dormir() {
		System.out.println("Bonne nuit, à demain !");
	}
	public void manger() {
		System.out.println("J'ai si faim… Donne-moi un biscuit !");
	}
	public String dire(String unePhrase) {
		String Réponse = "Ok !! Ok !! " + unePhrase;
		return Réponse;
	}
}
