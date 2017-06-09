
package net.euskadi.osakidetza.libs.wsclients.k01.v1.security.pacientesws;

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
@WebServiceClient(name = "PacientesWebService", targetNamespace = "http://xmlns.osakidetza.com/cdc", wsdlLocation = "https://pre.osb.osakidetza.net/osakidetza/negocio/corporativo/cdc/PacientesWebService_v1/PacientesWebServiceWS?wsdl")
public class PacientesWebService
    extends Service
{

    private final static URL PACIENTESWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException PACIENTESWEBSERVICE_EXCEPTION;
    private final static QName PACIENTESWEBSERVICE_QNAME = new QName("http://xmlns.osakidetza.com/cdc", "PacientesWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://pre.osb.osakidetza.net/osakidetza/negocio/corporativo/cdc/PacientesWebService_v1/PacientesWebServiceWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PACIENTESWEBSERVICE_WSDL_LOCATION = url;
        PACIENTESWEBSERVICE_EXCEPTION = e;
    }

    public PacientesWebService() {
        super(__getWsdlLocation(), PACIENTESWEBSERVICE_QNAME);
    }

    public PacientesWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns PacientesPortType
     */
    @WebEndpoint(name = "PacientesPortTypePort")
    public PacientesPortType getPacientesPortTypePort() {
        return super.getPort(new QName("http://xmlns.osakidetza.com/cdc", "PacientesPortTypePort"), PacientesPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PacientesPortType
     */
    @WebEndpoint(name = "PacientesPortTypePort")
    public PacientesPortType getPacientesPortTypePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.osakidetza.com/cdc", "PacientesPortTypePort"), PacientesPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PACIENTESWEBSERVICE_EXCEPTION!= null) {
            throw PACIENTESWEBSERVICE_EXCEPTION;
        }
        return PACIENTESWEBSERVICE_WSDL_LOCATION;
    }

}
