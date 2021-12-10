package TD7.personnages;


import TD7.armes.Arme;

public class Tauren extends Personnage {
	private int musculation;

	public Tauren(String nom, int musculation) {
		super(nom, new TD7.armes.Bouclier());
		this.musculation = musculation;
	}

	/**
	 * @return the musculation
	 */
	public int getMusculation() {
		return musculation;
	}

	/**
	 * @param musculation the musculation to set
	 */
	public void setMusculation(int musculation) {
		this.musculation = musculation;
	}
	public void recupArme(Arme arme) {
		this.getSac().add(this.getMain());
		this.setMain(arme);
		System.out.println( this.getName()+" a r�cuper� "+arme+" et a rang� " + this.getSac().get(this.getSac().size()-1)+" dans son sac") ;
	}
}
