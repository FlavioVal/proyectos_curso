package principal;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Escritura {

	public static void main(String[] args) {
		String fichero = "dias.txt"; //guarda el archivo en la carpeta raiz donde esta el proyecto, y sobrescribe cada vez que se ejecute.
		try (PrintStream salida = new PrintStream(fichero);) {
			salida.println("lunes");
			salida.println("martes");
			salida.println("miercoles");
			salida.println("jueves");
			salida.close();// el PrintStream siempre se cierra.
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
