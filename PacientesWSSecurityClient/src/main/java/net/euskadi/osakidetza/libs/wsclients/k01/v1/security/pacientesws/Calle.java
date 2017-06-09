
package net.euskadi.osakidetza.libs.wsclients.k01.v1.security.pacientesws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para calle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="calle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}tipoVia"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}municipio"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://xmlns.osakidetza.com/cdc}codigo use="required""/>
 *       &lt;attribute ref="{http://xmlns.osakidetza.com/cdc}id use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calle", propOrder = {
    "descripcion",
    "tipoVia",
    "municipio"
})
public class Calle {

    @XmlElement(required = true)
    protected String descripcion;
    @XmlElement(required = true)
    protected TipoVia tipoVia;
    @XmlElement(required = true)
    protected Municipio municipio;
    @XmlAttribute(name = "codigo", namespace = "http://xmlns.osakidetza.com/cdc", required = true)
    protected String codigo;
    @XmlAttribute(name = "id", namespace = "http://xmlns.osakidetza.com/cdc", required = true)
    protected long id;

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
     * Obtiene el valor de la propiedad tipoVia.
     * 
     * @return
     *     possible object is
     *     {@link TipoVia }
     *     
     */
    public TipoVia getTipoVia() {
        return tipoVia;
    }

    /**
     * Define el valor de la propiedad tipoVia.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoVia }
     *     
     */
    public void setTipoVia(TipoVia value) {
        this.tipoVia = value;
    }

    /**
     * Obtiene el valor de la propiedad municipio.
     * 
     * @return
     *     possible object is
     *     {@link Municipio }
     *     
     */
    public Municipio getMunicipio() {
        return municipio;
    }

    /**
     * Define el valor de la propiedad municipio.
     * 
     * @param value
     *     allowed object is
     *     {@link Municipio }
     *     
     */
    public void setMunicipio(Municipio value) {
        this.municipio = value;
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

}
