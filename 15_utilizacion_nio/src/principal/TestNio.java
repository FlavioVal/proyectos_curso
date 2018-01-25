package principal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class TestNio {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String fichero="d:\\manana\\copiadias.txt";
		Path pt=Paths.get(fichero);
		//Files.copy(pt, new FileOutputStream("d:\\temporal\\copia.txt"));
		ArrayList<String> masDias=new ArrayList<>();
		masDias.add("lunes");masDias.add("jueves");masDias.add("viernes");
		masDias.add("sabado");masDias.add("domingo");
		//Files.write(pt,masDias);//sobreescribe el archivo cada vez que se ejecuta
		Files.write(pt,masDias,StandardOpenOption.APPEND);//va añadiendo nuevos elementos al archivo
	}

}
