package TD7.bataillon;

import java.util.Random;
import java.util.Scanner;
import TD7.personnages.Personnage;
import TD7.util.Strategie;

public class Bataillon {
    public Personnage[] personnages;
    public Strategie strategie;

    public Bataillon(Personnage[] personnages, Strategie strategie) {
        this.personnages = personnages;
        this.strategie = strategie;
    }

    public void attaquerBataillon(Bataillon defense) {
        if (this.strategie == Strategie.ForceBrute) {
            for (int i = 0; i < personnages.length; i++) {
                for (int j = 0; j < defense.getPersonnages().length; j++) {
                    personnages[i].attaquer(defense.personnages[j]);
                }
            }
        } else if (this.strategie == Strategie.UnParmiN) {
            Random r = new Random();
            for (int i = 0; i < personnages.length; i++) {
                personnages[i].attaquer(defense.personnages[r.nextInt(defense.personnages.length)]);
            }
        } else {
            Scanner Scan_Vitalite = new Scanner(System.in);
            System.out.println("\nEntrez la vitalité maximum de vos cibles !\n");
            double Vitalite_Max = Scan_Vitalite.nextInt();
            Scan_Vitalite.close();
            Personnage[] ciblesDefense = new Personnage[defense.personnages.length];
            int indice = 0;

            for (int i = 0; i < defense.personnages.length; i++) {
                if (defense.personnages[i].getVitalite() <= Vitalite_Max) {
                    ciblesDefense[indice] = defense.personnages[i];
                    indice++;
                }
            }

            Random r = new Random();
            for (int i = 0; i < personnages.length; i++) {
                personnages[i].attaquer(ciblesDefense[r.nextInt(ciblesDefense.length)]);
            }

        }
    }

    public Personnage[] getPersonnages() {
        return personnages;
    }

    public void setPersonnages(Personnage[] personnages) {
        this.personnages = personnages;
    }

    public Strategie getStrategie() {
        return strategie;
    }

    public void setStrategie(Strategie strategie) {
        this.strategie = strategie;
    }

}
