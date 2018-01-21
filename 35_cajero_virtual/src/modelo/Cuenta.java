package modelo;

import java.util.ArrayList;

public class Cuenta {
	private double saldo;
	ArrayList<Double> listaIngresos;
	
	public Cuenta(double saldo) {
		this.saldo=saldo;
	}
	
	public void ingresar(double cant) {
		listaIngresos=new ArrayList<Double>();
		if(cant>0) {
			listaIngresos.add(cant);
			saldo+=cant;			
		}else {
			System.out.println("Ingresar Cantidad Valida. !");
		}
	}
	
	public void extraer(double cant) {
		saldo -= cant;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
