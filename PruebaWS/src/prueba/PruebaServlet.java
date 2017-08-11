package prueba;

import java.io.IOException;
import java.net.URL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import net.euskadi.osakidetza.libs.wsclients.common.auditoria.AuditoriaOsakidetzaHeaderHandlerResolver;
import net.euskadi.osakidetza.libs.wsclients.k01.v1.security.PacientesWSProxy;
import net.euskadi.osakidetza.libs.wsclients.k01.v1.security.pacientesws.Paciente;
import net.euskadi.osakidetza.libs.wsclients.k01.v1.security.pacientesws.PacientesPortType;
import net.euskadi.osakidetza.libs.wsclients.k01.v1.security.pacientesws.PacientesWebService;
import weblogic.security.SSL.TrustManager;
import weblogic.wsee.security.bst.ClientBSTCredentialProvider;
import weblogic.xml.crypto.wss.WSSecurityContext;
import weblogic.xml.crypto.wss.provider.CredentialProvider;

/**
 * Servlet implementation class PruebaServlet
 */
public class PruebaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PruebaServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ADDRESS = new String(
				"https://pre.osb.osakidetza.net/osakidetza/negocio/corporativo/cdc/PacientesWebService_v1/PacientesWebServiceWS?WSDL");
		String NAMESPACE = new String("http://xmlns.osakidetza.com/cdc");
		String WEBSERVICENAME = new String("PacientesWebService");
		String KEYSTOREFILENAME = "E:/utils/cert_OPE_PRE/wss_b73.jks";
		String KEYSTOREPASSWD = "Os4k1d3tz4";
		String CERTALIAS = "b73-ope pre-produccion (osakidetza-sx77700subca01)";
		String KEYPASSWD = "Os4k1d3tz4";

		try {

			System.out.println("Obteniendo el proxy.");
			PacientesWSProxy proxy = new PacientesWSProxy(ADDRESS, NAMESPACE, WEBSERVICENAME, KEYSTOREFILENAME, KEYSTOREPASSWD, CERTALIAS, KEYPASSWD);

			System.out.println("Invocando el metodo buscarPacientePorCIC(123123)");
			Paciente paciente = proxy.getCliente().buscarPacientePorCIC(123123);

			System.out.println("Metodo invocado. Tratando resultados.");
			if (paciente != null) {
				System.out.println("Apellido1......" + paciente.getApellido1());
				System.out.println("Apellido2......" + paciente.getApellido2());
				System.out.println("Nombre......" + paciente.getNombre());
			}

			System.out.println("FIN!!");

		} catch (Exception ex) {
			ex.printStackTrace();
		}		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
