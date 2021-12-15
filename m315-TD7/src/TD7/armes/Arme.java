package TD7.armes;

import TD7.sortileges.Sortileges;

public abstract class Arme {

	private int force;
	private int protection;
	private boolean estMagique;

	/**
	 * @param force
	 * @param protection
	 */
	public Arme(int force, int protection) {
		this.force = force;
		this.protection = protection;
	}

	/**
	 * @return the force
	 */
	public int getForce() {
		return force;
	}

	/**
	 * @param force the force to set
	 */
	public void setForce(int force) {
		this.force = force;
	}

	/**
	 * @return the protection
	 */
	public int getProtection() {
		return protection;
	}

	public boolean isEstMagique() {
		return estMagique;
	}

	public void setEstMagique(boolean estMagique) {
		this.estMagique = estMagique;
	}

	/**
	 * @param protection the protection to set
	 */
	public void setProtection(int protection) {
		this.protection = protection;
	}

	public void amplifierArme(int amplification, String attribut) {
		switch (attribut) {
			case "FORCE" + "force":
				this.setForce(this.force + amplification);
				break;
			case "PROTECTION" + "protection":
				this.setProtection(this.protection + amplification);
				break;
			default:
				System.out.println(
						"L'arme ne possède pas cet attribut veuillez améliorer la force ou la protection de l'arme");
				break;
		}
	}

	public void enchanterArme(Sortileges s) {
		this.setEstMagique(true);
		this.setForce(this.getForce()*s.getForce());
		this.setProtection(this.getProtection()*s.getForce());
	}


}
