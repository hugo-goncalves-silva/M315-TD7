package TD7.fabrique;

import java.util.HashMap;

import TD7.armes.Arme;

public class FabriqueArmeTauren extends FabriqueArme{
	private HashMap<String,Arme> stock;
	
	public FabriqueArmeTauren() {
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
		case "EPEE_TAUREN" :
			stock.put(nom,new TD7.armes.Epee_tauren());
			break;
		case "BOUCLIER_TAUREN":
			stock.put(nom,new TD7.armes.Bouclier_tauren());
			break;
		}
		return this.stock.get(nom);
	}	
	
	public Arme getArme(String nom) {
		return this.stock.get(nom);
	}
	
}
