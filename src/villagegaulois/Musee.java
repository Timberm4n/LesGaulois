package villagegaulois;

import personnages.Equipement;
import personnages.Gaulois;
import personnages.Trophee;

public class Musee {
	private Trophee[] trophees = new Trophee[200];
	private int nbTrophees =0;

public void donnerTrophees(Gaulois gaulois, Trophee trophee){
	trophees[nbTrophees] = trophee;
	nbTrophees++;
}
}
