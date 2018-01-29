package principal;

import tareas.Tabla;

public class Inicio {

	public static void main(String[] args) {
		Tabla t1=new Tabla(7);
		Tabla t2=new Tabla(3);
		Tabla t3=new Tabla(5);
		
		Thread h1= new Thread(t1);
		Thread h2= new Thread(t2);
		Thread h3= new Thread(t3);
		
		h1.start();h2.start();h3.start();

	}

}
