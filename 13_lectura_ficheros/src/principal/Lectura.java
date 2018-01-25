package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {

	public static void main(String[] args) {
		String fichero= "D:\\manana\\dias.txt";
		try(FileReader fr= new FileReader(fichero);
				BufferedReader bf= new BufferedReader(fr);){
	/*		String s;//para ir leyendo las lineas
			while((s=bf.readLine())!=null) {
				System.out.println(s);	
			}*/
			bf.lines().forEach(System.out::println);//con expresiones lambda
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}

	}

}
