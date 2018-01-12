package presentacion;
/**
 * Ejemplo de como agregar contacto a una colección de tipo HashMap, usando un javabean 
 */
import java.util.Scanner;

import modelo.Contacto;
import modelo.GestionContactos;

public class Principal {

	public static void main(String[] args) {
		//creamos un objeto de la clase que contiene
				//la lógica de negocio
		        GestionContactos gcontactos=new GestionContactos();
		        Scanner sc=new Scanner(System.in);
		        String nombre,email,telefono;
		       
		        int op;//opcion elegida
		        do{
		           System.out.println("1.- Añadir contacto");
		           System.out.println("2.- Buscar contacto");
		           System.out.println("3.- Eliminar contacto");
		           System.out.println("4.- Mostrar todos");
		           System.out.println("5.- Salir");
		           op=Integer.parseInt(sc.nextLine());//no se debe combinar nexLine() y nexInt() u otro con la misma clase Scanner por que daria error 
		           switch(op){
		               case 1:
		                   System.out.println("Nombre:");
		                   nombre=sc.nextLine();
		                   System.out.println("Email:");
		                   email=sc.nextLine();
		                   System.out.println("Teléfono:");
		                   telefono=sc.nextLine();
		                   Contacto contacto = new Contacto(nombre,email,telefono);
		                   //llamada a los métodos del objeto de la lógica de negocio
		                   if(gcontactos.agregarContacto(contacto)) {
		                	   System.out.println("Contacto añadido:");
		                   }else {
		                	   System.out.println("Email repetido, no se ha podido añadir");
		                   }
		                   break;
		               case 2:
		            	   System.out.println("Email:");
		                   email=sc.nextLine();
		                   Contacto con=gcontactos.buscarContacto(email);
		                   if(con!=null) {
		                	   System.out.println(con.getNombre()+" "+con.getEmail()+" "+con.getTelefono()); 
		                   }else {
		                	   System.out.println("Contacto no encontrado"); 
		                   }
		                   break;
		               case 3:
		            	   System.out.println("Email:");
		                   email=sc.nextLine();
		                   if(gcontactos.eliminarContacto(email)) {
		                	   System.out.println("Contacto eliminado!"); 
		                   }else {
		                	   System.out.println("No existe ese email!"); 
		                   }
		                   break;
		               case 4:
		            	   Contacto[] todos=gcontactos.recuperarContactos();
		            	   for(Contacto s:todos) {
		            		   System.out.println(s.getNombre()+" "+s.getEmail()+" "+s.getTelefono());
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
