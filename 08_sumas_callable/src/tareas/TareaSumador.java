package tareas;

import java.util.concurrent.Callable;

public class TareaSumador implements Callable<Long> {
	private int n;
	public TareaSumador(int n) {
		this.n=n;
	}

	@Override
	public Long call() {
		long suma=0;
		for(int i=1;i<=n;i++) {
			suma=suma+i;
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return suma;
	}

}
