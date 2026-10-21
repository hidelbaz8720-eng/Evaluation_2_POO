package e2.evaluation2;

public class Livraison {
	private double distance ;
	Livreur l1;
	Commande c1;
	public Livraison(double distance, Livreur l1, Commande c1) {
		super();
		this.distance = distance;
		this.l1 = l1;
		this.c1 = c1;
	}
	public double calculerMontant() {
		return l1.calculerFrais(this.distance);
	}
	
	public void afficherRecapitulatif() {
		System.out.println("Livraison a un distance=" + distance +"livreur nom " + l1.nom+"livreur id :  "+l1.identifiant +"livreur tarif"+l1.tarifKm+"les information des commande est :"+c1.toString()); 
	}
	

}
