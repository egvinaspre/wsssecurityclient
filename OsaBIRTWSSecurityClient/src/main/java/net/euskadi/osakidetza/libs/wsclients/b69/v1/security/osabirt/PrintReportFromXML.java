
package net.euskadi.osakidetza.libs.wsclients.b69.v1.security.osabirt;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para printReportFromXML complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="printReportFromXML">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="osabirtparams" type="{http://osakidetza.net/osaBIRT}OsaBIRTParams" minOccurs="0"/>
 *         &lt;element name="xmlFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "printReportFromXML", propOrder = {
    "osabirtparams",
    "xmlFile"
})
public class PrintReportFromXML {

    protected OsaBIRTParams osabirtparams;
    @XmlMimeType("application/octet-stream")
    protected DataHandler xmlFile;

    /**
     * Obtiene el valor de la propiedad osabirtparams.
     * 
     * @return
     *     possible object is
     *     {@link OsaBIRTParams }
     *     
     */
    public OsaBIRTParams getOsabirtparams() {
        return osabirtparams;
    }

    /**
     * Define el valor de la propiedad osabirtparams.
     * 
     * @param value
     *     allowed object is
     *     {@link OsaBIRTParams }
     *     
     */
    public void setOsabirtparams(OsaBIRTParams value) {
        this.osabirtparams = value;
    }

    /**
     * Obtiene el valor de la propiedad xmlFile.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getXmlFile() {
        return xmlFile;
    }

    /**
     * Define el valor de la propiedad xmlFile.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setXmlFile(DataHandler value) {
        this.xmlFile = value;
    }

}
