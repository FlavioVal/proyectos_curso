package tareas;

import beans.Contador;
/**
 * en inicio se crea 3 tareas t1, t2, t3 y cuando se ejecuta en modo  multitarea
 * cuando se duerme se le acaba el tiempo y nunca llega incrementarse el valor de n.
 *
 */
public class Tarea implements Runnable {
	
	private Contador contador;
	public Tarea(Contador c) {
		contador=c;
	}

	@Override
	public void run() {
		int n=contador.getValor();
		n++;
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contador.setValor(n);

	}

}
