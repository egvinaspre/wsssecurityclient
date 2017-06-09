
package net.euskadi.osakidetza.libs.wsclients.k01.v1.security.pacientesws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getPacientesPorCicResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getPacientesPorCicResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cic" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}paciente" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPacientesPorCicResponse", propOrder = {
    "cic",
    "paciente"
})
public class GetPacientesPorCicResponse {

    @XmlElement(type = Long.class)
    protected List<Long> cic;
    protected List<Paciente> paciente;

    /**
     * Gets the value of the cic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCic() {
        if (cic == null) {
            cic = new ArrayList<Long>();
        }
        return this.cic;
    }

    /**
     * Gets the value of the paciente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paciente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaciente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Paciente }
     * 
     * 
     */
    public List<Paciente> getPaciente() {
        if (paciente == null) {
            paciente = new ArrayList<Paciente>();
        }
        return this.paciente;
    }

}
