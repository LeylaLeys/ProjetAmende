package hello;

/**
 * Created by Leys on 25/01/2017.
 */
import fr.paris10.miage.procs.exercice1.HelloWorld;

import javax.jws.WebService;

@WebService(endpointInterface = "fr.paris10.miage.procs.exercice1.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String bonjour(String name) {
        return "Bonjour "+name+"\n";
    }
}