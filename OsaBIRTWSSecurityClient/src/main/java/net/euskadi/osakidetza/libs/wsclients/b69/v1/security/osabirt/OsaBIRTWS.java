
package net.euskadi.osakidetza.libs.wsclients.b69.v1.security.osabirt;

import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebService(name = "osaBIRTWS", targetNamespace = "http://osakidetza.net/osaBIRT")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OsaBIRTWS {


    /**
     * 
     * @param osabirtparams
     * @return
     *     returns javax.activation.DataHandler
     * @throws OsabirtFault
     */
    @WebMethod
    @WebResult(name = "generatedReport", targetNamespace = "")
    @RequestWrapper(localName = "getReportFromParams", targetNamespace = "http://osakidetza.net/osaBIRT", className = "net.euskadi.osakidetza.libs.wsclients.b69.v1.security.osabirt.GetReportFromParams")
    @ResponseWrapper(localName = "getReportFromParamsResponse", targetNamespace = "http://osakidetza.net/osaBIRT", className = "net.euskadi.osakidetza.libs.wsclients.b69.v1.security.osabirt.GetReportFromParamsResponse")
    public DataHandler getReportFromParams(
        @WebParam(name = "osabirtparams", targetNamespace = "")
        OsaBIRTParams osabirtparams)
        throws OsabirtFault
    ;

    /**
     * 
     * @param osabirtparams
     * @throws OsabirtFault
     */
    @WebMethod
    @RequestWrapper(localName = "printReportFromParams", targetNamespace = "http://osakidetza.net/osaBIRT", className = "net.euskadi.osakidetza.libs.wsclients.b69.v1.security.osabirt.PrintReportFromParams")
    @ResponseWrapper(localName = "printReportFromParamsResponse", targetNamespace = "http://osakidetza.net/osaBIRT", className = "net.euskadi.osakidetza.libs.wsclients.b69.v1.security.osabirt.PrintReportFromParamsResponse")
    public void printReportFromParams(
        @WebParam(name = "osabirtparams", targetNamespace = "")
        OsaBIRTParams osabirtparams)
        throws OsabirtFault
    ;

    /**
     * 
     * @param xmlFile
     * @param osabirtparams
     * @return
     *     returns javax.activation.DataHandler
     * @throws OsabirtFault
     */
    @WebMethod
    @WebResult(name = "generatedReport", targetNamespace = "")
    @RequestWrapper(localName = "getReportFromXML", targetNamespace = "http://osakidetza.net/osaBIRT", className = "net.euskadi.osakidetza.libs.wsclients.b69.v1.security.osabirt.GetReportFromXML")
    @ResponseWrapper(localName = "getReportFromXMLResponse", targetNamespace = "http://osakidetza.net/osaBIRT", className = "net.euskadi.osakidetza.libs.wsclients.b69.v1.security.osabirt.GetReportFromXMLResponse")
    public DataHandler getReportFromXML(
        @WebParam(name = "osabirtparams", targetNamespace = "")
        OsaBIRTParams osabirtparams,
        @WebParam(name = "xmlFile", targetNamespace = "")
        DataHandler xmlFile)
        throws OsabirtFault
    ;

    /**
     * 
     * @param xmlFile
     * @param osabirtparams
     * @throws OsabirtFault
     */
    @WebMethod
    @RequestWrapper(localName = "printReportFromXML", targetNamespace = "http://osakidetza.net/osaBIRT", className = "net.euskadi.osakidetza.libs.wsclients.b69.v1.security.osabirt.PrintReportFromXML")
    @ResponseWrapper(localName = "printReportFromXMLResponse", targetNamespace = "http://osakidetza.net/osaBIRT", className = "net.euskadi.osakidetza.libs.wsclients.b69.v1.security.osabirt.PrintReportFromXMLResponse")
    public void printReportFromXML(
        @WebParam(name = "osabirtparams", targetNamespace = "")
        OsaBIRTParams osabirtparams,
        @WebParam(name = "xmlFile", targetNamespace = "")
        DataHandler xmlFile)
        throws OsabirtFault
    ;

}
