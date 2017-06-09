package prueba;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Date;

import javax.activation.DataHandler;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import net.euskadi.osakidetza.libs.wsclients.b69.v1.security.OsaBIRTWSProxy;
import net.euskadi.osakidetza.libs.wsclients.b69.v1.security.osabirt.OsaBIRTParams;
import net.euskadi.osakidetza.libs.wsclients.b69.v1.security.osabirt.RunParamType;
import net.euskadi.osakidetza.libs.wsclients.b69.v1.security.osabirt.RunParamsMap;
import net.euskadi.osakidetza.libs.wsclients.common.auditoria.Auditoria;

/**
 * Servlet implementation class PruebaServlet
 */
public class PruebaServletOsaBIRT extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = -753594673884447887L;

	/**
     * Default constructor. 
     */
    public PruebaServletOsaBIRT() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ADDRESS = new String(
				"https://pre.osb.osakidetza.net/osakidetza/infraestructura/corporativo/osabirt/osaBIRT_v1/osaBIRTWS?WSDL");
		String NAMESPACE = new String("http://osakidetza.net/osaBIRT");
		String WEBSERVICENAME = new String("osaBIRTWS");
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

			
			OsaBIRTWSProxy proxy = new OsaBIRTWSProxy(ADDRESS, NAMESPACE, WEBSERVICENAME, KEYSTOREFILENAME, KEYSTOREPASSWD, CERTALIAS, KEYPASSWD, auditoria);
			OsaBIRTParams osabirtparams = new OsaBIRTParams();
			osabirtparams.setAppCliente("");
			osabirtparams.setAppPublicadora("a53_pre_activa");
			osabirtparams.setAppSolicitante("a53_pre_activa");
			osabirtparams.setInforme("Informe032ActHDMServ");
			osabirtparams.setLocale("es");
			osabirtparams.setFormato("");
			osabirtparams.setCentro("");
			osabirtparams.setOs("");
			RunParamsMap maparunparams = new RunParamsMap();
			RunParamType fechaDesde = new RunParamType();
			fechaDesde.setClave("fechaDesde");
			fechaDesde.setValue("20161201");
			
			RunParamType fechaHasta = new RunParamType();
			fechaHasta.setClave("fechaHasta");
			fechaHasta.setValue("20161201");

			RunParamType idCentro = new RunParamType();
			idCentro.setClave("idcentro");
			idCentro.setValue("62");

			RunParamType idOrgServ = new RunParamType();
			idOrgServ.setClave("idorgserv");
			idOrgServ.setValue("62");

			
			maparunparams.getEntry().add(fechaDesde);
			maparunparams.getEntry().add(fechaHasta);
			maparunparams.getEntry().add(idCentro);
			maparunparams.getEntry().add(idOrgServ);
			
			osabirtparams.setRunParams(maparunparams);
			
			DataHandler report = proxy.getCliente().getReportFromParams(osabirtparams);
			
			System.out.println("report conseguido!!!!!!!!!");
			InputStream reportIS = report.getInputStream();
			OutputStream reportOS = new FileOutputStream(new File("C:/tmp/report_" + new Date().getTime() + ".pdf"));
			IOUtils.copy(reportIS, reportOS);
			IOUtils.closeQuietly(reportOS);
			IOUtils.closeQuietly(reportIS);
			
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
