
package net.euskadi.osakidetza.libs.wsclients.b69.v1.security.osabirt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OsaBIRTParams complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OsaBIRTParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="formato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="appPublicadora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="appSolicitante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="appCliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="centro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="os" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="runParams" type="{http://osakidetza.net/osaBIRT}runParamsMap"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OsaBIRTParams", propOrder = {
    "informe",
    "dataSource",
    "locale",
    "formato",
    "appPublicadora",
    "appSolicitante",
    "appCliente",
    "tipo",
    "ip",
    "usuario",
    "centro",
    "os",
    "runParams"
})
public class OsaBIRTParams {

    @XmlElement(required = true)
    protected String informe;
    @XmlElement(required = true)
    protected String dataSource;
    @XmlElement(required = true)
    protected String locale;
    @XmlElement(required = true)
    protected String formato;
    @XmlElement(required = true)
    protected String appPublicadora;
    @XmlElement(required = true)
    protected String appSolicitante;
    @XmlElement(required = true)
    protected String appCliente;
    @XmlElement(required = true)
    protected String tipo;
    @XmlElement(required = true)
    protected String ip;
    @XmlElement(required = true)
    protected String usuario;
    @XmlElement(required = true)
    protected String centro;
    @XmlElement(required = true)
    protected String os;
    @XmlElement(required = true)
    protected RunParamsMap runParams;

    /**
     * Obtiene el valor de la propiedad informe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInforme() {
        return informe;
    }

    /**
     * Define el valor de la propiedad informe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInforme(String value) {
        this.informe = value;
    }

    /**
     * Obtiene el valor de la propiedad dataSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Define el valor de la propiedad dataSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    /**
     * Obtiene el valor de la propiedad locale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Define el valor de la propiedad locale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Obtiene el valor de la propiedad formato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormato() {
        return formato;
    }

    /**
     * Define el valor de la propiedad formato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormato(String value) {
        this.formato = value;
    }

    /**
     * Obtiene el valor de la propiedad appPublicadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppPublicadora() {
        return appPublicadora;
    }

    /**
     * Define el valor de la propiedad appPublicadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppPublicadora(String value) {
        this.appPublicadora = value;
    }

    /**
     * Obtiene el valor de la propiedad appSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppSolicitante() {
        return appSolicitante;
    }

    /**
     * Define el valor de la propiedad appSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppSolicitante(String value) {
        this.appSolicitante = value;
    }

    /**
     * Obtiene el valor de la propiedad appCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppCliente() {
        return appCliente;
    }

    /**
     * Define el valor de la propiedad appCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppCliente(String value) {
        this.appCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad ip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIp() {
        return ip;
    }

    /**
     * Define el valor de la propiedad ip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIp(String value) {
        this.ip = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad centro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentro() {
        return centro;
    }

    /**
     * Define el valor de la propiedad centro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentro(String value) {
        this.centro = value;
    }

    /**
     * Obtiene el valor de la propiedad os.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOs() {
        return os;
    }

    /**
     * Define el valor de la propiedad os.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOs(String value) {
        this.os = value;
    }

    /**
     * Obtiene el valor de la propiedad runParams.
     * 
     * @return
     *     possible object is
     *     {@link RunParamsMap }
     *     
     */
    public RunParamsMap getRunParams() {
        return runParams;
    }

    /**
     * Define el valor de la propiedad runParams.
     * 
     * @param value
     *     allowed object is
     *     {@link RunParamsMap }
     *     
     */
    public void setRunParams(RunParamsMap value) {
        this.runParams = value;
    }

}
