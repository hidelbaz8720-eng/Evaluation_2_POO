package e2.evaluation2;

public class LivreurMoto extends Livreur{
	private int anciennete;

	public LivreurMoto(String identifiant, String nom, double tarifKm,int anciennete) {
		super(identifiant, nom, tarifKm);
		this.anciennete=anciennete;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerFrais(double distance) {
		if(anciennete < 3) {
			return tarifKm *distance;
		}
		if(anciennete >= 3) {
			return ((tarifKm+2) *distance);
		}
		// TODO Auto-generated method stub
		return 0;
	}

}
