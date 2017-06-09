/**
 * 
 */
package net.euskadi.osakidetza.libs.wsclients.k01.v1.security;

import java.math.BigInteger;
import java.net.URL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.HandlerResolver;

import net.euskadi.osakidetza.libs.wsclients.common.auditoria.Auditoria;
import net.euskadi.osakidetza.libs.wsclients.common.auditoria.AuditoriaOsakidetzaHeaderHandlerResolver;
import net.euskadi.osakidetza.libs.wsclients.k01.v1.security.pacientesws.Paciente;
import net.euskadi.osakidetza.libs.wsclients.k01.v1.security.pacientesws.PacientesPortType;
import net.euskadi.osakidetza.libs.wsclients.k01.v1.security.pacientesws.PacientesWebService;
import weblogic.security.SSL.TrustManager;
import weblogic.wsee.security.bst.ClientBSTCredentialProvider;
import weblogic.xml.crypto.wss.WSSecurityContext;
import weblogic.xml.crypto.wss.provider.CredentialProvider;

/**
 * !! IMPORTANTE !!
 * Este cliente llamado con seguridad, solo funciona si es invocado desde un componente Java
 * que este siendo ejecutado dentro del ambito de un dominio de WEBLOGIC. 
 * No funciona con java -jar. 
 * @author eduvi
 * 
 */
public class PacientesWSProxy {
	
	/** La URL donde se encuentra el servicio web. 
	 * Tras los ultimos comites, la url debe finalizar con ?WSDL para evitar la doble llamada.*/
	private String WEBSERVICE_ADDRESS;
	
	/** El namespace para invocar al servicio web. 
	 *  En el WSDL es el targetNamespace de la definition del WS.*/
	private String WEBSERVICE_NAMESPACE; 
	
	/** El nombre del servicio web que se va a invocar.
	 *  En el WSDL es el name de la definition del WS.*/
	private String WEBSERVICE_NAME;
	
	/** Esta variable booleana sera; 
	 *  TRUE si se ha invocado el constructor con los parametros de seguridad rellenos,
	 *  FALSE si se ha invocado el constructor sin los parametros de seguridad. */
	private boolean proxyConCifrado;
	
	/** La ruta fisica y completa donde se encuentra el fichero *.jks. */
	private String KEYSTORE_FILENAME;
	
	/** La password para abrir el keystore */
	private String KEYSTORE_PASSWD;
	
	/** Alias del certificado que firma (cifra) la peticion.
	 *  Este certificado esta contenido en el keystore identificado en KEYSTORE_FILENAME. */
	private String CERT_ALIAS;
	
	/** La password del certificado. */
	private String CERT_PASSWD;
	
	/** La información de auditoria SOA. Opcional.*/
	private Auditoria auditoria;
	
	/** Esta variable se rellena de las siguiente forma dependiendo de si se rellena o no
	 *  la variable local 'auditoria': 
	 *  TRUE si viene informada,
	 *  FALSE si no viene informada. */
	private boolean proxyConCabeceraS05;	
	
	/** Instancia singleton de la propia clase */
	private static PacientesPortType cliente;
	
	

	/**
	 * Constructor.
	 * Incializa la clase sin seguridad. 
	 * @param _webserviceaddress La URL donde se encuentra el servicio web.
	 * @param _webservicenamespace El namespace para invocar al servicio web.
	 * @param _webservicename El nombre del servicio web que se va a invocar
	 */
	public PacientesWSProxy(String _webserviceaddress, String _webservicenamespace, String _webservicename) {
		super();
		this.WEBSERVICE_ADDRESS = _webserviceaddress;
		this.WEBSERVICE_NAMESPACE = _webservicenamespace;
		this.WEBSERVICE_NAME = _webservicename;
		this.proxyConCabeceraS05 = false;
		this.proxyConCifrado = false;
	}
	
	/**
	 * Constructor. 
	 * Inicializa la clase con seguridad.
	 * @param _webserviceaddress La URL donde se encuentra el servicio web.
	 * @param _webservicenamespace El namespace para invocar al servicio web.
	 * @param _webservicename El nombre del servicio web que se va a invocar
	 * @param _keystorefilename La ruta fisica y completa donde se encuentra el fichero *.jks.
	 * @param _keystorepassword La password para abrir el keystore
	 * @param _certalias Alias del certificado que firma (cifra) la peticion.
	 * @param _certpassword La password del certificado. 
	 */
	public PacientesWSProxy(String _webserviceaddress, String _webservicenamespace, String _webservicename, String _keystorefilename, String _keystorepassword, String _certalias, String _certpassword) {
		super();
		this.WEBSERVICE_ADDRESS = _webserviceaddress;
		this.WEBSERVICE_NAMESPACE = _webservicenamespace;
		this.WEBSERVICE_NAME = _webservicename;
		this.KEYSTORE_FILENAME = _keystorefilename;
		this.KEYSTORE_PASSWD = _keystorepassword;
		this.CERT_ALIAS = _certalias;
		this.CERT_PASSWD = _certpassword;
		this.proxyConCabeceraS05 = false;
		this.proxyConCifrado = true;
	}
	
