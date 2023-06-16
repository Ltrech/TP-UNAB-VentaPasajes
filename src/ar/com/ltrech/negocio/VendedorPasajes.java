package ar.com.ltrech.negocio;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import ar.com.ltrech.modelo.Aerolinea;
import ar.com.ltrech.modelo.Ciudad;
import ar.com.ltrech.modelo.TipoPago;
import ar.com.ltrech.modelo.TipoTransporte;

public class VendedorPasajes {

	public Ciudad indiqueDestino() {
		
		return null;
		
	}
	public List<Ciudad>	destinos(){
		List<Ciudad> destinos = new ArrayList<Ciudad>();
		destinos.add(new Ciudad("Mendoza"));
		destinos.add(new Ciudad("Buenos Aires"));
		destinos.add(new Ciudad("Jujuy"));
		return destinos;
		
	}
	
	public List<Ciudad>	origenes(){
		List<Ciudad> origenes = new ArrayList<Ciudad>();
		origenes.add(new Ciudad("Canada"));
		origenes.add(new Ciudad("Jamaica"));
		origenes.add(new Ciudad("EEUU"));
		return origenes;

	}
	
	public double calcularPrecio(Ciudad origen, Ciudad desitno, int cantPasajeros) {
		Random azar = new Random();
		return azar.nextInt(501);
		
		
	}
	
	public List<TipoTransporte>	aerolinea(){
		List<TipoTransporte> aerolinea = new ArrayList<TipoTransporte>();
		aerolinea.add(new Aerolinea("Latam"));
		aerolinea.add(new Aerolinea("Aerolineas Argentinas"));
		
		return aerolinea;

	}
	
	
	public List<TipoPago>pago(){
		List<TipoPago> pago= new ArrayList<TipoPago>();
		pago.add(new TipoPago("Efectivo"));
		pago.add(new TipoPago("Tarjeta de Credito"));
		
	return pago;
		}
}
