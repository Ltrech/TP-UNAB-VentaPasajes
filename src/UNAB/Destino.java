package UNAB;

import javax.swing.JOptionPane;

public class Destino {
	
	public String preguntarDestino() {
		 
		//Array con las ciudades destino
		String[] destinos = new String[] {"Brasil", "Peru", "Chile"};
		int seleccion = JOptionPane.showOptionDialog(null, "Seleccione Destino", "Destino",
				0, JOptionPane.QUESTION_MESSAGE, null, destinos, 0);
 
		return destinos[seleccion];
	}

}
