
package net.euskadi.osakidetza.libs.wsclients.b69.v1.security.osabirt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.euskadi.osakidetza.libs.wsclients.b69.v1.security.osabirt package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetReportFromXML_QNAME = new QName("http://osakidetza.net/osaBIRT", "getReportFromXML");
    private final static QName _GetReportFromXMLResponse_QNAME = new QName("http://osakidetza.net/osaBIRT", "getReportFromXMLResponse");
    private final static QName _Birtparams_QNAME = new QName("http://osakidetza.net/osaBIRT", "birtparams");
    private final static QName _PrintReportFromParams_QNAME = new QName("http://osakidetza.net/osaBIRT", "printReportFromParams");
    private final static QName _GetReportFromParams_QNAME = new QName("http://osakidetza.net/osaBIRT", "getReportFromParams");
    private final static QName _PrintReportFromXML_QNAME = new QName("http://osakidetza.net/osaBIRT", "printReportFromXML");
    private final static QName _PrintReportFromParamsResponse_QNAME = new QName("http://osakidetza.net/osaBIRT", "printReportFromParamsResponse");
    private final static QName _OsabirtFault_QNAME = new QName("http://osakidetza.net/osabirt/faults", "OsabirtFault");
    private final static QName _GetReportFromParamsResponse_QNAME = new QName("http://osakidetza.net/osaBIRT", "getReportFromParamsResponse");
    private final static QName _PrintReportFromXMLResponse_QNAME = new QName("http://osakidetza.net/osaBIRT", "printReportFromXMLResponse");
    private final static QName _OsaBIRTFaultBeanStackTrace_QNAME = new QName("", "stackTrace");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.euskadi.osakidetza.libs.wsclients.b69.v1.security.osabirt
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrintReportFromParamsResponse }
     * 
     */
    public PrintReportFromParamsResponse createPrintReportFromParamsResponse() {
        return new PrintReportFromParamsResponse();
    }

    /**
     * Create an instance of {@link PrintReportFromXMLResponse }
     * 
     */
    public PrintReportFromXMLResponse createPrintReportFromXMLResponse() {
        return new PrintReportFromXMLResponse();
    }

    /**
     * Create an instance of {@link GetReportFromParamsResponse }
     * 
     */
    public GetReportFromParamsResponse createGetReportFromParamsResponse() {
        return new GetReportFromParamsResponse();
    }

    /**
     * Create an instance of {@link PrintReportFromParams }
     * 
     */
    public PrintReportFromParams createPrintReportFromParams() {
        return new PrintReportFromParams();
    }

    /**
     * Create an instance of {@link OsaBIRTParams }
     * 
     */
    public OsaBIRTParams createOsaBIRTParams() {
        return new OsaBIRTParams();
    }

    /**
     * Create an instance of {@link GetReportFromParams }
     * 
     */
    public GetReportFromParams createGetReportFromParams() {
        return new GetReportFromParams();
    }

    /**
     * Create an instance of {@link GetReportFromXMLResponse }
     * 
     */
    public GetReportFromXMLResponse createGetReportFromXMLResponse() {
        return new GetReportFromXMLResponse();
    }

    /**
     * Create an instance of {@link GetReportFromXML }
     * 
     */
    public GetReportFromXML createGetReportFromXML() {
        return new GetReportFromXML();
    }

    /**
     * Create an instance of {@link PrintReportFromXML }
     * 
     */
    public PrintReportFromXML createPrintReportFromXML() {
        return new PrintReportFromXML();
    }

    /**
     * Create an instance of {@link RunParamsMap }
     * 
     */
    public RunParamsMap createRunParamsMap() {
        return new RunParamsMap();
    }

    /**
     * Create an instance of {@link OsaBIRTFaultBean }
     * 
     */
    public OsaBIRTFaultBean createOsaBIRTFaultBean() {
        return new OsaBIRTFaultBean();
    }

    /**
     * Create an instance of {@link RunParamType }
     * 
     */
    public RunParamType createRunParamType() {
        return new RunParamType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReportFromXML }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osakidetza.net/osaBIRT", name = "getReportFromXML")
    public JAXBElement<GetReportFromXML> createGetReportFromXML(GetReportFromXML value) {
        return new JAXBElement<GetReportFromXML>(_GetReportFromXML_QNAME, GetReportFromXML.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReportFromXMLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osakidetza.net/osaBIRT", name = "getReportFromXMLResponse")
    public JAXBElement<GetReportFromXMLResponse> createGetReportFromXMLResponse(GetReportFromXMLResponse value) {
        return new JAXBElement<GetReportFromXMLResponse>(_GetReportFromXMLResponse_QNAME, GetReportFromXMLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OsaBIRTParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osakidetza.net/osaBIRT", name = "birtparams")
    public JAXBElement<OsaBIRTParams> createBirtparams(OsaBIRTParams value) {
        return new JAXBElement<OsaBIRTParams>(_Birtparams_QNAME, OsaBIRTParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintReportFromParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osakidetza.net/osaBIRT", name = "printReportFromParams")
    public JAXBElement<PrintReportFromParams> createPrintReportFromParams(PrintReportFromParams value) {
        return new JAXBElement<PrintReportFromParams>(_PrintReportFromParams_QNAME, PrintReportFromParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReportFromParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osakidetza.net/osaBIRT", name = "getReportFromParams")
    public JAXBElement<GetReportFromParams> createGetReportFromParams(GetReportFromParams value) {
        return new JAXBElement<GetReportFromParams>(_GetReportFromParams_QNAME, GetReportFromParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintReportFromXML }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osakidetza.net/osaBIRT", name = "printReportFromXML")
    public JAXBElement<PrintReportFromXML> createPrintReportFromXML(PrintReportFromXML value) {
        return new JAXBElement<PrintReportFromXML>(_PrintReportFromXML_QNAME, PrintReportFromXML.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintReportFromParamsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osakidetza.net/osaBIRT", name = "printReportFromParamsResponse")
    public JAXBElement<PrintReportFromParamsResponse> createPrintReportFromParamsResponse(PrintReportFromParamsResponse value) {
        return new JAXBElement<PrintReportFromParamsResponse>(_PrintReportFromParamsResponse_QNAME, PrintReportFromParamsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OsaBIRTFaultBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osakidetza.net/osabirt/faults", name = "OsabirtFault")
    public JAXBElement<OsaBIRTFaultBean> createOsabirtFault(OsaBIRTFaultBean value) {
        return new JAXBElement<OsaBIRTFaultBean>(_OsabirtFault_QNAME, OsaBIRTFaultBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReportFromParamsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osakidetza.net/osaBIRT", name = "getReportFromParamsResponse")
    public JAXBElement<GetReportFromParamsResponse> createGetReportFromParamsResponse(GetReportFromParamsResponse value) {
        return new JAXBElement<GetReportFromParamsResponse>(_GetReportFromParamsResponse_QNAME, GetReportFromParamsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintReportFromXMLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osakidetza.net/osaBIRT", name = "printReportFromXMLResponse")
    public JAXBElement<PrintReportFromXMLResponse> createPrintReportFromXMLResponse(PrintReportFromXMLResponse value) {
        return new JAXBElement<PrintReportFromXMLResponse>(_PrintReportFromXMLResponse_QNAME, PrintReportFromXMLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "stackTrace", scope = OsaBIRTFaultBean.class)
    public JAXBElement<String> createOsaBIRTFaultBeanStackTrace(String value) {
        return new JAXBElement<String>(_OsaBIRTFaultBeanStackTrace_QNAME, String.class, OsaBIRTFaultBean.class, value);
    }

}
