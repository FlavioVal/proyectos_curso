package modelo;

import java.util.Collection;
import java.util.HashMap;

public class GestionContactos {
	HashMap<String,Contacto> agenda=new HashMap<>();
	
	public boolean agregarContacto(String email, String nombre,String telefono) {
		//se añade si la clave no está ocupada
		if(!agenda.containsKey(email)) {
			Contacto c=new Contacto(nombre,email,telefono);
			agenda.put(email, c);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean agregarContacto(Contacto c) {
		return agregarContacto(c.getEmail(),c.getNombre(),c.getTelefono());
	}
	
	public Contacto buscarContacto(String email) {
		return agenda.get(email);
	}
	public boolean eliminarContacto(String email) {
		if(agenda.containsKey(email)) {
			agenda.remove(email);
			return true;
		}else {
			return false;
		}
	}
	public Contacto[] recuperarContactos() {
		Collection<Contacto> nombres=agenda.values();
		return nombres.toArray(new Contacto[0]);
	}
	
}
