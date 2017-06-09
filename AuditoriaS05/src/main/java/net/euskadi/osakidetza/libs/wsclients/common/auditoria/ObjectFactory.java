package net.euskadi.osakidetza.libs.wsclients.common.auditoria;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.osakidetza.soa.auditoria package. 
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

    private final static QName _CodigoAplicacion_QNAME = new QName("http://osakidetza.net/soa/auditoria", "codigo-aplicacion");
    private final static QName _DniPaciente_QNAME = new QName("http://osakidetza.net/soa/auditoria", "dni-paciente");
    private final static QName _CicLogin_QNAME = new QName("http://osakidetza.net/soa/auditoria", "cic-login");
    private final static QName _TisLogin_QNAME = new QName("http://osakidetza.net/soa/auditoria", "tis-login");
    private final static QName _TisPaciente_QNAME = new QName("http://osakidetza.net/soa/auditoria", "tis-paciente");
    private final static QName _CicPaciente_QNAME = new QName("http://osakidetza.net/soa/auditoria", "cic-paciente");
    private final static QName _DniLogin_QNAME = new QName("http://osakidetza.net/soa/auditoria", "dni-login");
    private final static QName _Timestamp_QNAME = new QName("http://osakidetza.net/soa/auditoria", "timestamp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.osakidetza.soa.auditoria
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Auditoria }
     * 
     */
    public Auditoria createAuditoria() {
        return new Auditoria();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osakidetza.net/soa/auditoria", name = "codigo-aplicacion")
    public JAXBElement<String> createCodigoAplicacion(String value) {
        return new JAXBElement<String>(_CodigoAplicacion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osakidetza.net/soa/auditoria", name = "dni-paciente")
    public JAXBElement<String> createDniPaciente(String value) {
        return new JAXBElement<String>(_DniPaciente_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osakidetza.net/soa/auditoria", name = "cic-login")
    public JAXBElement<BigInteger> createCicLogin(BigInteger value) {
        return new JAXBElement<BigInteger>(_CicLogin_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osakidetza.net/soa/auditoria", name = "tis-login")
    public JAXBElement<BigInteger> createTisLogin(BigInteger value) {
        return new JAXBElement<BigInteger>(_TisLogin_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osakidetza.net/soa/auditoria", name = "tis-paciente")
    public JAXBElement<BigInteger> createTisPaciente(BigInteger value) {
        return new JAXBElement<BigInteger>(_TisPaciente_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osakidetza.net/soa/auditoria", name = "cic-paciente")
    public JAXBElement<BigInteger> createCicPaciente(BigInteger value) {
        return new JAXBElement<BigInteger>(_CicPaciente_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osakidetza.net/soa/auditoria", name = "dni-login")
    public JAXBElement<String> createDniLogin(String value) {
        return new JAXBElement<String>(_DniLogin_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://osakidetza.net/soa/auditoria", name = "timestamp")
    public JAXBElement<BigInteger> createTimestamp(BigInteger value) {
        return new JAXBElement<BigInteger>(_Timestamp_QNAME, BigInteger.class, null, value);
    }

}
