package dds.proyecto.entrega0;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class RoperoTienePrendasTest 
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
		  ropero.agregarPrendaPies("medias");
		  ropero.agregarPrendaPies("zapatillas");
		  	
	  }
	  
		  @Test
		  public void prendasTorsoTienePrendas() {
		 
			Assert.assertFalse(ropero.prendasTorso.isEmpty());
		  }
 
		  @Test
		  public void prendasPiernasTienePrendas() {
		    Assert.assertFalse(ropero.prendasPiernas.isEmpty());
		  }

		  @Test
		  public void prendasPiesTienePrendas() {
		    Assert.assertFalse(ropero.prendasPies.isEmpty());
		  }

		}

