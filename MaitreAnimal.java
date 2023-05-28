
public class MaitreAnimal {
	public static void main (String[] args) {
		String RéactionAnimal;
		AnimalFamilier monAnimal = new AnimalFamilier();
		monAnimal.manger();
		RéactionAnimal = monAnimal.dire("UwU");
		System.out.println(RéactionAnimal);
		monAnimal.dormir();
	}
}
