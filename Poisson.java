
public class Poisson extends AnimalFamilier {
	int profondeurCourante = 0;
	public int plonger(int combienDePlus) {
		profondeurCourante = profondeurCourante + combienDePlus;
		System.out.println("plongee de " + combienDePlus + "m");
		System.out.println("Je suis a " + profondeurCourante+"m");
		return profondeurCourante;
	}
	public String dire(String unMot) {
		return "Ne sais-tu pas que les poissons ne parlent pas ?";
	}

}
