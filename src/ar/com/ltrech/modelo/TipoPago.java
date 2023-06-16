package ar.com.ltrech.modelo;

public class TipoPago {

	private String nombre;

	public TipoPago(String nombre) {
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
