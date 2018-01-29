package tareas;

public class Descendente implements Runnable {

	@Override
	public void run() {
		for (int i =100; i>=1; i--) {
			System.out.println(i);
			try {
				Thread.sleep(50);//nos permite visualizar los cambios cuando se ejecuta el método run
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
