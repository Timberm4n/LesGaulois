package personnages;

public class Village {

	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;

	public Village(String nom, int nbVillageoisMaximum) {
		super();
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];

	}

	public Village(String nom) {
		this.nom = nom;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois = nbVillageois + 1;
	}

	public Gaulois trouverHabitant(int numero_villageois) {
		return villageois[numero_villageois];
	}

	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + villageois[0].getNom() + " vivent:\n ");
		for (int i = 1; i < villageois.length; i++) {
			if (villageois[i] != null) {
				System.out.println("- " + villageois[i].getNom() + "\n");
			}
		}
	}

	public static void main(String[] args) {

		Village village = new Village("Village des Irréductibles", 30);

		Gaulois Abraracourcix = new Gaulois("Abraracourcix", 6);
		village.ajouterHabitant(Abraracourcix);

		Gaulois Asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(Asterix);

		Gaulois Obelix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(Obelix);

		village.afficherVillageois();

		// Gaulois gaulois = village.trouverHabitant(30);Cela ne marche pas car le
		// constructeur n'a pas cela comme 1er arg

		// Gaulois gaulois = village.trouverHabitant(1);
		// System.out.println(gaulois);
		// Ici on creer une nouvelle variable gaulois qui est un clone d'asterix

	}

}
