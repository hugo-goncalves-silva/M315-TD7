package TD7.personnages;

import TD7.armes.*;

public class Orc extends Personnage {
	private int fureur;

	public Orc(String nom, int fureur) {
		super(nom, new TD7.armes.Epee());
		this.fureur = fureur;
	}

	/**
	 * @return the fureur
	 */
	public int getFureur() {
		return fureur;
	}

	/**
	 * @param fureur the fureur to set
	 */
	public void setFureur(int fureur) {
		this.fureur = fureur;
	}

	public void recupArme(Arme arme) {
		if (arme instanceof Epee_orc) {
			arme.setForce(arme.getForce() * this.fureur);
		} else if (arme instanceof Bouclier_orc) {
			arme.setProtection(fureur * arme.getProtection());
		}
		this.getSac().add(this.getMain());
		this.setMain(arme);
		System.out.println( this.getName()+" a récuperé "+arme+" et a rangé " + this.getSac().get(this.getSac().size()-1)+" dans son sac") ;
	}
}
