package principal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import beans.Contador;
import tareas.Tarea;

public class Inicio {

	public static void main(String[] args) {
		Contador conta=new Contador(0);
		Lock lc=new ReentrantLock();
		Tarea t1=new Tarea(conta,lc);
		Tarea t2=new Tarea(conta,lc);
		Tarea t3=new Tarea(conta,lc);
		ExecutorService ex=Executors.newFixedThreadPool(3);
		Future f1=ex.submit(t1);
		Future f2=ex.submit(t2);
		Future f3=ex.submit(t3);

		while(!f1.isDone()||!f2.isDone()||!f3.isDone()) {}
		System.out.println(conta.getValor());
		ex.shutdown();
	}

}
