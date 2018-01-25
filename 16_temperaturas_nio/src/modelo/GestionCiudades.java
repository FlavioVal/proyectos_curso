package modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import beans.Ciudad;

public class GestionCiudades {
	String fichero="ciudades.txt";
	Path pt;
	public GestionCiudades() {
		pt=Paths.get(fichero);
	}
	public void guardarCiudad(String nombre, double temp) {
		try(FileOutputStream fs=new FileOutputStream(fichero, true);
				PrintStream salida=new PrintStream(fs);){
			salida.println(nombre+"|"+temp);
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		} 
		catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
	public double temperaturaMedia() {
		double db=0.0;
		
			try {
				db=Files.lines(pt)
					.mapToDouble(s->Double.parseDouble(s.split("[|]")[1]))
					.average()
					.getAsDouble();
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
		return db;
	}
	
	public Ciudad ciudadMasCalurosa() {
		Ciudad cd=null;
		try{
			
			String linea=Files.lines(pt)
			.max((a,b)->(int)(Double.parseDouble(a.split("[|]")[1])-Double.parseDouble(b.split("[|]")[1])))
			.get();
			cd=new Ciudad(linea.split("[|]")[0],Double.parseDouble(linea.split("[|]")[1]));
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return cd;
	}
	public List<Ciudad> recuperarTodas(){
		List<Ciudad> ciudades=null;
		try{
			ciudades=Files.lines(pt)
			.map(s->new Ciudad(s.split("[|]")[0],Double.parseDouble(s.split("[|]")[1])))
			.collect(Collectors.toList());
			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return ciudades;
	}
}
