package modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import beans.Ciudad;

public class GestionDatos {
//	private ArrayList<Ciudad> listaCiudad;
//	private Ciudad ciudad;
	private String fichero= "D:\\manana\\datosCiudad.txt"; ;
	
	public void registrar(String nomCiudad,double temperatura) {
	//primero creo objeto Ciudad y Registro sus datos	
//		listaCiudad= new ArrayList<>();
//		ciudad=new Ciudad(nomCiudad,temperatura);
//		listaCiudad.add(ciudad);
	
	//Segundo creo fichero externo y registro su datos en el fichero	
		try (FileOutputStream fs = new FileOutputStream(fichero, true);
				PrintStream salida= new PrintStream(fs);) {//todos los objetos que esten dentro del try con recursos se van a cerrar de manera automatica.y en orden inverso al declarado.
			salida.println(nomCiudad+"|"+temperatura);		
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}//fin de registrar
	
	/*
	public double tempMedia(ArrayList<Ciudad> lista) {
		double media=0.0;
		for(int i=0;i<lista.size();i++) {
			media+=lista.get(i).getTemperatura();
		}
		return media;
	}//fin de tempMedia
	*/
	
	public double temperaturaMedia() {//más eficiente que trabajar con ArrayList es trabajar con archivos de texto externo.
		double media=0.0;
		try(FileReader fr= new FileReader(fichero);
				BufferedReader bf= new BufferedReader(fr);){
			media=bf.lines().mapToDouble(s->Double.parseDouble(s.split("[|]")[1]))
					.average()
					.getAsDouble();//con expresiones lambda
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return media;
	}
	
	public Ciudad ciudadMasCalurosa() {
		Ciudad cd=null;
		try(FileReader fr= new FileReader(fichero);
				BufferedReader bf= new BufferedReader(fr);){
			
			String linea= bf.lines()
					.max((a,b)->(int)(Double.parseDouble(a.split("[|]") [1])-Double.parseDouble(b.split("[|]")[1])))
					.get();
			cd=new Ciudad(linea.split("[|]")[0],Double.parseDouble(linea.split("[|]")[1]));
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return cd;
	}
	
		public List<Ciudad> recuperarTodas(){
			List<Ciudad> ciudades=null;
			try(FileReader fr=new FileReader(fichero);
					BufferedReader bf=new BufferedReader(fr);){
				ciudades=bf.lines()
				.map(s->new Ciudad(s.split("[|]")[0],Double.parseDouble(s.split("[|]")[1])))
				.collect(Collectors.toList());
				
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
			return ciudades;
		}
	}
