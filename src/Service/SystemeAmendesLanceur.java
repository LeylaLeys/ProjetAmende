package Service;
import javax.xml.ws.Endpoint;

/**
 * Created by Leys on 02/02/2017.
 */
public class SystemeAmendesLanceur {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8585/ws/saam", new SystemeAmendesImpl());
    }
}
