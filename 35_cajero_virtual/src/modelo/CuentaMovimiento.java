package modelo;

import java.util.ArrayList;

import beans.Movimiento;

public class CuentaMovimiento extends Cuenta {
	private ArrayList<Movimiento> movs=new ArrayList<>();
	private double limite;
	public CuentaMovimiento(double inicio, double limite) {
		super(inicio);
		this.limite=limite;
		
	}
	
	@Override
	public void extraer(double c) {
		if(c<=limite) {
			movs.add(new Movimiento("extracción",c));
			super.extraer(c);
		}		
	}

	@Override
	public void ingresar(double c) {
		movs.add(new Movimiento("ingreso",c));
		super.ingresar(c);
	}

	public Movimiento[] recuperarMovimientos(){
		
		
		return movs.toArray(new Movimiento[0]);
	}
}
