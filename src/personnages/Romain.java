package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		assert(force>0);
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force>0 : "la force d�un Romain est positive";
		int forceDebut = force;
		force -= forceCoup;
		if (force > 0) {
			parler("A�e");
		} else {
			parler("J'abandonne...");
		}
		assert forceDebut>force : "la force d�un Romain a diminu�" ;
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);


	}
}
