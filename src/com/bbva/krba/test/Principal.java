package com.bbva.krba.test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

import com.bbva.krba.krbabusiness.online.service.SalidaOnlineDTO;
import com.bbva.krba.test.Entrada;
import com.bbva.krba.test.Salida;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		Entrada ent = new Entrada();
		KeyStore truststore = new KeyStore();
		truststore.setKeyStoreroot(ent.getKeyData().getKeyStoreroot());
		truststore.setKeyStorepass(ent.getKeyData().getKeyStorepass());
		truststore.setKeyStoretype(ent.getKeyData().getKeyStoretype());
		System.setProperty("javax.net.ssl.trustStore", truststore.getKeyStoreroot());
		System.setProperty("javax.net.ssl.trustStorePassword", truststore.getKeyStorepass());
		System.setProperty("javax.net.ssl.trustStoreType", truststore.getKeyStoretype());
		
		String raiz = null;
		String ruta = null;
		String rutaifile = null;
		String rutaofile = null;
		String[] datosentrada = null;
		int tiporesultado;
		int cod_mensaje=0;
		
		Salida sal = new Salida();
		Proceso proc = new Proceso();
		SalidaOnlineDTO result = new SalidaOnlineDTO();
		
		raiz = ent.getRaiz();
		
		ruta = ent.getRuta(args, raiz);
		
		rutaifile = ent.getRutaInputFile(ruta);
		
		datosentrada = ent.leerDatos(rutaifile);
				
		try {
			result = proc.getRBAOnline(datosentrada);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rutaofile=sal.getRutaOutputFile(ruta);
		sal.saveData(rutaofile, result);
		
		
	}

}
