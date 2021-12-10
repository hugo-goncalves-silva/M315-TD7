package TD7.personnages;

import java.util.ArrayList;

import TD7.armes.Arme;

public abstract class Personnage implements recupArmes{
		private String name;
		private int vitalit�;
		private ArrayList<Arme> sac;
		private Arme main;




	
	/**
		 * @param name
		 * @param sac
		 * @param main
		 * @param force
		 * @param protection
		 */
		public Personnage(String name, Arme main) {
			this.name = name;
			this.sac = new ArrayList<Arme>();
			this.main = main;
			this.vitalit� = 100;
		}







	public void attaquer(Personnage p) {
		int degats;
		if((degats=this.getForce() - p.getProtection())>0) {
			p.vitalit� -= degats;
			System.out.println( "L'utilisateur demande � "+ this.name +" d'attaquer "+p.name+", qui perd "+ degats +" points de vitalit�");
		}else {
			System.out.println( "L'utilisateur demande � "+ this.name +" d'attaquer "+p.name+", cela n'as aucun effet");
		}
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}





	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}





	/**
	 * @return the vitalit�
	 */
	public int getVitalit�() {
		return vitalit�;
	}





	/**
	 * @param vitalit� the vitalit� to set
	 */
	public void setVitalit�(int vitalit�) {
		this.vitalit� = vitalit�;
	}





	/**
	 * @return the sac
	 */
	public ArrayList<Arme> getSac() {
		return sac;
	}





	/**
	 * @param sac the sac to set
	 */
	public void setSac(ArrayList<Arme> sac) {
		this.sac = sac;
	}





	/**
	 * @return the main
	 */
	public Arme getMain() {
		return main;
	}





	/**
	 * @param main the main to set
	 */
	public void setMain(Arme main) {
		this.main = main;
	}





	/**
	 * @return the force
	 */
	public int getForce() {
		return this.main.getForce();
	}





	/**
	 * @param force the force to set
	 */
	public void setForce(int force) {
		this.main.setForce(force);
	}





	/**
	 * @return the protection
	 */
	public int getProtection() {
		return this.main.getProtection();
	}





	/**
	 * @param protection the protection to set
	 */
	public void setProtection(int protection) {
		this.main.setProtection(protection);
	}

}
