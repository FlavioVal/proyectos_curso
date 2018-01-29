package principal;

import tareas.Tabla;

public class Inicio {

	public static void main(String[] args) {
		Tabla t1=new Tabla(7);
		Tabla t2=new Tabla(3);
		Tabla t3=new Tabla(5);
		t1.start();t2.start();t3.start();

	}

}
