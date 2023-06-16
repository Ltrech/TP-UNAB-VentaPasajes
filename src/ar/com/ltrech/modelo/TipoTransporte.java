package ar.com.ltrech.modelo;

public class TipoTransporte {
	
	private String nombre;

	public TipoTransporte(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}
	

}
