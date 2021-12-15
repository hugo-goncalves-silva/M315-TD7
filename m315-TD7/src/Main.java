
import TD7.armes.*;
import TD7.fabrique.*;
import TD7.personnages.*;


public class Main {


	public static void main(String[] args) {
		
		//Création des personnages;
		Personnage Tholfdir = new Orc("Tholfdir",20);
		Personnage Machausset = new Tauren("Machausset",100);
		Personnage Billy = new Elfe("Billy","lente");
		Personnage Julien = new Troll("Julien","lente");
		Personnage azag = new Orc("Azag",5);
		
		Julien.attaquer(Machausset);
		Machausset.attaquer(Tholfdir);
		
		Tholfdir.recupArme(new TD7.armes.Bouclier());
		
		Billy.attaquer(Tholfdir);
		
		FabriqueArme wf = new FabriqueArme();
		FabriqueArmeOrc wf1 = new FabriqueArmeOrc();
		FabriqueArmeTauren wf2 = new FabriqueArmeTauren();
		Arme excalibur = wf.createArme("EPEE", "EXCALIBUR");
		Arme kradul = wf1.createArme("EPEE_ORC", "KRADUL");
		Arme zemmour = wf2.createArme("BOUCLIER_TAUREN", "ZEMMOUR");

		
		
		
		Machausset.recupArme(zemmour);
		azag.recupArme(excalibur);
		azag.recupArme(kradul);
		azag.attaquer(Billy);
		azag.attaquer(Billy);
		
		azag.attaquer(Machausset);
		azag.attaquer(Machausset);
		

		System.out.println(Billy.getVitalite());
	}

}
