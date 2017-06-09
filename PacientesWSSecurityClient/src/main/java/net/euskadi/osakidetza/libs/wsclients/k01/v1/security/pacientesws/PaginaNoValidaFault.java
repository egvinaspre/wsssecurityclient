
package net.euskadi.osakidetza.libs.wsclients.k01.v1.security.pacientesws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "PaginaNoValidaFault", targetNamespace = "http://xmlns.osakidetza.com/cdc")
public class PaginaNoValidaFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private FaultInfo faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public PaginaNoValidaFault(String message, FaultInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public PaginaNoValidaFault(String message, FaultInfo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: net.euskadi.osakidetza.libs.wsclients.k01.v1.security.pacientesws.FaultInfo
     */
    public FaultInfo getFaultInfo() {
        return faultInfo;
    }

}
