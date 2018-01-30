package tareas;

import java.util.concurrent.locks.Lock;

import beans.Contador;

public class Tarea implements Runnable {
	
	private Contador contador;
	Lock lc;
	public Tarea(Contador c, Lock lc) {
		contador=c;
		this.lc=lc;
	}

	@Override
	public void run() {
		//Es aconsejable poner todo el código dentro de un try-catch para asegurar que se ejecute el unlock(),
		//en caso de que aparezca una excepción.
		try {
			lc.lock();
			int n=contador.getValor();
			n++;			
			Thread.sleep(100);			
			contador.setValor(n);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			lc.unlock();
		}

	}

}
