package TD7.fabrique;

import TD7.armes.Arme;

public class FabriqueArmeTauren extends FabriqueArme {

	public Arme createArme(String type, String nom) {
		switch(type) {
		case "EPEE_TAUREN" :
		if(this.getStock().containsKey(nom)){
			return this.getStock().get(nom);
		}
			this.getStock().put(nom,new TD7.armes.Epee_tauren());
			break;
		case "BOUCLIER_TAUREN":
		this.getStock().put(nom,new TD7.armes.Bouclier_tauren());
			break;
		case "DAGUE_TAUREN":
		if(this.getStock().containsKey(nom)){
			return this.getStock().get(nom);
		}
		this.getStock().put(nom,new TD7.armes.Dague_tauren());
			break;
		}return this.getStock().get(nom);
}

}
