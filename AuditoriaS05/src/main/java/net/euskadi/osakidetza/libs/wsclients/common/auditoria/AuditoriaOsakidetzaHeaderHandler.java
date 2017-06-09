package net.euskadi.osakidetza.libs.wsclients.common.auditoria;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPFactory;


public class AuditoriaOsakidetzaHeaderHandler 
implements SOAPHandler<SOAPMessageContext> 
{

	private Auditoria auditoria;
	
	public AuditoriaOsakidetzaHeaderHandler(Auditoria auditoria) {
		super();
		this.auditoria = auditoria;
	}

	public Set<QName> getHeaders() {
		HashSet<QName> headers = new HashSet<QName>();
		headers.add(new QName("http://osakidetza.net/soa/auditoria", "AuditoriaOsakidetza"));
		return headers;
	}

	
	public boolean handleMessage(SOAPMessageContext messageContext) {
		Boolean outboundProperty = (Boolean) messageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		if (outboundProperty.booleanValue()) {
			System.out.println("\nOutbound message:");
		} else {
			System.out.println("\nInbound message:");
		}

		try {
			SOAPMessage soapMessage = messageContext.getMessage();
			SOAPPart soapPart = soapMessage.getSOAPPart();
			SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
			SOAPHeader soapHeader = null;

			if (soapEnvelope.getHeader() == null) {
				soapHeader = soapEnvelope.addHeader();
			} else {
				soapHeader = soapEnvelope.getHeader();
			}

			try {
				JAXBContext jc = JAXBContext.newInstance("net.euskadi.osakidetza.libs.wsclients.common.auditoria");
				Marshaller m = jc.createMarshaller();
				m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
				m.marshal(auditoria, soapHeader);
			} catch (PropertyException e) {
				e.printStackTrace();
			} catch (JAXBException e) {
				e.printStackTrace();
			}

			soapMessage.saveChanges();

		} catch (SOAPException e) {
			e.printStackTrace();
		}

		System.out.println("** Response: " + messageContext.getMessage().toString());
		return true;
	}

	public boolean handleFault(SOAPMessageContext messageContext) {
		return true;
	}

	public void close(MessageContext messageContext) {
	}
	
	
}
