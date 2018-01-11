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
	Float nota;
	static Float media;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		menu();

	}
	
	private static void addNota(Float nota) {
		listanotas.add(nota);
	}
	
	private static ArrayList<Float> aprobados() {
		
		for(Float n:listanotas) {
			if(n<5) {
				listAprobados.add(n);
			}
		}
		return listAprobados;
		
	}
	
	private static Float media() {
		
		for(Float n:listanotas) {
			media=media+n;
		}
		media=media/listanotas.size();
		return media;
	}
	
	private static void mostrarNotas() {
		for(Float n:listanotas) {
			System.out.println(n);
		}
	}
	
	private static void menu() {
		System.out.println("************* Menu *************");
		System.out.println("1.- Añadir nota");
		System.out.println("2.- Ver aprobados");
		System.out.println("3.- Nota media");
		System.out.println("4.- Añadir nota");
		System.out.println("5.- Mostrar todas");
		System.out.println("6.- Salir");
	}

}
