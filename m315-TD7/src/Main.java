
import TD7.armes.*;
import TD7.bataillon.Bataillon;
import TD7.fabrique.*;
import TD7.personnages.*;
import TD7.util.Strategie;


public class Main {


	public static void main(String[] args) {
		
		//Création des personnages;
		Personnage Tholfdir = new Orc("Tholfdir",20);
		Personnage Machausset = new Tauren("Machausset",100);
		Personnage Billy = new Elfe("Billy","lente");
		Personnage Julien = new Troll("Julien","lente");
		Personnage azag = new Orc("Azag",5);
		FabriqueArme wf = new FabriqueArme();
		FabriqueArmeOrc wf1 = new FabriqueArmeOrc();
		FabriqueArmeTauren wf2 = new FabriqueArmeTauren();
		Arme excalibur = wf.createArme("EPEE", "EXCALIBUR");
		Arme kradul = wf1.createArme("EPEE_ORC", "KRADUL");
		Arme zemmour = wf2.createArme("BOUCLIER_TAUREN", "ZEMMOUR");

		Tholfdir.recupArme(new TD7.armes.Bouclier());
		Machausset.recupArme(zemmour);
		azag.recupArme(excalibur);
		azag.recupArme(kradul);


		Julien.attaquer(Machausset);
		Machausset.attaquer(Tholfdir);
		Billy.attaquer(Julien);
		Machausset.attaquer(Julien);
		Billy.attaquer(Tholfdir);
		azag.attaquer(Billy);
		azag.attaquer(Machausset);
		azag.attaquer(Machausset);

		Personnage[] tabPersonnages1 = {Julien,Billy};
		Personnage[] tabPersonnages2 = {azag,Machausset};
		Personnage[] tabPersonnages3 = {Billy,Julien,Tholfdir};
		Bataillon b1 = new Bataillon(tabPersonnages1, Strategie.ForceBrute);
		Bataillon b2 = new Bataillon(tabPersonnages2, Strategie.UnParmiN);
		Bataillon b3 = new Bataillon(tabPersonnages3, Strategie.PasLesPlusFaibles);	

		b1.attaquerBataillon(b2);
		b2.attaquerBataillon(b3);
		b3.attaquerBataillon(b1);
	}

}
