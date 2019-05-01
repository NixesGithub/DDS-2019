package dds.proyecto.entrega0;

import java.util.ArrayList;
import java.util.List;
import dds.proyecto.entrega0.SugerenciaInvalidaException;

/**
 * Hello world!
 *
 */
public class App {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {

		Ropero ropero = new Ropero();
		

		  ropero.agregarPrendaTorso("remera blanca");
		  ropero.agregarPrendaTorso("remera negra");
		  ropero.agregarPrendaTorso("buzo");
		  ropero.agregarPrendaTorso("campera");
		  ropero.agregarPrendaPiernas("calzon");
		  ropero.agregarPrendaPiernas("pantalon jean");
		  ropero.agregarPrendaPies("medias");
		  ropero.agregarPrendaPies("zapatillas");
		  
		  System.out.println(ropero.prendasPiernas);
			System.out.println(ropero.prendasPies);
			System.out.println(ropero.prendasTorso);
			
			Sugerencia sugerencia = new Sugerencia();
			sugerencia.crearSugerencia(ropero);
			

		}

		catch (Exception e) {
			System.out.println("No se pudo correr el programa");
		}
	}


}




