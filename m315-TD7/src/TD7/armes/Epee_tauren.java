package TD7.armes;

public class Epee_tauren extends Epee{

	public Epee_tauren() {
		super();
	}
	
	public int getForce() {
		this.setForce(getForce()-1);
		return super.getForce();
	}

}
