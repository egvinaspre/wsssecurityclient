
package net.euskadi.osakidetza.libs.wsclients.k01.v1.security.pacientesws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para paciente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paciente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="apellido1" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="apellido2" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="tis" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="tisTipo" type="{http://xmlns.osakidetza.com/cdc}tisTipo" minOccurs="0" form="qualified"/>
 *         &lt;element name="nas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="sns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="tse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="institucionTse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="codigoPaisEmisorTse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="fechaExpiracionTse" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}sexo" minOccurs="0"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}idioma" minOccurs="0"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}parentesco" minOccurs="0"/>
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="codigoPaisNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="fechaFallecimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="codigoCupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}cobertura" minOccurs="0"/>
 *         &lt;element name="farmacia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="dva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="centroPrimaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}domicilio" minOccurs="0"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}prestacion" minOccurs="0"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}regimen" minOccurs="0"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}situacion" minOccurs="0"/>
 *         &lt;element ref="{http://xmlns.osakidetza.com/cdc}titularidad" minOccurs="0"/>
 *         &lt;element name="telefonoMovil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="telefonoDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="telefonoTrabajo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="baja" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://xmlns.osakidetza.com/cdc}cic use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paciente", propOrder = {
    "nombre",
    "apellido1",
    "apellido2",
    "dni",
    "tis",
    "tisTipo",
    "nas",
    "sns",
    "tse",
    "institucionTse",
    "codigoPaisEmisorTse",
    "fechaExpiracionTse",
    "sexo",
    "idioma",
    "parentesco",
    "fechaNacimiento",
    "codigoPaisNacimiento",
    "fechaFallecimiento",
    "codigoCupo",
    "cobertura",
    "farmacia",
    "dva",
    "centroPrimaria",
    "domicilio",
    "prestacion",
    "regimen",
    "situacion",
    "titularidad",
    "telefonoMovil",
    "telefonoDomicilio",
    "telefonoTrabajo",
    "email",
    "baja"
})
public class Paciente {

    protected String nombre;
    @XmlElement(required = true)
    protected String apellido1;
    @XmlElement(required = true)
    protected String apellido2;
    protected String dni;
    protected BigDecimal tis;
    protected TisTipo tisTipo;
    protected String nas;
    protected String sns;
    protected String tse;
    protected String institucionTse;
    protected String codigoPaisEmisorTse;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaExpiracionTse;
    protected Sexo sexo;
    protected Idioma idioma;
    protected Parentesco parentesco;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaNacimiento;
    protected String codigoPaisNacimiento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFallecimiento;
    protected String codigoCupo;
    protected Cobertura cobertura;
    protected BigDecimal farmacia;
    protected String dva;
    protected String centroPrimaria;
    protected Domicilio domicilio;
    protected Prestacion prestacion;
    protected Regimen regimen;
    protected Situacion situacion;
    protected Titularidad titularidad;
    protected String telefonoMovil;
    protected String telefonoDomicilio;
    protected String telefonoTrabajo;
    protected String email;
    protected Boolean baja;
    @XmlAttribute(name = "cic", namespace = "http://xmlns.osakidetza.com/cdc", required = true)
    protected long cic;

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
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTis() {
        return tis;
    }

    /**
     * Define el valor de la propiedad tis.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTis(BigDecimal value) {
        this.tis = value;
    }

    /**
     * Obtiene el valor de la propiedad tisTipo.
     * 
     * @return
     *     possible object is
     *     {@link TisTipo }
     *     
     */
    public TisTipo getTisTipo() {
        return tisTipo;
    }

