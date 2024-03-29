package personnages;

import java.util.Iterator;

import villagegaulois.Musee;

public class Gaulois {
	private String nom;
	private int effetPotion = 1;
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] tropheesRecuperes = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; tropheesRecuperes != null && i < tropheesRecuperes.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = tropheesRecuperes[i];
		}

	}

	public void boirePotion(int forcePotion) {
		effetPotion = effetPotion + forcePotion;
		parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée.");
	}
	
	public void faireUneDonation(Musee musee) {
		if (nbTrophees > 0) {
			parler("Je donne au musee tous mes trophees :");
			for (int i = 0; i < nbTrophees; i++) {
				System.out.println("- "+trophees[i].getNom());
				
				musee.donnerTrophees(this, trophees[i]);
			}
		}
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.parler("Coucou");
		Romain romain1 = new Romain("Romain1", 2);
		asterix.frapper(romain1);
		asterix.boirePotion(1);
	}
}
