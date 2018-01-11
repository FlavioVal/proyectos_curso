package principal;

import java.io.NotActiveException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * menu
 * 1.-Añadir nota
 * 2.-Ver aprobados
 * 3.-Nota media
 * 4.-Mostrar Todas
 * 5.-Salir
 */
public class Main {
	static ArrayList<Float> listanotas=new ArrayList<>();
	static ArrayList<Float> listAprobados=new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int op;
		
		do {
			System.out.println("1.- Añadir nota");
			System.out.println("2.- Ver aprobados");
			System.out.println("3.- Nota media");
			System.out.println("4.- Mostrar todas");
			System.out.println("5.- Salir");
			op=Integer.parseInt((sc.nextLine()));	
			switch(op) {
			case 1:
				System.out.print("Nota:");
				Float nota=Float.parseFloat(sc.nextLine());
				addNota(nota);
				break;
			case 2:
				ArrayList<Float> ap=aprobados();
				for(Float n:ap) {
					System.out.print(n+" ; ");
				}
				break;
			case 3:
				System.out.println("La media es: "+media());
				break;
			case 4:
				mostrarNotas();
				break;
			case 5:
				break;			
			default:
				System.out.println("Ingrese nota valida.");
			}
		}while(op!=5);
		

	}//fin de main.
	
	private static void addNota(Float n) {
		if(n<=0 && n<=10) {
			listanotas.add(n);
		}
	}
	
	private static ArrayList<Float> aprobados() {
		
		for(Float n:listanotas) {
			if(n>5) {
				listAprobados.add(n);
			}
		}
		return listAprobados;
		
	}
	
	private static Float media() {
		Float media=(float)0;
		for(Float n:listanotas) {
			media=media+n;
		}
		return (media=media/listanotas.size());	 
	}
	
	private static void mostrarNotas() {
		for(Float n:listanotas) {
			System.out.println(n+ " ; ");
		}
	}
	
}
