package e2.evaluation2;

public class Main {
	public static void main(String[] args) {
		
	
	LivreurMoto l1 = new LivreurMoto("liv1", "adil", 10, 4);
	LivreurMoto l2 = new LivreurMoto("liv2", "hamza", 8, 4);
	Livreur [] liv1= {l1,l2};
	Commande c1 = new Commande("comm1", "30km");
	Commande c2 = new Commande("comm2", "20km");
	liv1[1].setResponsable(l1);
	liv1[0].setResponsable(l1);
	liv1[1].setResponsable(l1);
	for(Livreur li1 : liv1) {
		l1.afficherDetails();
		if(!l1.getResponsable().equals(null)) {
			System.out.println( l1.getResponsable());
		}
	}
	Livraison livr1 = new Livraison(30, l1, c2);
	Livraison livr2 = new Livraison(20, l2, c1);
	Livraison livr3 = new Livraison(40, l2, c1);
	Livraison livr4 = new Livraison(50, l1, c2);
	Livraison [] livraison1= {livr1,livr2,livr3,livr4};
	double tout =0;
	for(Livraison i : livraison1 ) {
		i.afficherRecapitulatif();
		tout += i .calculerMontant();
	}
	int comp =0 ;
	for(Livraison a :livraison1) {
		if(!a.l1.getResponsable().equals(null)) {
			comp++;
		}
	}
	System.out.println("le toutal de montant est :"+tout);
	System.out.println("le nombre de livreurs directement supervisés par le premier livreur à moto" +comp);

	}
}
