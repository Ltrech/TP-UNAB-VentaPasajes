package ar.com.ltrech.vista;

import java.util.List;

import javax.swing.JOptionPane;

import UNAB.Pago;
import ar.com.ltrech.modelo.Aerolinea;
import ar.com.ltrech.modelo.Ciudad;
import ar.com.ltrech.modelo.TipoPago;
import ar.com.ltrech.modelo.TipoTransporte;
import ar.com.ltrech.negocio.VendedorPasajes;

public class Pantalla {

	public static void main(String[] args) {

		VendedorPasajes ventaPasaje = new VendedorPasajes();
		
		
		
		int cantPersonas = Integer.parseInt(JOptionPane.showInputDialog("Indique cantidad de Pasajes a Comprar"));
		System.out.println("Usted Selecciono: " + cantPersonas + " Pasajes");
		
		List<Ciudad> destinos = ventaPasaje.destinos();
		List<Ciudad> origenes = ventaPasaje.origenes();
		List<TipoTransporte> aerolineas = ventaPasaje.aerolinea();
		List<TipoPago> fpago= ventaPasaje.pago();
		
		
	

		int CatPersonas = JOptionPane.showOptionDialog(null, "Seleccione Lugar de Partida", "Partida", 0,
		JOptionPane.QUESTION_MESSAGE, null, origenes.toArray(), 0);

		Ciudad ciudadOrigen = origenes.get(CatPersonas);
		System.out.println("Lugar de Partida: " + origenes.get(CatPersonas));

		int indiqueDestino = JOptionPane.showOptionDialog(null, "Seleccione Destino", "Destino", 0,
		JOptionPane.QUESTION_MESSAGE, null, destinos.toArray(), 0);
		Ciudad ciudadDestino = destinos.get(indiqueDestino);
		
		System.out.println("Lugar de Destino: " + destinos.get(indiqueDestino));
		
		double precioTotal = ventaPasaje.calcularPrecio(ciudadOrigen, ciudadDestino, cantPersonas);
		System.out.println("Cada pasaje le sale: " + precioTotal);
		System.out.println("El valor del total de  pasaje es de : " + precioTotal * cantPersonas );
		
		int indiqueAerolinea = JOptionPane.showOptionDialog(null, "Seleccione Aerolinea", "Aerolinea", 0,
		JOptionPane.QUESTION_MESSAGE, null, aerolineas.toArray(), 0);
		TipoTransporte aerolinea = aerolineas.get(indiqueAerolinea);
		System.out.println("Usted Selecciono: " + aerolinea.getNombre());
		
		int formaPago = JOptionPane.showOptionDialog(null, "Seleccione Forma de pago", "Pago", 0,
				JOptionPane.DEFAULT_OPTION, null,fpago.toArray(), 0);
		
		System.out.println("Usted selecciono la forma de pago: " + fpago.get(formaPago));
		
		
	}

}
