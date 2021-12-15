package TD7.armes;

public class Bouclier_tauren extends Bouclier{

	public Bouclier_tauren() {
		super();
	}
	
	public int getProtection(){
		super.setProtection(super.getProtection()+2);
		return super.getProtection();
	}
}
