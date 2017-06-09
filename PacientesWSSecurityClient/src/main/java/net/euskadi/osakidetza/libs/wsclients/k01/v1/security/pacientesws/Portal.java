
package net.euskadi.osakidetza.libs.wsclients.k01.v1.security.pacientesws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para portal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="portal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}decimal" form="qualified"/>
 *         &lt;element name="bis" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}acepcion"/>
 *         &lt;element name="tipoPortal" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="bloque" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="idEdificio" type="{http://www.w3.org/2001/XMLSchema}decimal" form="qualified"/>
 *         &lt;element name="eje" type="{http://www.w3.org/2001/XMLSchema}decimal" form="qualified"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}tramo"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://xmlns.osakidetza.com/cdc}id use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "portal", propOrder = {
    "numero",
    "bis",
    "acepcion",
    "tipoPortal",
    "bloque",
    "idEdificio",
    "eje",
    "tramo"
})
public class Portal {

    @XmlElement(required = true)
    protected BigDecimal numero;
    @XmlElement(required = true)
    protected String bis;
    @XmlElement(required = true)
    protected PortalAcepcion acepcion;
    @XmlElement(required = true)
    protected String tipoPortal;
    @XmlElement(required = true)
    protected String bloque;
    @XmlElement(required = true)
    protected BigDecimal idEdificio;
    @XmlElement(required = true)
    protected BigDecimal eje;
    @XmlElement(required = true)
    protected Tramo tramo;
    @XmlAttribute(name = "id", namespace = "http://xmlns.osakidetza.com/cdc", required = true)
    protected long id;

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumero(BigDecimal value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad bis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBis() {
        return bis;
    }

    /**
     * Define el valor de la propiedad bis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBis(String value) {
        this.bis = value;
    }

    /**
     * Obtiene el valor de la propiedad acepcion.
     * 
     * @return
     *     possible object is
     *     {@link PortalAcepcion }
     *     
     */
    public PortalAcepcion getAcepcion() {
        return acepcion;
    }

    /**
     * Define el valor de la propiedad acepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link PortalAcepcion }
     *     
     */
    public void setAcepcion(PortalAcepcion value) {
        this.acepcion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPortal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPortal() {
        return tipoPortal;
    }

    /**
     * Define el valor de la propiedad tipoPortal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPortal(String value) {
        this.tipoPortal = value;
    }

    /**
     * Obtiene el valor de la propiedad bloque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBloque() {
        return bloque;
    }

    /**
     * Define el valor de la propiedad bloque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBloque(String value) {
        this.bloque = value;
    }

    /**
     * Obtiene el valor de la propiedad idEdificio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdEdificio() {
        return idEdificio;
    }

    /**
     * Define el valor de la propiedad idEdificio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdEdificio(BigDecimal value) {
        this.idEdificio = value;
    }

    /**
     * Obtiene el valor de la propiedad eje.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEje() {
        return eje;
    }

    /**
     * Define el valor de la propiedad eje.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEje(BigDecimal value) {
        this.eje = value;
    }

    /**
     * Obtiene el valor de la propiedad tramo.
     * 
     * @return
     *     possible object is
     *     {@link Tramo }
     *     
     */
    public Tramo getTramo() {
        return tramo;
    }

    /**
     * Define el valor de la propiedad tramo.
     * 
     * @param value
     *     allowed object is
     *     {@link Tramo }
     *     
     */
    public void setTramo(Tramo value) {
        this.tramo = value;
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
