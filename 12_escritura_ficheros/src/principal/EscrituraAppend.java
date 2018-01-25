package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class EscrituraAppend {

	public static void main(String[] args) {
		String fichero = "D:\\manana\\dias.txt"; 
		try (FileOutputStream fs = new FileOutputStream(fichero, true);
				PrintStream salida= new PrintStream(fs);) {//todos los objetos que esten dentro del try con recursos se van a cerrar de manera automatica.y en orden inverso al declarado.
			salida.println("lunes");
			salida.println("martes");
			salida.println("miercoles");
			salida.println("jueves");		
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
