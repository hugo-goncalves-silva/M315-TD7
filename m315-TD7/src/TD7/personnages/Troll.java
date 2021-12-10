package TD7.personnages;


import TD7.armes.Arme;

public class Troll extends Personnage{
		private String rege;
		
	public Troll(String nom, String rege) {
		super(nom, new TD7.armes.Dague());
		this.rege = rege;
	}
	/**
	 * @return the rege
	 */
	public String getRege() {
		return rege;
	}
	/**
	 * @param rege the rege to set
	 */
	public void setRege(String rege) {
		this.rege = rege;
	}
	public void recupArme(Arme arme) {
		this.getSac().add(this.getMain());
		this.setMain(arme);
		System.out.println( this.getName()+" a récuperé "+arme+" et a rangé " + this.getSac().get(this.getSac().size()-1)+" dans son sac") ;
	}
}
