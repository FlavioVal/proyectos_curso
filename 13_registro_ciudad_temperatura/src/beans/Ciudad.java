package beans;

public class Ciudad {
	private String nomCiudad;
	private double temperatura;
	
	public Ciudad(String nomCiudad, double temperatura) {
		super();
		this.nomCiudad = nomCiudad;
		this.temperatura = temperatura;
	}

	public String getNomCiudad() {
		return nomCiudad;
	}

	public void setNomCiudad(String nomCiudad) {
		this.nomCiudad = nomCiudad;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

}
