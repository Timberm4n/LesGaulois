package personnages;

public enum Equipement {
	CASQUE("casque"), BOUCLIER("bouclier");

	private String nom;

	private Equipement(String nom) {
		this.nom = nom;
	}

	public void toString(Equipement equipement) {
		System.out.println(equipement.getNom());

	}

	public String getNom() {
		return nom;
	}

}
