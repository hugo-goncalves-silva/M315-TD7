package TD7.personnages;


import TD7.armes.Arme;

public class Elfe extends Personnage{
	private String acuite;
	
	public Elfe(String nom,String acuite ) {
		super(nom, new TD7.armes.Epee());
		this.acuite = acuite;
	}

	/**
	 * @return the acuite
	 */
	public String getAcuite() {
		return acuite;
	}

	/**
	 * @param acuite the acuite to set
	 */
	public void setAcuite(String acuite) {
		this.acuite = acuite;
	}

	public void recupArme(Arme arme) {
		this.getSac().add(this.getMain());
		this.setMain(arme);
		System.out.println( this.getName()+" a récuperé "+arme+" et a rangé " + this.getSac().get(this.getSac().size()-1)+" dans son sac") ;
	}
}
