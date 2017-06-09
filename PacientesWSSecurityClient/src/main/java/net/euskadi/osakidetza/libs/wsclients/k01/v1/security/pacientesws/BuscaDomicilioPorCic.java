
package net.euskadi.osakidetza.libs.wsclients.k01.v1.security.pacientesws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscaDomicilioPorCic complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscaDomicilioPorCic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cic" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaDomicilioPorCic", propOrder = {
    "cic"
})
public class BuscaDomicilioPorCic {

    protected long cic;

    /**
     * Obtiene el valor de la propiedad cic.
     * 
     */
    public long getCic() {
        return cic;
    }

    /**
     * Define el valor de la propiedad cic.
     * 
     */
    public void setCic(long value) {
        this.cic = value;
    }

}
