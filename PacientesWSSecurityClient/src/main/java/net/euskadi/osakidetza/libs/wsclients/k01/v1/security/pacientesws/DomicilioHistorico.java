
package net.euskadi.osakidetza.libs.wsclients.k01.v1.security.pacientesws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para domicilioHistorico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="domicilioHistorico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commitSCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="tipoComando" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="tipoValor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="codigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}calle"/>
 *         &lt;element name="descripcionCalle" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="descripcionEdificio" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="localidad" type="{http://xmlns.osakidetza.com/cdc}entidad" form="qualified"/>
 *         &lt;element name="descripcionLocalidad" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}municipio"/>
 *         &lt;element name="descripcionMunicipio" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}provincia"/>
 *         &lt;element name="descripcionProvincia" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}portal"/>
 *         &lt;element name="portalBis" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="portalNumero" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/>
 *         &lt;element name="piso" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="mano" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}pais"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://xmlns.osakidetza.com/cdc}cic use="required""/>
 *       &lt;attribute ref="{http://xmlns.osakidetza.com/cdc}id use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domicilioHistorico", propOrder = {
    "commitSCN",
    "tipoComando",
    "tipoValor",
    "codigoPostal",
    "calle",
    "descripcionCalle",
    "descripcionEdificio",
    "localidad",
    "descripcionLocalidad",
    "municipio",
    "descripcionMunicipio",
    "provincia",
    "descripcionProvincia",
    "portal",
    "portalBis",
    "portalNumero",
    "piso",
    "mano",
    "pais"
})
public class DomicilioHistorico {

    protected String commitSCN;
    @XmlElement(required = true)
    protected String tipoComando;
    protected String tipoValor;
    @XmlElement(required = true)
    protected String codigoPostal;
    @XmlElement(required = true)
    protected Calle calle;
    @XmlElement(required = true)
    protected String descripcionCalle;
    @XmlElement(required = true)
    protected String descripcionEdificio;
    @XmlElement(required = true)
    protected Entidad localidad;
    @XmlElement(required = true)
    protected String descripcionLocalidad;
    @XmlElement(required = true)
    protected Municipio municipio;
    @XmlElement(required = true)
    protected String descripcionMunicipio;
    @XmlElement(required = true)
    protected Provincia provincia;
    @XmlElement(required = true)
    protected String descripcionProvincia;
    @XmlElement(required = true)
    protected Portal portal;
    @XmlElement(required = true)
    protected String portalBis;
    protected int portalNumero;
    @XmlElement(required = true)
    protected String piso;
    @XmlElement(required = true)
    protected String mano;
    @XmlElement(required = true)
    protected Pais pais;
    @XmlAttribute(name = "cic", namespace = "http://xmlns.osakidetza.com/cdc", required = true)
    protected long cic;
    @XmlAttribute(name = "id", namespace = "http://xmlns.osakidetza.com/cdc", required = true)
    protected long id;

    /**
     * Obtiene el valor de la propiedad commitSCN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitSCN() {
        return commitSCN;
    }

    /**
     * Define el valor de la propiedad commitSCN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitSCN(String value) {
        this.commitSCN = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoComando.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoComando() {
        return tipoComando;
    }

    /**
     * Define el valor de la propiedad tipoComando.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoComando(String value) {
        this.tipoComando = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoValor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoValor() {
        return tipoValor;
    }

    /**
     * Define el valor de la propiedad tipoValor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoValor(String value) {
        this.tipoValor = value;
    }

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
     * Obtiene el valor de la propiedad descripcionCalle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionCalle() {
        return descripcionCalle;
    }

    /**
     * Define el valor de la propiedad descripcionCalle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionCalle(String value) {
        this.descripcionCalle = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEdificio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionEdificio() {
        return descripcionEdificio;
    }

    /**
     * Define el valor de la propiedad descripcionEdificio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionEdificio(String value) {
        this.descripcionEdificio = value;
    }

    /**
     * Obtiene el valor de la propiedad localidad.
     * 
     * @return
     *     possible object is
     *     {@link Entidad }
     *     
     */
    public Entidad getLocalidad() {
        return localidad;
    }

    /**
     * Define el valor de la propiedad localidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Entidad }
     *     
     */
    public void setLocalidad(Entidad value) {
        this.localidad = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionLocalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionLocalidad() {
        return descripcionLocalidad;
    }

    /**
     * Define el valor de la propiedad descripcionLocalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionLocalidad(String value) {
        this.descripcionLocalidad = value;
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
     * Obtiene el valor de la propiedad descripcionMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionMunicipio() {
        return descripcionMunicipio;
    }

    /**
     * Define el valor de la propiedad descripcionMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionMunicipio(String value) {
        this.descripcionMunicipio = value;
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
     * Obtiene el valor de la propiedad descripcionProvincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionProvincia() {
        return descripcionProvincia;
    }

    /**
     * Define el valor de la propiedad descripcionProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionProvincia(String value) {
        this.descripcionProvincia = value;
    }

    /**
     * Obtiene el valor de la propiedad portal.
     * 
     * @return
     *     possible object is
     *     {@link Portal }
     *     
     */
    public Portal getPortal() {
        return portal;
    }

    /**
     * Define el valor de la propiedad portal.
     * 
     * @param value
     *     allowed object is
     *     {@link Portal }
     *     
     */
    public void setPortal(Portal value) {
        this.portal = value;
    }

    /**
     * Obtiene el valor de la propiedad portalBis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalBis() {
        return portalBis;
    }

    /**
     * Define el valor de la propiedad portalBis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalBis(String value) {
        this.portalBis = value;
    }

    /**
     * Obtiene el valor de la propiedad portalNumero.
     * 
     */
    public int getPortalNumero() {
        return portalNumero;
    }

    /**
     * Define el valor de la propiedad portalNumero.
     * 
     */
    public void setPortalNumero(int value) {
        this.portalNumero = value;
    }

    /**
     * Obtiene el valor de la propiedad piso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiso() {
        return piso;
    }

    /**
     * Define el valor de la propiedad piso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiso(String value) {
        this.piso = value;
    }

    /**
     * Obtiene el valor de la propiedad mano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMano() {
        return mano;
    }

    /**
     * Define el valor de la propiedad mano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMano(String value) {
        this.mano = value;
    }

    /**
     * Obtiene el valor de la propiedad pais.
     * 
     * @return
     *     possible object is
     *     {@link Pais }
     *     
     */
    public Pais getPais() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     * @param value
     *     allowed object is
     *     {@link Pais }
     *     
     */
    public void setPais(Pais value) {
        this.pais = value;
    }

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
