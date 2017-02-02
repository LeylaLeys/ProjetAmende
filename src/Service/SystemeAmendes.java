package Service;

import radars.Amende;
import radars.Voiture;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by Leys on 25/01/2017.
 */

public interface SystemeAmendes {
    @WebMethod
    void enregistrer(Voiture voiture);

    @WebMethod
    public int signaler(String immatriculation, String modele, int tarif);

    @WebMethod
    public Amende[] lister (String immatriculation);

    @WebMethod
    void payer(int numero, String nom, String prenom);
}
