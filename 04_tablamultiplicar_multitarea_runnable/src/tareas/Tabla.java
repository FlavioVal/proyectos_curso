package tareas;

public class Tabla implements Runnable {
	private int num;
	
	public Tabla(int n) {
		num=n;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+num*i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
