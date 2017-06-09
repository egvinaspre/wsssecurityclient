
package net.euskadi.osakidetza.libs.wsclients.b69.v1.security.osabirt;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getReportFromParamsResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getReportFromParamsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generatedReport" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReportFromParamsResponse", propOrder = {
    "generatedReport"
})
public class GetReportFromParamsResponse {

    @XmlMimeType("application/octet-stream")
    protected DataHandler generatedReport;

    /**
     * Obtiene el valor de la propiedad generatedReport.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getGeneratedReport() {
        return generatedReport;
    }

    /**
     * Define el valor de la propiedad generatedReport.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setGeneratedReport(DataHandler value) {
        this.generatedReport = value;
    }

}
