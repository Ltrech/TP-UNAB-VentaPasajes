package UNAB;

import javax.swing.JOptionPane;

public class Origen {
	
	public  String preguntarOrigen() {
		 
		//Array con las ciudades origen
		String[] origenes = new String[] {"Briloche", "Cordoba", "Buenos Aires"};
 
		int seleccion = JOptionPane.showOptionDialog(null, "Seleccione Origen", "Origen",
				0, JOptionPane.QUESTION_MESSAGE, null, origenes, 0);
		return origenes[seleccion];
	}
	
	
}
