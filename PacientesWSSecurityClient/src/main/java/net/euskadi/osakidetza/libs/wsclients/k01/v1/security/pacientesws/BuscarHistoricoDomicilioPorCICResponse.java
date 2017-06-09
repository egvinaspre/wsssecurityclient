
package net.euskadi.osakidetza.libs.wsclients.k01.v1.security.pacientesws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscarHistoricoDomicilioPorCICResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscarHistoricoDomicilioPorCICResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="historicoDomicilio" type="{http://xmlns.osakidetza.com/cdc}domicilioHistorico" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarHistoricoDomicilioPorCICResponse", propOrder = {
    "historicoDomicilio"
})
public class BuscarHistoricoDomicilioPorCICResponse {

    protected List<DomicilioHistorico> historicoDomicilio;

    /**
     * Gets the value of the historicoDomicilio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historicoDomicilio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoricoDomicilio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DomicilioHistorico }
     * 
     * 
     */
    public List<DomicilioHistorico> getHistoricoDomicilio() {
        if (historicoDomicilio == null) {
            historicoDomicilio = new ArrayList<DomicilioHistorico>();
        }
        return this.historicoDomicilio;
    }

}
