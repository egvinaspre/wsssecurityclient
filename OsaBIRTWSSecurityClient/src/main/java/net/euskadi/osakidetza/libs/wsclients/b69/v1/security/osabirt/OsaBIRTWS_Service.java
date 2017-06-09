
package net.euskadi.osakidetza.libs.wsclients.b69.v1.security.osabirt;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "osaBIRTWS", targetNamespace = "http://osakidetza.net/osaBIRT", wsdlLocation = "https://pre.osb.osakidetza.net/osakidetza/infraestructura/corporativo/osabirt/osaBIRT_v1/osaBIRTWS?WSDL")
public class OsaBIRTWS_Service
    extends Service
{

    private final static URL OSABIRTWS_WSDL_LOCATION;
    private final static WebServiceException OSABIRTWS_EXCEPTION;
    private final static QName OSABIRTWS_QNAME = new QName("http://osakidetza.net/osaBIRT", "osaBIRTWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://pre.osb.osakidetza.net/osakidetza/infraestructura/corporativo/osabirt/osaBIRT_v1/osaBIRTWS?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OSABIRTWS_WSDL_LOCATION = url;
        OSABIRTWS_EXCEPTION = e;
    }

    public OsaBIRTWS_Service() {
        super(__getWsdlLocation(), OSABIRTWS_QNAME);
    }

    public OsaBIRTWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns OsaBIRTWS
     */
    @WebEndpoint(name = "osaBIRTWSPort")
    public OsaBIRTWS getOsaBIRTWSPort() {
        return super.getPort(new QName("http://osakidetza.net/osaBIRT", "osaBIRTWSPort"), OsaBIRTWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OsaBIRTWS
     */
    @WebEndpoint(name = "osaBIRTWSPort")
    public OsaBIRTWS getOsaBIRTWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://osakidetza.net/osaBIRT", "osaBIRTWSPort"), OsaBIRTWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OSABIRTWS_EXCEPTION!= null) {
            throw OSABIRTWS_EXCEPTION;
        }
        return OSABIRTWS_WSDL_LOCATION;
    }

}
