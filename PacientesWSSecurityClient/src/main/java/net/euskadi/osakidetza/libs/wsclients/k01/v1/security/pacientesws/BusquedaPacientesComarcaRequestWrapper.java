
package net.euskadi.osakidetza.libs.wsclients.k01.v1.security.pacientesws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para busquedaPacientesComarcaRequestWrapper complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="busquedaPacientesComarcaRequestWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="apellido1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="apellido2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="tis" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *         &lt;element name="nas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="situacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="sns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="comarca" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="busquedaFonetica" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "busquedaPacientesComarcaRequestWrapper", propOrder = {
    "cic",
    "nombre",
    "apellido1",
    "apellido2",
    "dni",
    "tis",
    "nas",
    "telefono",
    "fechaNacimiento",
    "situacion",
    "sns",
    "comarca",
    "provincia",
    "busquedaFonetica"
})
public class BusquedaPacientesComarcaRequestWrapper {

    protected Long cic;
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected String dni;
    protected Long tis;
    protected String nas;
    protected String telefono;
    protected String fechaNacimiento;
    protected String situacion;
    protected String sns;
    @XmlElement(required = true)
    protected String comarca;
    @XmlElement(required = true)
    protected String provincia;
    protected Boolean busquedaFonetica;

    /**
     * Obtiene el valor de la propiedad cic.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCic() {
        return cic;
    }

    /**
     * Define el valor de la propiedad cic.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCic(Long value) {
        this.cic = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Define el valor de la propiedad apellido1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido1(String value) {
        this.apellido1 = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * Define el valor de la propiedad apellido2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido2(String value) {
        this.apellido2 = value;
    }

    /**
     * Obtiene el valor de la propiedad dni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDni() {
        return dni;
    }

    /**
     * Define el valor de la propiedad dni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDni(String value) {
        this.dni = value;
    }

    /**
     * Obtiene el valor de la propiedad tis.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTis() {
        return tis;
    }

    /**
     * Define el valor de la propiedad tis.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTis(Long value) {
        this.tis = value;
    }

    /**
     * Obtiene el valor de la propiedad nas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNas() {
        return nas;
    }

    /**
     * Define el valor de la propiedad nas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNas(String value) {
        this.nas = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad situacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacion() {
        return situacion;
    }

    /**
     * Define el valor de la propiedad situacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacion(String value) {
        this.situacion = value;
    }

    /**
     * Obtiene el valor de la propiedad sns.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSns() {
        return sns;
    }

    /**
     * Define el valor de la propiedad sns.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSns(String value) {
        this.sns = value;
    }

    /**
     * Obtiene el valor de la propiedad comarca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComarca() {
        return comarca;
    }

    /**
     * Define el valor de la propiedad comarca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComarca(String value) {
        this.comarca = value;
    }

    /**
     * Obtiene el valor de la propiedad provincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Define el valor de la propiedad provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Obtiene el valor de la propiedad busquedaFonetica.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusquedaFonetica() {
        return busquedaFonetica;
    }

    /**
     * Define el valor de la propiedad busquedaFonetica.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusquedaFonetica(Boolean value) {
        this.busquedaFonetica = value;
    }

}
