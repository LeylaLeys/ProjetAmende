package Service;

import radars.Amende;
import radars.Voiture;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Leys on 25/01/2017.
 */

@WebService
public class SystemeAmendesImpl implements SystemeAmendes {
    public List<Amende> listeAmendesDues = new ArrayList();
    Voiture voiture;

    public Voiture getVoiture (){ return voiture;}
    public void setVoiture(Voiture voiture){
        this.voiture = voiture;
    }

    @Override
    public void enregistrer(Voiture voiture) {
        System.out.println("Voiture enregistrée \n" +
               voiture.getModele()  +
                " possédée par " + voiture.getProprietaire() );
        this.voiture = voiture;
    }

    @Override
    public int signaler(String immatriculation, String modele, int tarif) {
        Amende amende = new Amende(immatriculation, tarif);
        try {
            System.out.println("Amende enregistrée \n" + "n°" + amende.getNumero() +" de " + amende.getTarif() + "EUR pour " + voiture.getProprietaire());
            listeAmendesDues.add(amende);
            return amende.getNumero();
        } catch (Exception e) {
            return -1;
        }
    }


    @Override
    public Amende[] lister(String immatriculation) {
       Amende [] amendes = new Amende[1000];
       for (Amende A : listeAmendesDues)
       {
          int i=0;
          if (A.getImmatriculation().equals(immatriculation));
           {
               amendes[i] = A;
               i++;
           }
       }

       return amendes;

    }

    @Override
    public void payer(int numero, String nom, String prenom) {
        for (Amende A : listeAmendesDues) {
            if (A.getNumero() == numero) ;
            {
                listeAmendesDues.remove(A);
            }
        }
        System.out.println("Amende payée: \n" +
                "n°"+ numero);

    }
}
