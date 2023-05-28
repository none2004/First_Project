
public class Voiture {
	int distance;
	public void demarrer() {
		System.out.println("la voiture demarre");
	}
	public void arreter() {
		System.out.println("la voiture s'arrete");
	}
	public int rouler(int durée) {
		distance = distance + durée * 60;
		return distance;
	}
	

}
