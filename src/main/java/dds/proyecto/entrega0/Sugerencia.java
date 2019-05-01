package dds.proyecto.entrega0;

import java.util.ArrayList;
import java.util.List;

import dds.proyecto.entrega0.SugerenciaInvalidaException;

public class Sugerencia{

	
	public ArrayList<String> crearSugerencia(Ropero ropero) throws SugerenciaInvalidaException{
		try {
			
		ArrayList<String> sugerencia = new ArrayList<String>();

			sugerencia.add(this.obtenerAlAzar(ropero.prendasTorso));
			sugerencia.add(this.obtenerAlAzar(ropero.prendasPiernas));
			sugerencia.add(this.obtenerAlAzar(ropero.prendasPies));
		
			System.out.println("Sugerencia: " + sugerencia.get(0) + " - " + sugerencia.get(1) + " - " + sugerencia.get(2));
			return sugerencia;
		} catch(Exception e) {

			throw new SugerenciaInvalidaException(
					
					"Error: no hay suficientes prendas para crear una sugerencia valida.");
		}
	}
	
	
	public String obtenerAlAzar(ArrayList<String> unaLista)  {
	
	
				return unaLista.get(Math.max(
												0, 
												((int) Math.round(Math.random() * unaLista.size()))-1
											));
		
	}



	
}
