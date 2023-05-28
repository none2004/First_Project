
public class PropriététaireVoiture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voiture MaVoiture = new Voiture();
		MaVoiture.demarrer();
		MaVoiture.rouler(3);
		MaVoiture.rouler(3);
		System.out.println(MaVoiture.distance);
		MaVoiture.arreter();
		VoitureJames JamesVoiture = new VoitureJames();
		JamesVoiture.rouler(3);
		System.out.println(JamesVoiture.distance);
	}
	

}
