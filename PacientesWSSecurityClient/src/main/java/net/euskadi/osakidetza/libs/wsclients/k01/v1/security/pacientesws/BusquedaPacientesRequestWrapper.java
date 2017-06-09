
package net.euskadi.osakidetza.libs.wsclients.k01.v1.security.pacientesws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para busquedaPacientesRequestWrapper complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="busquedaPacientesRequestWrapper">
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
 *         &lt;element name="bytFallecido" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0" form="qualified"/>
 *         &lt;element name="gcFechaFallecimientoDesde" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="gcFechaFallecimientoHasta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
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
@XmlType(name = "busquedaPacientesRequestWrapper", propOrder = {
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
    "bytFallecido",
    "gcFechaFallecimientoDesde",
    "gcFechaFallecimientoHasta",
    "busquedaFonetica"
})
public class BusquedaPacientesRequestWrapper {

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
    protected Byte bytFallecido;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gcFechaFallecimientoDesde;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gcFechaFallecimientoHasta;
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
     * Obtiene el valor de la propiedad bytFallecido.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getBytFallecido() {
        return bytFallecido;
    }

    /**
     * Define el valor de la propiedad bytFallecido.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setBytFallecido(Byte value) {
        this.bytFallecido = value;
    }

    /**
     * Obtiene el valor de la propiedad gcFechaFallecimientoDesde.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGcFechaFallecimientoDesde() {
        return gcFechaFallecimientoDesde;
    }

    /**
     * Define el valor de la propiedad gcFechaFallecimientoDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGcFechaFallecimientoDesde(XMLGregorianCalendar value) {
        this.gcFechaFallecimientoDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad gcFechaFallecimientoHasta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGcFechaFallecimientoHasta() {
        return gcFechaFallecimientoHasta;
    }

    /**
     * Define el valor de la propiedad gcFechaFallecimientoHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGcFechaFallecimientoHasta(XMLGregorianCalendar value) {
        this.gcFechaFallecimientoHasta = value;
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
