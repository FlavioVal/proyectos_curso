package principal;

import beans.Contador;
import tareas.Tarea;
/**
 * con el bloque synchronized nos aseguramos de sincronizar las instrucciones para que se realizen todas 
 * las operaciones. y ponemos el Thread.sleep(3000); en el main por que como es un hilo más, tenemos que darle un tiempo para 
 * que se ejucuten las tareas y poder ver el resultado de la prueba.
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
