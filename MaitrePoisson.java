
public class MaitrePoisson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String RéactionPoisson;
		Poisson monPoisson = new Poisson();
		monPoisson.plonger(2);
		monPoisson.plonger(3);
		monPoisson.dormir();
		monPoisson.manger();
		RéactionPoisson = monPoisson.dire("QUOICOUBEH");
		System.out.println(RéactionPoisson);

	}

}
