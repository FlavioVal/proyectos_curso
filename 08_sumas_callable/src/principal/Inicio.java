package principal;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import tareas.TareaSumador;

public class Inicio {

	public static void main(String[] args) {
		//Creación ExecuteService
		ExecutorService srv=Executors.newFixedThreadPool(3);
		//Creamos objeto Callable
		Callable<Long> cb= new TareaSumador(50);
		//Ponemos en ejecución la tarea.
		Future<Long> ft=srv.submit(cb);
		while(!ft.isDone()) {
			System.out.println("Esperando a que termine...");
		}
		try {
			System.out.println("Resultado final: "+ft.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//termina el ExecutorService
		srv.shutdown();	
		 
		}
		
	}


