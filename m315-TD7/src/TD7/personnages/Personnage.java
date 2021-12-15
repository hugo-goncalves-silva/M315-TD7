package TD7.personnages;

import java.util.ArrayList;

import TD7.armes.Arme;
import TD7.util.Cycle;

public abstract class Personnage implements recupArmes{
		private String name;
		private int vitalite;
		private ArrayList<Arme> sac;
		private Arme main;
		private Cycle etat;




	/**
	 * 
	 * @param name
	 * @param main
	 */
		public Personnage(String name, Arme main) {
			this.name = name;
			this.sac = new ArrayList<Arme>();
			this.main = main;
			this.vitalite = 100;
			this.etat = Cycle.Vivant;
		}







	public void attaquer(Personnage p) {
		int degats;
		if(p.getEtat() == Cycle.Faible){
			degats=this.getForce() - (p.getProtection()*(1-1/p.getVitalite()));
		}else if(p.getEtat() == Cycle.Mort){
			System.out.println("L'utilisateur demande à "+ this.name +" d'attaquer "+p.name+", cela n'as aucun effet");
		}else if(p.getEtat() == Cycle.Invincible){
			System.out.println(p.name+" est invincible !");
			System.out.println("L'utilisateur demande à "+ this.name +" d'attaquer "+p.name+", cela n'as aucun effet");
		}else{
			degats=this.getForce() - (p.getProtection());
			if(degats >0 && this.etat != Cycle.Mort && p.getEtat() != Cycle.Mort){
				p.vitalite -= degats;
				System.out.println( "L'utilisateur demande à "+ this.name +" d'attaquer "+p.name+", qui perd "+ degats +" points de vitalité");
				if(p.getVitalite() <= 25 && p.vitalite>0){
					System.out.println(p.name+" est devenu faible !");
					p.setEtat(Cycle.Faible);
				}else if(p.getVitalite()<= 0){
					p.setEtat(Cycle.Mort);
					System.out.println(p.name+" est mort !");
				}
			}else {
				System.out.println( "L'utilisateur demande à "+ this.name +" d'attaquer "+p.name+", cela n'as aucun effet");
			}
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
	public int getVitalite() {
		return vitalite;
	}





	/**
	 * @param vitalit� the vitalit� to set
	 */
	public void setVitalite(int vitalite) {
		this.vitalite = vitalite;
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





	public Cycle getEtat() {
		return etat;
	}







	public void setEtat(Cycle etat) {
		this.etat = etat;
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
