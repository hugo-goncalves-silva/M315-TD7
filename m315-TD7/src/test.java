import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import TD7.armes.Arme;
import TD7.armes.Epee;
import TD7.fabrique.FabriqueArme;
import TD7.personnages.Orc;
import TD7.personnages.Personnage;
import junit.framework.Assert;

class test {

	@SuppressWarnings("deprecation")
	@Test
	void test() {

		FabriqueArme wf = new FabriqueArme();
		Arme a = wf.createArme("EPEE", "EXCALIBUR");
		Assert.assertEquals(a,wf.getArme("EXCALIBUR"));
		
		Personnage azag = new Orc("Azag",5);
		Assert.assertTrue(azag.getMain() instanceof Epee);
	}

}
