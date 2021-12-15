package TD7.fabrique;

import TD7.armes.Arme;

public class FabriqueArmeOrc extends FabriqueArme {
	int nbEpee_orc = 0;
	int nbDague_orc = 0;

	public Arme createArme(String type, String nom) {
		switch (type) {
			case "EPEE_ORC":
			if(this.nbEpee_orc>=5){
				System.out.println("CETTE FABRIQUE NE PEUT PLUS FABRIQUER D'EPEES !!!");
			}
				this.getStock().put(nom, new TD7.armes.Epee_orc());
				this.nbEpee_orc++;
				break;
			case "BOUCLIER_ORC":
				this.getStock().put(nom, new TD7.armes.Bouclier_orc());
				break;
			case "DAGUE_ORC":
			if(this.nbDague_orc>=5){
				System.out.println("CETTE FABRIQUE NE PEUT PLUS FABRIQUER DE DAGUES !!!");
			}
				this.getStock().put(nom, new TD7.armes.Dague_orc());
				this.nbDague_orc++;
				break;
		}
		return this.getStock().get(nom);
	}

}