    /**
     * Define el valor de la propiedad tisTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link TisTipo }
     *     
     */
    public void setTisTipo(TisTipo value) {
        this.tisTipo = value;
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
     * Obtiene el valor de la propiedad tse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTse() {
        return tse;
    }

    /**
     * Define el valor de la propiedad tse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTse(String value) {
        this.tse = value;
    }

    /**
     * Obtiene el valor de la propiedad institucionTse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitucionTse() {
        return institucionTse;
    }

    /**
     * Define el valor de la propiedad institucionTse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitucionTse(String value) {
        this.institucionTse = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPaisEmisorTse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPaisEmisorTse() {
        return codigoPaisEmisorTse;
    }

    /**
     * Define el valor de la propiedad codigoPaisEmisorTse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPaisEmisorTse(String value) {
        this.codigoPaisEmisorTse = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExpiracionTse.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaExpiracionTse() {
        return fechaExpiracionTse;
    }

    /**
     * Define el valor de la propiedad fechaExpiracionTse.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaExpiracionTse(XMLGregorianCalendar value) {
        this.fechaExpiracionTse = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link Sexo }
     *     
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link Sexo }
     *     
     */
    public void setSexo(Sexo value) {
        this.sexo = value;
    }

    /**
     * Obtiene el valor de la propiedad idioma.
     * 
     * @return
     *     possible object is
     *     {@link Idioma }
     *     
     */
    public Idioma getIdioma() {
        return idioma;
    }

    /**
     * Define el valor de la propiedad idioma.
     * 
     * @param value
     *     allowed object is
     *     {@link Idioma }
     *     
     */
    public void setIdioma(Idioma value) {
        this.idioma = value;
    }

    /**
     * Obtiene el valor de la propiedad parentesco.
     * 
     * @return
     *     possible object is
     *     {@link Parentesco }
     *     
     */
    public Parentesco getParentesco() {
        return parentesco;
    }

    /**
     * Define el valor de la propiedad parentesco.
     * 
     * @param value
     *     allowed object is
     *     {@link Parentesco }
     *     
     */
    public void setParentesco(Parentesco value) {
        this.parentesco = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaNacimiento(XMLGregorianCalendar value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPaisNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPaisNacimiento() {
        return codigoPaisNacimiento;
    }

    /**
     * Define el valor de la propiedad codigoPaisNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPaisNacimiento(String value) {
        this.codigoPaisNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFallecimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFallecimiento() {
        return fechaFallecimiento;
    }

    /**
     * Define el valor de la propiedad fechaFallecimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFallecimiento(XMLGregorianCalendar value) {
        this.fechaFallecimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCupo() {
        return codigoCupo;
    }

    /**
     * Define el valor de la propiedad codigoCupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCupo(String value) {
        this.codigoCupo = value;
    }

    /**
     * Obtiene el valor de la propiedad cobertura.
     * 
     * @return
     *     possible object is
     *     {@link Cobertura }
     *     
     */
    public Cobertura getCobertura() {
        return cobertura;
    }

    /**
     * Define el valor de la propiedad cobertura.
     * 
     * @param value
     *     allowed object is
     *     {@link Cobertura }
     *     
     */
    public void setCobertura(Cobertura value) {
        this.cobertura = value;
    }

    /**
     * Obtiene el valor de la propiedad farmacia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFarmacia() {
        return farmacia;
    }

    /**
     * Define el valor de la propiedad farmacia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFarmacia(BigDecimal value) {
        this.farmacia = value;
    }

    /**
     * Obtiene el valor de la propiedad dva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDva() {
        return dva;
    }

    /**
     * Define el valor de la propiedad dva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDva(String value) {
        this.dva = value;
    }

    /**
     * Obtiene el valor de la propiedad centroPrimaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentroPrimaria() {
        return centroPrimaria;
    }

    /**
     * Define el valor de la propiedad centroPrimaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentroPrimaria(String value) {
        this.centroPrimaria = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilio.
     * 
     * @return
     *     possible object is
     *     {@link Domicilio }
     *     
     */
    public Domicilio getDomicilio() {
        return domicilio;
    }

    /**
     * Define el valor de la propiedad domicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link Domicilio }
     *     
     */
    public void setDomicilio(Domicilio value) {
        this.domicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad prestacion.
     * 
     * @return
     *     possible object is
     *     {@link Prestacion }
     *     
     */
    public Prestacion getPrestacion() {
        return prestacion;
    }

    /**
     * Define el valor de la propiedad prestacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Prestacion }
     *     
     */
    public void setPrestacion(Prestacion value) {
        this.prestacion = value;
    }

    /**
     * Obtiene el valor de la propiedad regimen.
     * 
     * @return
     *     possible object is
     *     {@link Regimen }
     *     
     */
    public Regimen getRegimen() {
        return regimen;
    }

    /**
     * Define el valor de la propiedad regimen.
     * 
     * @param value
     *     allowed object is
     *     {@link Regimen }
     *     
     */
    public void setRegimen(Regimen value) {
        this.regimen = value;
    }

    /**
     * Obtiene el valor de la propiedad situacion.
     * 
     * @return
     *     possible object is
     *     {@link Situacion }
     *     
     */
    public Situacion getSituacion() {
        return situacion;
    }

    /**
     * Define el valor de la propiedad situacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Situacion }
     *     
     */
    public void setSituacion(Situacion value) {
        this.situacion = value;
    }

    /**
     * Obtiene el valor de la propiedad titularidad.
     * 
     * @return
     *     possible object is
     *     {@link Titularidad }
     *     
     */
    public Titularidad getTitularidad() {
        return titularidad;
    }

    /**
     * Define el valor de la propiedad titularidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Titularidad }
     *     
     */
    public void setTitularidad(Titularidad value) {
        this.titularidad = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoMovil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    /**
     * Define el valor de la propiedad telefonoMovil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoMovil(String value) {
        this.telefonoMovil = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoDomicilio() {
        return telefonoDomicilio;
    }

    /**
     * Define el valor de la propiedad telefonoDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoDomicilio(String value) {
        this.telefonoDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoTrabajo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoTrabajo() {
        return telefonoTrabajo;
    }

    /**
     * Define el valor de la propiedad telefonoTrabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoTrabajo(String value) {
        this.telefonoTrabajo = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad baja.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBaja() {
        return baja;
    }

    /**
     * Define el valor de la propiedad baja.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBaja(Boolean value) {
        this.baja = value;
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

}
