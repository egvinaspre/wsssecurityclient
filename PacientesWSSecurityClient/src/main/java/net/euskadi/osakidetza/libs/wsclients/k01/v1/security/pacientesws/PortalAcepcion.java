
package net.euskadi.osakidetza.libs.wsclients.k01.v1.security.pacientesws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para portalAcepcion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="portalAcepcion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://xmlns.osakidetza.com/cdc}id use="required""/>
 *       &lt;attribute ref="{http://xmlns.osakidetza.com/cdc}codigo use="required""/>
 *       &lt;attribute ref="{http://xmlns.osakidetza.com/cdc}ase use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "portalAcepcion", propOrder = {
    "descripcion"
})
public class PortalAcepcion {

    @XmlElement(required = true)
    protected String descripcion;
    @XmlAttribute(name = "id", namespace = "http://xmlns.osakidetza.com/cdc", required = true)
    protected long id;
    @XmlAttribute(name = "codigo", namespace = "http://xmlns.osakidetza.com/cdc", required = true)
    protected String codigo;
    @XmlAttribute(name = "ase", namespace = "http://xmlns.osakidetza.com/cdc", required = true)
    protected String ase;

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad ase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAse() {
        return ase;
    }

    /**
     * Define el valor de la propiedad ase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAse(String value) {
        this.ase = value;
    }

}