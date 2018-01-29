package principal;

import beans.Contador;
import tareas.Tarea;
/**
 * Aqui cuando lo ejecutamos solo se ejcuta una tarea 
 * a las demas no le dá tiempo. y solo se incrementa la variable una vez.
 *
 */
public class Inicio {

	public static void main(String[] args) {
		Contador conta=new Contador(0);
		Tarea t1=new Tarea(conta);
		Tarea t2=new Tarea(conta);
		Tarea t3=new Tarea(conta);
		new Thread(t1).start();
		new Thread(t2).start();
		new Thread(t3).start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(conta.getValor());

	}

}
