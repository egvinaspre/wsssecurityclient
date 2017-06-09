
package net.euskadi.osakidetza.libs.wsclients.k01.v1.security.pacientesws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tramo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tramo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="numeroDesde" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="numeroHasta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="bisDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="bisHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="bloqueDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="bloqueHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}calle" minOccurs="0"/>
 *         &lt;element name="calleDesde" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="calleHasta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}barrio" minOccurs="0"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}seccion" minOccurs="0"/>
 *         &lt;element name="tipoNumeracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}localidad" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://xmlns.osakidetza.com/cdc}codigo"/>
 *       &lt;attribute ref="{http://xmlns.osakidetza.com/cdc}id use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tramo", propOrder = {
    "codigoPostal",
    "numeroDesde",
    "numeroHasta",
    "bisDesde",
    "bisHasta",
    "bloqueDesde",
    "bloqueHasta",
    "calle",
    "calleDesde",
    "calleHasta",
    "barrio",
    "seccion",
    "tipoNumeracion",
    "localidad"
})
public class Tramo {

    protected String codigoPostal;
    protected BigDecimal numeroDesde;
    protected BigDecimal numeroHasta;
    protected String bisDesde;
    protected String bisHasta;
    protected String bloqueDesde;
    protected String bloqueHasta;
    protected Calle calle;
    protected BigDecimal calleDesde;
    protected BigDecimal calleHasta;
    protected Barrio barrio;
    protected Seccion seccion;
    protected String tipoNumeracion;
    protected Localidad localidad;
    @XmlAttribute(name = "codigo", namespace = "http://xmlns.osakidetza.com/cdc")
    protected String codigo;
    @XmlAttribute(name = "id", namespace = "http://xmlns.osakidetza.com/cdc", required = true)
    protected long id;

    /**
     * Obtiene el valor de la propiedad codigoPostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Define el valor de la propiedad codigoPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPostal(String value) {
        this.codigoPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDesde.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumeroDesde() {
        return numeroDesde;
    }

    /**
     * Define el valor de la propiedad numeroDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumeroDesde(BigDecimal value) {
        this.numeroDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroHasta.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumeroHasta() {
        return numeroHasta;
    }

    /**
     * Define el valor de la propiedad numeroHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumeroHasta(BigDecimal value) {
        this.numeroHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad bisDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBisDesde() {
        return bisDesde;
    }

    /**
     * Define el valor de la propiedad bisDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBisDesde(String value) {
        this.bisDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad bisHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBisHasta() {
        return bisHasta;
    }

    /**
     * Define el valor de la propiedad bisHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBisHasta(String value) {
        this.bisHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad bloqueDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBloqueDesde() {
        return bloqueDesde;
    }

    /**
     * Define el valor de la propiedad bloqueDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBloqueDesde(String value) {
        this.bloqueDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad bloqueHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBloqueHasta() {
        return bloqueHasta;
    }

    /**
     * Define el valor de la propiedad bloqueHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBloqueHasta(String value) {
        this.bloqueHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad calle.
     * 
     * @return
     *     possible object is
     *     {@link Calle }
     *     
     */
    public Calle getCalle() {
        return calle;
    }

    /**
     * Define el valor de la propiedad calle.
     * 
     * @param value
     *     allowed object is
     *     {@link Calle }
     *     
     */
    public void setCalle(Calle value) {
        this.calle = value;
    }

    /**
     * Obtiene el valor de la propiedad calleDesde.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalleDesde() {
        return calleDesde;
    }

    /**
     * Define el valor de la propiedad calleDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalleDesde(BigDecimal value) {
        this.calleDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad calleHasta.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalleHasta() {
        return calleHasta;
    }

    /**
     * Define el valor de la propiedad calleHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalleHasta(BigDecimal value) {
        this.calleHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad barrio.
     * 
     * @return
     *     possible object is
     *     {@link Barrio }
     *     
     */
    public Barrio getBarrio() {
        return barrio;
    }

    /**
     * Define el valor de la propiedad barrio.
     * 
     * @param value
     *     allowed object is
     *     {@link Barrio }
     *     
     */
    public void setBarrio(Barrio value) {
        this.barrio = value;
    }

    /**
     * Obtiene el valor de la propiedad seccion.
     * 
     * @return
     *     possible object is
     *     {@link Seccion }
     *     
     */
    public Seccion getSeccion() {
        return seccion;
    }

    /**
     * Define el valor de la propiedad seccion.
     * 
     * @param value
     *     allowed object is
     *     {@link Seccion }
     *     
     */
    public void setSeccion(Seccion value) {
        this.seccion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoNumeracion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoNumeracion() {
        return tipoNumeracion;
    }

    /**
     * Define el valor de la propiedad tipoNumeracion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoNumeracion(String value) {
        this.tipoNumeracion = value;
    }

    /**
     * Obtiene el valor de la propiedad localidad.
     * 
     * @return
     *     possible object is
     *     {@link Localidad }
     *     
     */
    public Localidad getLocalidad() {
        return localidad;
    }

    /**
     * Define el valor de la propiedad localidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Localidad }
     *     
     */
    public void setLocalidad(Localidad value) {
        this.localidad = value;
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
