package dds.proyecto.entrega0;

import org.junit.Before;
import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class SugerenciaInvalidaTest
{
   private   Ropero ropero = new Ropero();
   
	  @Before
	  public void init() {
		
		  ropero.agregarPrendaTorso("remera blanca");
		  ropero.agregarPrendaTorso("remera negra");
		  ropero.agregarPrendaTorso("buzo");
		  ropero.agregarPrendaTorso("campera");
		  ropero.agregarPrendaPiernas("calzon");
		  ropero.agregarPrendaPiernas("pantalon jean");
		  
		 
	  }
	  
		  @Test(expected = SugerenciaInvalidaException.class)
		  public void sugerenciaInvalida() {
			  
			  Sugerencia sugerencia = new Sugerencia();
			  sugerencia.crearSugerencia(ropero);
		  }
 
		 

		}


