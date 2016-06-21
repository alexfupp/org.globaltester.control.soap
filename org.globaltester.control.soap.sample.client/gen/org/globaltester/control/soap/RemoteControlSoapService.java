
package org.globaltester.control.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RemoteControlSoapService", targetNamespace = "http://soap.control.globaltester.org/", wsdlLocation = "http://localhost:8888/globaltester/RemoteControl?wsdl")
public class RemoteControlSoapService
    extends Service
{

    private final static URL REMOTECONTROLSOAPSERVICE_WSDL_LOCATION;
    private final static WebServiceException REMOTECONTROLSOAPSERVICE_EXCEPTION;
    private final static QName REMOTECONTROLSOAPSERVICE_QNAME = new QName("http://soap.control.globaltester.org/", "RemoteControlSoapService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8888/globaltester/RemoteControl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REMOTECONTROLSOAPSERVICE_WSDL_LOCATION = url;
        REMOTECONTROLSOAPSERVICE_EXCEPTION = e;
    }

    public RemoteControlSoapService() {
        super(__getWsdlLocation(), REMOTECONTROLSOAPSERVICE_QNAME);
    }

    public RemoteControlSoapService(WebServiceFeature... features) {
        super(__getWsdlLocation(), REMOTECONTROLSOAPSERVICE_QNAME, features);
    }

    public RemoteControlSoapService(URL wsdlLocation) {
        super(wsdlLocation, REMOTECONTROLSOAPSERVICE_QNAME);
    }

    public RemoteControlSoapService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REMOTECONTROLSOAPSERVICE_QNAME, features);
    }

    public RemoteControlSoapService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RemoteControlSoapService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RemoteControlSoap
     */
    @WebEndpoint(name = "RemoteControlSoapPort")
    public RemoteControlSoap getRemoteControlSoapPort() {
        return super.getPort(new QName("http://soap.control.globaltester.org/", "RemoteControlSoapPort"), RemoteControlSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RemoteControlSoap
     */
    @WebEndpoint(name = "RemoteControlSoapPort")
    public RemoteControlSoap getRemoteControlSoapPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.control.globaltester.org/", "RemoteControlSoapPort"), RemoteControlSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REMOTECONTROLSOAPSERVICE_EXCEPTION!= null) {
            throw REMOTECONTROLSOAPSERVICE_EXCEPTION;
        }
        return REMOTECONTROLSOAPSERVICE_WSDL_LOCATION;
    }

}
