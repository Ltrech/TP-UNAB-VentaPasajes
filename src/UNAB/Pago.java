package UNAB;


public class Pago {
	
	private String efectivo;
	private String tarjeta;
	
	public Pago(String efectivo, String tarjeta) {
		super();
		this.efectivo = efectivo;
		this.tarjeta = tarjeta;
	}

	public String getEfectivo() {
		return efectivo;
	}

	public void setEfectivo(String efectivo) {
		this.efectivo = efectivo;
	}

	public String getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}

	public void mostrarPago() {
		System.out.println("El pago Fue en: " + efectivo);
		System.out.println("El pago Fue en: " + tarjeta);
	}
	
	
//	public int preguntarMedioPago() {
		//String[] medios = new String[] {"Efectivo", "Tarjeta"};
 
		//return JOptionPane.showOptionDialog(null, "Seleccione Medio de Pago", "Medios de Pago",
			//	0, JOptionPane.QUESTION_MESSAGE, null, medios, 0);
	//}
 
}
