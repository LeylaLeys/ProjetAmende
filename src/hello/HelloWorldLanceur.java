package hello;

import javax.xml.ws.Endpoint;

public class HelloWorldLanceur {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8585/ws/bonjour", new HelloWorldImpl());
    }
}