package principal;

public class Inicio {

	public static void main(String[] args) {
		//iniciar tareas en ejecución concurrente
		Runnable t1=()->{
			for(int i=1;i<=100;i++) {
				System.out.println(i);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Runnable t2=()->{
			for(int i=100;i>=1;i--) {
				System.out.println(i);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread h1=new Thread(t1);
		h1.start();
		Thread h2=new Thread(t2);
		h2.start();
		for(int i=1;i<=100;i++) {
			System.out.println("esperando....");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
