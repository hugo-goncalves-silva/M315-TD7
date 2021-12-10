package TD7.armes;

public abstract class Arme {
	
	private int force;
	private int protection;
	
	
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

	/**
	 * @param protection the protection to set
	 */
	public void setProtection(int protection) {
		this.protection = protection;
	}

}
