package e2.evaluation2;

public abstract class Livreur {
	protected String identifiant ;
	protected String nom  ;
	protected double tarifKm  ;
	private Livreur responsable;
	

	public Livreur getResponsable() {
		return responsable;
	}

	  public void setResponsable(Livreur responsable) {
        if (responsable == this) {
            System.out.println("Erreur : un livreur ne peut pas être son propre responsable.");
            return;
        }
	public Livreur(String identifiant, String nom, double tarifKm) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.tarifKm = tarifKm;
	}
	public String getIdentifiant() {
		return identifiant;
	}
	public String getNom() {
		return nom;
	}
	public abstract double calculerFrais(double distance);
	public void afficherDetails() {
		System.out.println("le id :"+this.identifiant+"le nom de Livreur:"+this.nom+"le tarifKm"+this.tarifKm);
	}
	
	

}
