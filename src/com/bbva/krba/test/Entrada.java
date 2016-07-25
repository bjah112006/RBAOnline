package com.bbva.krba.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Entrada {

	Proceso proc = new Proceso();
	
	public static String getRaiz() throws IOException{

	    String raiz = null;

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
	    raiz = configProperties.getProperty("directory");

	    return raiz;
	}
	
	public String getRuta(String[] puesto, String raiz){
		
		String ruta = null;
		
		ruta=raiz+puesto[0]+"/";
		
		return ruta;
	}
	
	public static String getRutaInputFile(String ruta) throws IOException{
		
		String rutaifile = null;
	    String ifile = null;

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
	    ifile = configProperties.getProperty("ifile");
	    
	    rutaifile = ruta+ifile;
	    
	    return rutaifile;
	}
	
	public String[] leerDatos(String rutaifile) throws IOException{
		
		String cadena=null;
		String[] datos = new String[40];
		int o=0;
		
		File finput = new File(rutaifile);
		
		FileReader f=null;
		try {
			f = new FileReader(rutaifile);
			System.out.println("Leyendo datos del archivo: \r\n"+rutaifile);
			BufferedReader b = new BufferedReader(f);
		    try {
				while((cadena = b.readLine())!=null || o<40) {
					
					if(o>23){
						datos[o]="";
					}else{
						if(cadena==null){
							datos[o]="";
						}else{
							/*Cambio leer sin espacios*/
							datos[o]=cadena.toString();
						}
					}
					//System.out.println("dato["+o+"]="+datos[o]);
					o=o+1;
				}		
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		    b.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			datos=null;
		}
	    
		if(finput.delete()){
			System.out.println("El fichero ha sido borrado satisfactoriamente");
		}else{
			System.out.println("El fichero no puede ser borrado");
		}
		
	    return datos;
	}
	
	public KeyStore getKeyData(){
		KeyStore keydata = new KeyStore();
		
		Properties configProperties = new Properties();

		FileInputStream file;
		//the base folder is ./, the root of the main.properties file  
	    String path = "./config.properties";
	    //load the file handle for main.properties
	    try {
			file = new FileInputStream(path);
			configProperties.load(file);
			file.close();
			
			keydata.setKeyStoreroot(configProperties.getProperty("tsroot"));
		    keydata.setKeyStorepass(configProperties.getProperty("tspass"));
		    keydata.setKeyStoretype(configProperties.getProperty("tstype"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return keydata;
	}
}
