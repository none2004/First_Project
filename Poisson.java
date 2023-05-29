
public class Poisson extends AnimalFamilier {
	int profondeurCourante = 0;
	Poisson(int profondeurCourante){
		this.profondeurCourante = profondeurCourante;
	}
	public int plonger(int combienDePlus) {
		profondeurCourante += combienDePlus;
		if (profondeurCourante > 100) {
			System.out.println("Je suis un petit " 
			        + " poisson et je ne peux pas plonger" 
			        + " plus profond que 100 mètres");
			profondeurCourante -= combienDePlus;
		}
		else {
			System.out.println("plongee de " + combienDePlus + "m");
			System.out.println("Je suis a " + profondeurCourante+"m");
		}
		return profondeurCourante;
	}
	public String dire(String unMot) {
		return "Ne sais-tu pas que les poissons ne parlent pas ?";
	}

}
