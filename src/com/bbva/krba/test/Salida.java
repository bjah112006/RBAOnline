package com.bbva.krba.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import com.bbva.krba.krbabusiness.online.service.SalidaOnlineDTO;
import com.bbva.krba.test.Proceso;
import com.bbva.krba.krbabusiness.online.service.SalidaOnlineDTO;;

public class Salida {

	public String getRutaOutputFile(String ruta) throws IOException{
		String rutaofile = null;
	    String ofile = null;

	    //to load application's properties, we use this class
	    Properties configProperties = new Properties();

	    FileInputStream file;

	    //the base folder is ./, the root of the main.properties file  
	    String path = "./config.properties";

	    //load the file handle for main.properties
	    file = new FileInputStream(path);

	    //load all the properties from this file
	    configProperties.load(file);

	    //we have loaded the properties, so close the file handle
	    file.close();

	    //retrieve the property we are intrested, the app.version
	    ofile = configProperties.getProperty("ofile");
	    
	    rutaofile = ruta+ofile;
	    
	    return rutaofile;
	}

	public void createOutputFile(String rutaofile) {
		File archivo = new File(rutaofile);
		
		try {
			  // A partir del objeto File creamos el fichero físicamente
			  if (archivo.createNewFile()){
			    System.out.println("El fichero se ha creado correctamente");
			  }else{
			    archivo.delete();
			  	archivo.createNewFile();
				System.out.println("fichero Output existía. Se borró y creó uno nuevo");}
			} catch (IOException ioe) {
			  ioe.printStackTrace();
			}
	}
	
	public void saveData(String rutaofile, SalidaOnlineDTO resultado){
		
		FileWriter fichero = null;
		Proceso proces =new Proceso();
		
		try{
			fichero = new FileWriter(rutaofile);
			int i = resultado.getDocumentos().length;
			
			fichero.write(resultado.getUidPeticion() + "\r\n");
			fichero.write(resultado.getCodigoCliente() + "\r\n");
			fichero.write(resultado.getRiesgo() + "\r\n");
			fichero.write(resultado.getDiligencia());
			
			if(i>0){
				for(int j=0;j<i;j++){
					fichero.write("\r\n" + resultado.getDocumentos()[j].getNombre());
					fichero.write("\r\n" + resultado.getDocumentos()[j].getTipo());
				}
			}
			
			fichero.close();
			System.out.println("Se guardó exitosamente el resultado..");
			
		}catch(Exception ex){
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
	}

}
