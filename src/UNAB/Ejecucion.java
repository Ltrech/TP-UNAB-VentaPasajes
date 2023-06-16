package UNAB;

import javax.swing.JOptionPane;

public class Ejecucion {


	public static void main(String[] args) {
		
		Origen OR = new Origen();
		Destino DE= new Destino();

		OR.preguntarOrigen();
		DE.preguntarDestino();
		
		Pago pagos[] = new Pago[2];
		
		pagos[0]= new Pago("efectivo", "Tarjeta");
		for(Pago a : pagos ) {
			a.mostrarPago();
		
		
		
		//String[] fpago = new String[] {"Efectivo", "Tarjeta"};
		//int opcion= JOptionPane.showOptionDialog(null, "Seleccione Medio de Pago", "Medio De pago", 0, 0, null, fpago, "Efectivo");
		//int opTarjeta= 0;
		//for (int i=1; i<fpago.length; i++) {
		//	System.out.println("El pago seleccionado fue: " + opcion);
			//System.out.println("la Respuesta fue: " + fpago[opcion]);
			//if(opTarjeta== opcion[1])
			
			
		}
	
		
		
		
		
		

	}

}
