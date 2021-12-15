package TD7.fabrique;
import java.util.HashMap;
import TD7.armes.*;

public class FabriqueArme {
	private HashMap<String,Arme> stock;

	public FabriqueArme() {
		this.stock = new HashMap<>();
	}

	public HashMap<String,Arme> getStock(){
		return this.stock;
	}
	public void setStock(HashMap<String,Arme> stock ){
		this.stock = stock;
	}
	
	public Arme createArme(String type, String nom) {
		switch(type) {
		case "EPEE" :
			stock.put(nom, new TD7.armes.Epee());
			break;
		case "BOUCLIER":
			stock.put(nom,new TD7.armes.Bouclier());
			break;
		case "DAGUE":
			stock.put(nom,new TD7.armes.Dague());
			break;
		}
		return this.stock.get(nom);
	}
	
	public Arme getArme(String nom) {
		return this.stock.get(nom);
	}
}
