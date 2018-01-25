package presentacion;

import java.util.Scanner;

import beans.Movimiento;
import modelo.CuentaMovimiento;

/*
 Al iniciar el programa, se solicita al usuario el saldo inicial y
 el límite de la cuenta.
 Aparece el siguiente menú:
 1. Ingresar
 2. Extraer
 3. Movimientos y saldo
 4. Salir
 
 1. Se solicita la cantidad a ingresar y se procede al ingreso
 2. Se solicita la cantidad a extraer, si es inferior o igual al límite
 se realiza la extracción
 3. Muestra los movimientos realizados en la cuenta y el saldo final. Cada 
 movimiento se caracteriza por un tipo (ingreso o extracción) y una cantidad
 */
public class Cajero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        double cantidad,saldo,limite;
        int op;//opcion elegida
		System.out.println("Saldo inicial: ");
		saldo=Double.parseDouble(sc.nextLine());
		System.out.println("Límite a extraer: ");
		limite=Double.parseDouble(sc.nextLine());
		        CuentaMovimiento cm=new CuentaMovimiento(saldo,limite);
		        
		        
		        do{
		           System.out.println("1.- Extraer");
		           System.out.println("2.- Ingresar");
		           System.out.println("3.- Saldo");
		           System.out.println("4.- Movimientos");
		           System.out.println("5.- Salir");
		           op=Integer.parseInt(sc.nextLine());
		           switch(op){
		               case 1:
		                   System.out.println("Cantidad:");
		                   cantidad=Double.parseDouble(sc.nextLine());
		                   cm.extraer(cantidad);
		                   break;
		               case 2:
		            	   System.out.println("Cantidad:");
		                   cantidad=Double.parseDouble(sc.nextLine());
		                   cm.ingresar(cantidad);
		                   break;
		                  
		               case 3:
		            	   System.out.println("Su saldo es: "+cm.getSaldo()); 
		                   break;
		               case 4:
		            	   Movimiento[] movs=cm.recuperarMovimientos();
		            	   for(Movimiento m:movs) {
		            		   //System.out.println(con.getNombre()+"-"+con.getEmail()+"-"+con.getEdad());
		            		   System.out.println(m);//se llama al objeto m por que el toString se ha sobreescrito en el bean
		            	   }
		            	   break;
		               case 5:
		                   break;
		               default:
		                   System.out.println("debes escribir una opción válida");
		           }
		        }while(op!=5);

	}

}
