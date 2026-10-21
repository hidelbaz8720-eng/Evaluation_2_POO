package e2.evaluation2;

public class LivreurCamion extends Livreur {
	private double tauxMajoration ;

	public LivreurCamion(String identifiant, String nom, double tarifKm,double tauxMajoration) {
		super(identifiant, nom, tarifKm);
		this.tauxMajoration=tauxMajoration;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerFrais(double distance) {
		double MontantBase=tarifKm*distance;
		// TODO Auto-generated method stub
		return MontantBase*(1+tauxMajoration);
	}

}
