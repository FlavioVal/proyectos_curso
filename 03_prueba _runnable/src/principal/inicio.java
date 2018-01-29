package principal;

import tareas.Ascendente;
import tareas.Descendente;

public class inicio {

	public static void main(String[] args) {
		//iniciar tarea en ejecuciçón concurrente
		Ascendente t1=new Ascendente();
		Descendente t2=new Descendente();

		Thread h1= new Thread(t1);
		Thread h2= new Thread(t2);
		h1.start();
		h2.start();
		
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
