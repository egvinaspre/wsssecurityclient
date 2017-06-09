
package net.euskadi.osakidetza.libs.wsclients.k01.v1.security.pacientesws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscarHistoricoPacientePorCICResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscarHistoricoPacientePorCICResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="historicoPaciente" type="{http://xmlns.osakidetza.com/cdc}pacienteHistorico" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarHistoricoPacientePorCICResponse", propOrder = {
    "historicoPaciente"
})
public class BuscarHistoricoPacientePorCICResponse {

    protected List<PacienteHistorico> historicoPaciente;

    /**
     * Gets the value of the historicoPaciente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historicoPaciente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoricoPaciente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PacienteHistorico }
     * 
     * 
     */
    public List<PacienteHistorico> getHistoricoPaciente() {
        if (historicoPaciente == null) {
            historicoPaciente = new ArrayList<PacienteHistorico>();
        }
        return this.historicoPaciente;
    }

}
