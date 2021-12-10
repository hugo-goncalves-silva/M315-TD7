package TD7.armes;

public class Bouclier_orc extends Bouclier{
	public Bouclier_orc() {
		super();
	}

	public int getProtection() {
		this.setProtection(getProtection()+2);
		return super.getProtection();
	}
}
