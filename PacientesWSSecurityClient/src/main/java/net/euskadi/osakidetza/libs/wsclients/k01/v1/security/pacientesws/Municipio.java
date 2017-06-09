
package net.euskadi.osakidetza.libs.wsclients.k01.v1.security.pacientesws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para municipio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="municipio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}comarca"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}provincia"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://xmlns.osakidetza.com/cdc}codigo use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "municipio", propOrder = {
    "descripcion",
    "comarca",
    "provincia"
})
public class Municipio {

    @XmlElement(required = true)
    protected String descripcion;
    @XmlElement(required = true)
    protected Comarca comarca;
    @XmlElement(required = true)
    protected Provincia provincia;
    @XmlAttribute(name = "codigo", namespace = "http://xmlns.osakidetza.com/cdc", required = true)
    protected String codigo;

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
     * Obtiene el valor de la propiedad comarca.
     * 
     * @return
     *     possible object is
     *     {@link Comarca }
     *     
     */
    public Comarca getComarca() {
        return comarca;
    }

    /**
     * Define el valor de la propiedad comarca.
     * 
     * @param value
     *     allowed object is
     *     {@link Comarca }
     *     
     */
    public void setComarca(Comarca value) {
        this.comarca = value;
    }

    /**
     * Obtiene el valor de la propiedad provincia.
     * 
     * @return
     *     possible object is
     *     {@link Provincia }
     *     
     */
    public Provincia getProvincia() {
        return provincia;
    }

    /**
     * Define el valor de la propiedad provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link Provincia }
     *     
     */
    public void setProvincia(Provincia value) {
        this.provincia = value;
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

}
