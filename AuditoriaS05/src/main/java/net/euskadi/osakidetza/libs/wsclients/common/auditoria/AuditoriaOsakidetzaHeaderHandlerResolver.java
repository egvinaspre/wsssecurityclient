/**
 * 
 */
package net.euskadi.osakidetza.libs.wsclients.common.auditoria;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

/**
 * @author eduvi
 *
 */
public class AuditoriaOsakidetzaHeaderHandlerResolver implements HandlerResolver {

	private Auditoria auditoria;

	public AuditoriaOsakidetzaHeaderHandlerResolver(Auditoria auditoria) {
		super();
		this.auditoria = auditoria;
	}	
	
	/* (non-Javadoc)
	 * @see javax.xml.ws.handler.HandlerResolver#getHandlerChain(javax.xml.ws.handler.PortInfo)
	 */
	public List<Handler> getHandlerChain(PortInfo portInfo) {
	      List<Handler> handlerChain = new ArrayList<Handler>();
	      
	      AuditoriaOsakidetzaHeaderHandler hh = new AuditoriaOsakidetzaHeaderHandler(auditoria);
	 
	      handlerChain.add(hh);
	 
	      return handlerChain;	}



}
