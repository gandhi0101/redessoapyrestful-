package org.undercloud.jaxws.service;

import javax.xml.ws.Endpoint;

public class SOAPPublisher{

    public void publishWebService() {
        Endpoint.publish("http://localhost:8888/ws/person?wsdl");
    }

    public static void main(String[] args) {
        SOAPPublisher publisher = new SOAPPublisher();
        publisher.publishWebService();
    }
}