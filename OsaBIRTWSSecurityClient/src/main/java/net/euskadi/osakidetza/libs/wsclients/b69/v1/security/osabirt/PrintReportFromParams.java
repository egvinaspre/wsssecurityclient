
package net.euskadi.osakidetza.libs.wsclients.b69.v1.security.osabirt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para printReportFromParams complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="printReportFromParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="osabirtparams" type="{http://osakidetza.net/osaBIRT}OsaBIRTParams" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "printReportFromParams", propOrder = {
    "osabirtparams"
})
public class PrintReportFromParams {

    protected OsaBIRTParams osabirtparams;

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

}
