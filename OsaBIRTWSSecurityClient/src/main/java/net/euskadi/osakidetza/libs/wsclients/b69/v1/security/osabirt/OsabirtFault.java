
package net.euskadi.osakidetza.libs.wsclients.b69.v1.security.osabirt;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "OsabirtFault", targetNamespace = "http://osakidetza.net/osabirt/faults")
public class OsabirtFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private OsaBIRTFaultBean faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public OsabirtFault(String message, OsaBIRTFaultBean faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public OsabirtFault(String message, OsaBIRTFaultBean faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: net.euskadi.osakidetza.libs.wsclients.b69.v1.security.osabirt.OsaBIRTFaultBean
     */
    public OsaBIRTFaultBean getFaultInfo() {
        return faultInfo;
    }

}
