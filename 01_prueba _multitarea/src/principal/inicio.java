package principal;

import tareas.Ascendente;
import tareas.Descendente;

public class inicio {

	public static void main(String[] args) {
		//iniciar tarea en ejecuci��n concurrente
		Ascendente t1=new Ascendente();
		Descendente t2=new Descendente();
		t1.start();
		t2.start();
	//para demostrar que el programa tiene 3 hilos incluidos el main	
		for(int i=1; i<=100; i++) {
			System.out.println("esperando ...");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
