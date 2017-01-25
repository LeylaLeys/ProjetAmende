package Service;

import radars.Amende;
import radars.Voiture;

import java.util.ArrayList;

/**
 * Created by Leys on 25/01/2017.
 */
public class SystemeAmendesImpl implements SystemeAmendes {
    Amende amende;
    Voiture voiture;

    public Voiture getVoiture (){ return voiture;}
    public void setVoiture(Voiture voiture){
        this.voiture = voiture;
    }

    @Override
    public void enregistrer(Voiture voiture) {
        this.voiture = voiture;
    }

    @Override
    public int signaler(String immatriculation, String modele, int tarif) {
        Amende amende = new Amende(immatriculation, tarif);
        try {
            System.out.println("Vous avez commis une faute");
            return amende.getNumero();
        } catch (Exception e) {
            return -1;
        }
    }


    @Override
    public Amende[] lister(String immatriculation) {
      /*  Voiture voitureSignaled = this.getVoiture();
        Amende [] amendes = new Amende[];
        */
        return new Amende[0];

    }

    @Override
    public void payer(int numero, String nom, String prenom) {

    }
}
