package personnages;

import java.util.Iterator;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}

	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	public void afficherVillageois() {
		System.out.println("Dans le village du chef "+chef+" vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- "+villageois[i].getNom());
		}
	}

	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);

//		 Gaulois gaulois = village.trouverHabitant(30); l'indice peut aller de 0 a 29
//		 et pas 30
//		 
		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterHabitant(asterix);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
//		On obtient null car a ce moment rien est decalre dans le tableau d'indice 1 
		Gaulois obelix = new Gaulois("Obélix", 8);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
		
		
		

	}
}
