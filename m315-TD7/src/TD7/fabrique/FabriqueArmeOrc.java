package TD7.fabrique;

import java.util.HashMap;

import TD7.armes.Arme;

public class FabriqueArmeOrc extends FabriqueArme {
	private HashMap<String, Arme> stock;

	public FabriqueArmeOrc() {
		this.stock = new HashMap<>();
	}

	public HashMap<String, Arme> getStock() {
		return this.stock;
	}

	public void setStock(HashMap<String, Arme> stock) {
		this.stock = stock;
	}

	public Arme createArme(String nom, String type) {
		switch (type) {
		case "EPEE_ORC":
			stock.put(nom, new TD7.armes.Epee_orc());
			break;
		case "BOUCLIER_ORC":
			stock.put(nom, new TD7.armes.Bouclier_orc());
			break;
		}
		return this.stock.get(nom);
	}

	public Arme getArme(String nom) {
		return this.stock.get(nom);
	}
}
