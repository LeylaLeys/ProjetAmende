package Client;

import Service.SystemeAmendes;
import radars.Personne;
import radars.Voiture;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * Created by Leys on 02/02/2017.
 */
public class SystemeAmendeClient {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8585/ws/saam?wsdl");
        QName qname = new QName("http://Service/", "SystemeAmendesImplService");
        QName qport = new QName( "http://Service/", "SystemeAmendesImplPort");

        Service service = Service.create(url, qname);

        SystemeAmendes systemeAmendes = service.getPort(qport, SystemeAmendes.class);

        Personne p1 = new Personne("Sponge","Bob", "Paris");
        Personne p2 = new Personne("Haddock", "Capitaine","Toulouse");

        Voiture v1 = new Voiture("AB 123 CD","CLIO 3");
        Voiture v2 = new Voiture("AB 124 CD", "PUNTO");

        v1.setProprietaire(p1);
        v2.setProprietaire(p2);

        systemeAmendes.enregistrer(v1);
        systemeAmendes.enregistrer(v2);

       int num1 = systemeAmendes.signaler(v1.getImmatriculation(), v1.getModele(), 90);
       int num2 = systemeAmendes.signaler(v2.getImmatriculation(), v2.getModele(), 140);

        systemeAmendes.payer(num1,p1.getNom(), p1.getPrenom());

    }
}
