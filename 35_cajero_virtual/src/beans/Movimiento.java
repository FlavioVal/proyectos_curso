package beans;

public class Movimiento {
	private String tipo;
	private Double cantidad;
	public Movimiento(String tipo, Double cantidad) {
		
		this.tipo = tipo;
		this.cantidad = cantidad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getCantidad() {
		return cantidad;
	}
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Movimiento [tipo=" + tipo + ", cantidad=" + cantidad + "]";
	}
	
}
