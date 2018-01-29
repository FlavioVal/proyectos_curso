package tareas;

public class Ascendente extends Thread {

	//sobreesccribir el método run()
	@Override
	public void run() {
		for(int i=1; i<=100;i++) {
			System.out.println(i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	
}
