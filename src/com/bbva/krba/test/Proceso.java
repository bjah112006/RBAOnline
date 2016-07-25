package com.bbva.krba.test;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.bbva.krba.krbabusiness.online.service.EntradaOnlineDTO;
import com.bbva.krba.krbabusiness.online.service.SalidaOnlineDTO;
import com.bbva.krba.krbabusiness.online.service.WSBB_RBAONLINE;
import com.bbva.krba.krbabusiness.online.service.WSBB_RBAONLINELocator;
import com.bbva.krba.krbabusiness.online.service.WSBB_RBAONLINESoapBindingStub;
import com.bbva.spring.gce.ErrorAplicacion;

public class Proceso {

	public java.lang.String getWsdl() throws java.io.IOException{
    	java.lang.String raiz = null;
    	java.util.Properties configProperties = new java.util.Properties();
    	java.io.FileInputStream file;
	    java.lang.String path = "./config.properties";
	    file = new java.io.FileInputStream(path);
	    configProperties.load(file);
	    file.close();
	    raiz = configProperties.getProperty("wsdl");
    	return raiz;
    }
	
	public SalidaOnlineDTO getRBAOnline(String[] datosent) throws ParseException{
		EntradaOnlineDTO bodreq = new EntradaOnlineDTO();
		
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		if(!datosent[4].equals("") && datosent[4].charAt(0)!=' '){
			Date fa = formatter.parse(datosent[4]);
			Calendar fecha_alta = Calendar.getInstance();
			fecha_alta.setTime(fa);
			bodreq.setFechaAlta(fecha_alta);
		}
		if(!datosent[20].equals("") && datosent[20].charAt(0)!=' '){
			Date fn = formatter.parse(datosent[20]);
			Calendar fecha_nacimiento = Calendar.getInstance();
			fecha_nacimiento.setTime(fn);
			bodreq.setFechaNacimiento(fecha_nacimiento);
		}
		if(!datosent[21].equals("") && datosent[21].charAt(0)!=' '){
			Date fc = formatter.parse(datosent[21]);
			Calendar fecha_constitucion = Calendar.getInstance();
			fecha_constitucion.setTime(fc);
			bodreq.setFechaConstitucion(fecha_constitucion);
		}
		
		//Date fa = formatter.parse(datosent[4]);
		//Date fn = formatter.parse(datosent[20]);
		//Date fc = formatter.parse(datosent[21]);
		
		//Calendar fecha_alta = Calendar.getInstance();
		//Calendar fecha_nacimiento = Calendar.getInstance();
		//Calendar fecha_constitucion = Calendar.getInstance();
		//fecha_alta.setTime(fa);
		//fecha_nacimiento.setTime(fn);
		//fecha_constitucion.setTime(fc);
				
		bodreq.setUidPeticion(datosent[0]);
		bodreq.setTipoProceso(datosent[1]);
		bodreq.setCodigoCliente(datosent[2]);
		bodreq.setTipoPersona(datosent[3]);
		bodreq.setIndPEP(datosent[5]);
		if(!datosent[6].equals("")){
			bodreq.setIndRAA(datosent[6]);
		}
		if(!datosent[7].equals("")){
			bodreq.setTipoNacionalidad(datosent[7]);
		}
		if(!datosent[8].equals("")){
			bodreq.setTipoResidencia(datosent[8]);
		}
				
		if(!datosent[9].equals("")){
		bodreq.setTemporal(datosent[9]);
		}
		if(!datosent[10].equals("")){
			bodreq.setTiempoResidente(Integer.valueOf(datosent[10]));
		}
		if(!datosent[11].equals("")){
			bodreq.setEmbajadas(datosent[11]);
		}
		if(!datosent[12].equals("")){
			bodreq.setTipoJuridica(datosent[12]);
		}
		if(!datosent[13].equals("")){
			bodreq.setOcupacion(datosent[13]);
		}
		if(!datosent[14].equals("")){
			bodreq.setActividad(datosent[14]);
		}
		if(!datosent[15].equals("")){
			bodreq.setProductoServicio(datosent[15]);
		}
		if(!datosent[16].equals("")){
			bodreq.setPaisNacionalidad(datosent[16]);
		}
		if(!datosent[17].equals("")){
			bodreq.setPaisResidencia(datosent[17]);
		}
		if(!datosent[18].equals("")){
			bodreq.setPaisNacimiento(datosent[18]);
		}
		if(!datosent[19].equals("")){
			bodreq.setCanal(datosent[19]);
		}
		if(!datosent[22].equals("")){
			bodreq.setSucursal(datosent[22]);
		}
		if(!datosent[23].equals("")){
			bodreq.setSegmento(datosent[23]);
		}
		if(!datosent[29].equals("")){
			bodreq.setPaisOpera(datosent[29]);
		}
		
		if(!datosent[24].equals("")){
			bodreq.setMontoNacional(Long.valueOf(datosent[24]));
		}
		if(!datosent[25].equals("")){
			bodreq.setMontoInternacional(Long.valueOf(datosent[25]));
		}
		if(!datosent[26].equals("")){
			bodreq.setMontoEfectivo(Long.valueOf(datosent[26]));
		}
		if(!datosent[27].equals("")){
			bodreq.setMontoCheques(Long.valueOf(datosent[27]));
		}
		if(!datosent[28].equals("")){
			bodreq.setMontoDivisas(Long.valueOf(datosent[28]));
		}
		/*
		bodreq.setRiesgoExtra1(Integer.valueOf(datosent[30]));
		bodreq.setRiesgoExtra2(Integer.valueOf(datosent[31]));
		bodreq.setRiesgoExtra3(Integer.valueOf(datosent[32]));
		bodreq.setRiesgoExtra4(Integer.valueOf(datosent[33]));
		bodreq.setRiesgoExtra5(Integer.valueOf(datosent[34]));
		bodreq.setRiesgoExtra6(Integer.valueOf(datosent[35]));
		bodreq.setRiesgoExtra7(Integer.valueOf(datosent[36]));
		bodreq.setRiesgoExtra8(Integer.valueOf(datosent[37]));
		bodreq.setRiesgoExtra9(Integer.valueOf(datosent[38]));
		bodreq.setRiesgoExtra10(Integer.valueOf(datosent[39]));
		*/
		/*
		System.out.println("DATOS DE ENTRADA:");
		System.out.println("Peticionario: "+datosent[0]);
		System.out.println("Tipo Proceso: "+datosent[1]);
		System.out.println("Codigo Cliente: "+datosent[2]);
		System.out.println("Tipo Persona: "+datosent[3]);
		System.out.println("Fecha Alta: "+datosent[4]);
		System.out.println("Indicador PEP: "+datosent[5]);
		System.out.println("Indicador RAA: "+datosent[6]);
		System.out.println("Tipo Nacionalidad: "+datosent[7]);
		System.out.println("Tipo Residencia: "+datosent[8]);
		System.out.println("Temporal: "+datosent[9]);
		System.out.println("Tiempo residente: "+datosent[10]);
		System.out.println("Embajadas: "+datosent[11]);
		System.out.println("Tipo juridica: "+datosent[12]);
		System.out.println("Ocupacion: "+datosent[13]);
		System.out.println("Actividad: "+datosent[14]);
		System.out.println("Producto: "+datosent[15]);
		System.out.println("Pais Nacionalidad: "+datosent[16]);
		System.out.println("Pais Residencia: "+datosent[17]);
		System.out.println("Pais Nacimiento: "+datosent[18]);
		System.out.println("Canal: "+datosent[19]);
		System.out.println("Fecha Nacimiento: "+datosent[20]);
		System.out.println("Fecha Constitucion: "+datosent[21]);
		System.out.println("Sucursal: "+datosent[22]);
		System.out.println("Segmento: "+datosent[23]);
		*/
		WSBB_RBAONLINE serv = new WSBB_RBAONLINELocator();
		
		java.net.URL url;
		
		SalidaOnlineDTO servres = null;
		
		try{
			url = new java.net.URL(serv.getOnlineServiceImplPortAddress());
			System.out.println("URI wsdl: "+url.toString());
			WSBB_RBAONLINESoapBindingStub respserv = new WSBB_RBAONLINESoapBindingStub(url, serv);
			servres = respserv.getConsultaOnline(bodreq);
			
		}catch(MalformedURLException e1){
			System.out.println("DATOS DE ENTRADA:");
			System.out.println("Peticionario: "+datosent[0]);
			System.out.println("Tipo Proceso: "+datosent[1]);
			System.out.println("Codigo Cliente: "+datosent[2]);
			System.out.println("Tipo Persona: "+datosent[3]);
			System.out.println("Fecha Alta: "+datosent[4]);
			System.out.println("Indicador PEP: "+datosent[5]);
			System.out.println("Indicador RAA: "+datosent[6]);
			System.out.println("Tipo Nacionalidad: "+datosent[7]);
			System.out.println("Tipo Residencia: "+datosent[8]);
			System.out.println("Temporal: "+datosent[9]);
			System.out.println("Tiempo residente: "+datosent[10]);
			System.out.println("Embajadas: "+datosent[11]);
			System.out.println("Tipo juridica: "+datosent[12]);
			System.out.println("Ocupacion: "+datosent[13]);
			System.out.println("Actividad: "+datosent[14]);
			System.out.println("Producto: "+datosent[15]);
			System.out.println("Pais Nacionalidad: "+datosent[16]);
			System.out.println("Pais Residencia: "+datosent[17]);
			System.out.println("Pais Nacimiento: "+datosent[18]);
			System.out.println("Canal: "+datosent[19]);
			System.out.println("Fecha Nacimiento: "+datosent[20]);
			System.out.println("Fecha Constitucion: "+datosent[21]);
			System.out.println("Sucursal: "+datosent[22]);
			System.out.println("Segmento: "+datosent[23]);
			e1.printStackTrace();
		}catch (ErrorAplicacion e) {
			System.out.println("DATOS DE ENTRADA:");
			System.out.println("Peticionario: "+datosent[0]);
			System.out.println("Tipo Proceso: "+datosent[1]);
			System.out.println("Codigo Cliente: "+datosent[2]);
			System.out.println("Tipo Persona: "+datosent[3]);
			System.out.println("Fecha Alta: "+datosent[4]);
			System.out.println("Indicador PEP: "+datosent[5]);
			System.out.println("Indicador RAA: "+datosent[6]);
			System.out.println("Tipo Nacionalidad: "+datosent[7]);
			System.out.println("Tipo Residencia: "+datosent[8]);
			System.out.println("Temporal: "+datosent[9]);
			System.out.println("Tiempo residente: "+datosent[10]);
			System.out.println("Embajadas: "+datosent[11]);
			System.out.println("Tipo juridica: "+datosent[12]);
			System.out.println("Ocupacion: "+datosent[13]);
			System.out.println("Actividad: "+datosent[14]);
			System.out.println("Producto: "+datosent[15]);
			System.out.println("Pais Nacionalidad: "+datosent[16]);
			System.out.println("Pais Residencia: "+datosent[17]);
			System.out.println("Pais Nacimiento: "+datosent[18]);
			System.out.println("Canal: "+datosent[19]);
			System.out.println("Fecha Nacimiento: "+datosent[20]);
			System.out.println("Fecha Constitucion: "+datosent[21]);
			System.out.println("Sucursal: "+datosent[22]);
			System.out.println("Segmento: "+datosent[23]);
			e.printStackTrace();
		} catch (RemoteException e2) {
			System.out.println("DATOS DE ENTRADA:");
			System.out.println("Peticionario: "+datosent[0]);
			System.out.println("Tipo Proceso: "+datosent[1]);
			System.out.println("Codigo Cliente: "+datosent[2]);
			System.out.println("Tipo Persona: "+datosent[3]);
			System.out.println("Fecha Alta: "+datosent[4]);
			System.out.println("Indicador PEP: "+datosent[5]);
			System.out.println("Indicador RAA: "+datosent[6]);
			System.out.println("Tipo Nacionalidad: "+datosent[7]);
			System.out.println("Tipo Residencia: "+datosent[8]);
			System.out.println("Temporal: "+datosent[9]);
			System.out.println("Tiempo residente: "+datosent[10]);
			System.out.println("Embajadas: "+datosent[11]);
			System.out.println("Tipo juridica: "+datosent[12]);
			System.out.println("Ocupacion: "+datosent[13]);
			System.out.println("Actividad: "+datosent[14]);
			System.out.println("Producto: "+datosent[15]);
			System.out.println("Pais Nacionalidad: "+datosent[16]);
			System.out.println("Pais Residencia: "+datosent[17]);
			System.out.println("Pais Nacimiento: "+datosent[18]);
			System.out.println("Canal: "+datosent[19]);
			System.out.println("Fecha Nacimiento: "+datosent[20]);
			System.out.println("Fecha Constitucion: "+datosent[21]);
			System.out.println("Sucursal: "+datosent[22]);
			System.out.println("Segmento: "+datosent[23]);
			e2.printStackTrace();
		}
		
		return servres;
	}
}