	/**
	 * Constructor. 
	 * Inicializa la clase con seguridad.
	 * @param _webserviceaddress La URL donde se encuentra el servicio web.
	 * @param _webservicenamespace El namespace para invocar al servicio web.
	 * @param _webservicename El nombre del servicio web que se va a invocar
	 * @param _keystorefilename La ruta fisica y completa donde se encuentra el fichero *.jks.
	 * @param _keystorepassword La password para abrir el keystore
	 * @param _certalias Alias del certificado que firma (cifra) la peticion.
	 * @param _certpassword La password del certificado. 
	 * @param _auditoria Auditoria S05
	 */
	public PacientesWSProxy(String _webserviceaddress, String _webservicenamespace, String _webservicename, String _keystorefilename, String _keystorepassword, String _certalias, String _certpassword, Auditoria auditoria) {
		super();
		this.WEBSERVICE_ADDRESS = _webserviceaddress;
		this.WEBSERVICE_NAMESPACE = _webservicenamespace;
		this.WEBSERVICE_NAME = _webservicename;
		this.KEYSTORE_FILENAME = _keystorefilename;
		this.KEYSTORE_PASSWD = _keystorepassword;
		this.CERT_ALIAS = _certalias;
		this.CERT_PASSWD = _certpassword;
		this.auditoria = auditoria;
		this.proxyConCabeceraS05 = true;
		this.proxyConCifrado = true;
	}	

	/**
	 * Obtiene un cliente valido para llamar al servicio web. 
	 * @return net.euskadi.osakidetza.libs.wsclientes.k01.v1.security.pacientesws.PacientesPortType
	 * @see PacientesPortType
	 * @throws Exception En el improbable caso de que algo falle. 
	 */
	public PacientesPortType getCliente() 
	throws Exception {
		if (cliente == null) {

			// Se instancia la version basica del servicio. 
			PacientesWebService ss = new PacientesWebService(new URL(this.WEBSERVICE_ADDRESS), 
																new QName(this.WEBSERVICE_NAMESPACE, this.WEBSERVICE_NAME));
			if (this.proxyConCabeceraS05 && this.auditoria != null) {				
				// Se annade la cabecera de seguridad necesaria para cumplir la auditoria SOA (S05)
				AuditoriaOsakidetzaHeaderHandlerResolver handlerResolver = new AuditoriaOsakidetzaHeaderHandlerResolver(auditoria);
				ss.setHandlerResolver((HandlerResolver) handlerResolver);
			}
			
			cliente = ss.getPacientesPortTypePort();

			// Se rellena la informacion de binding. 
			// De momento se incluye la URL para llamar al servicio web y evitar que el 
			// servicio utilice la URL que almacena internamente cuando se genero. 
			BindingProvider bp = (BindingProvider) cliente;
			bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, this.WEBSERVICE_ADDRESS);
			
			
			if (this.proxyConCifrado) {				
				// Se crea el proveedor de credenciales para recoger del keystore el certificado
				// con el que se firma (cifra) la llamada al servicio web.
				List<CredentialProvider> credProviders = new ArrayList<CredentialProvider>();
				CredentialProvider cp = new ClientBSTCredentialProvider(this.KEYSTORE_FILENAME, this.KEYSTORE_PASSWD, this.CERT_ALIAS, this.CERT_PASSWD, "JKS");
				credProviders.add(cp);
				
				// Se annade en los bindings todo lo necesario para que se firme (cifre) la llamada
				// al servicio web con el proveedor de credenciales creado anteriormente. 
				bp.getRequestContext().put(WSSecurityContext.CREDENTIAL_PROVIDER_LIST, credProviders);
				bp.getRequestContext().put(WSSecurityContext.TRUST_MANAGER, new TrustManager() {
					public boolean certificateCallback(X509Certificate[] chain, int validateErr) {
						return true;
					}
				});
				
				
			}
		}
		
		return cliente;
		
	}

	/**
	 * Si se invoca con seguridad como esta en el ejemplo, NO FUNCIONA. 
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		String ADDRESS = new String(
				"https://pre.osb.osakidetza.net/osakidetza/negocio/corporativo/cdc/PacientesWebService_v1/PacientesWebServiceWS?WSDL");
		String NAMESPACE = new String("http://xmlns.osakidetza.com/cdc");
		String WEBSERVICENAME = new String("PacientesWebService");
		String KEYSTOREFILENAME = "E:/utils/cert_OPE_PRE/wss_b73.jks";
		String KEYSTOREPASSWD = "Os4k1d3tz4";
		String CERTALIAS = "b73-ope pre-produccion (osakidetza-sx77700subca01)";
		String KEYPASSWD = "Os4k1d3tz4";

		try {

			Auditoria auditoria = new Auditoria();
			auditoria.setCicLogin(new BigInteger("1233303"));
			auditoria.setCicPaciente(new BigInteger("1233303"));
			auditoria.setCodigoAplicacion("Z33");
			auditoria.setDniLogin("2032323232K");
			auditoria.setDniPaciente("32345343L");
			auditoria.setTimestamp(new BigInteger(new Long(System.currentTimeMillis()).toString()));
			auditoria.setTisLogin(new BigInteger("4367765"));
			auditoria.setTisPaciente(new BigInteger("5456534"));
			
			PacientesWSProxy proxy = new PacientesWSProxy(ADDRESS, NAMESPACE, WEBSERVICENAME, KEYSTOREFILENAME, KEYSTOREPASSWD, CERTALIAS, KEYPASSWD, auditoria);
			
			Paciente paciente = proxy.getCliente().buscarPacientePorCIC(123123);

			if (paciente != null) {
				System.out.println("Apellido1......" + paciente.getApellido1());
				System.out.println("Apellido2......" + paciente.getApellido2());
				System.out.println("Nombre......" + paciente.getNombre());
			}

			System.out.println("FIN!!");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
