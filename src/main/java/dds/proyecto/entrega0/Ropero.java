package dds.proyecto.entrega0;

import java.util.ArrayList;
import java.util.List;

//no me dejaba crearla como clase estatica, tiraba error.
public class Ropero {

	public ArrayList<String> prendasTorso = new ArrayList<String>();
	public ArrayList<String> prendasPiernas = new ArrayList<String>();
	public ArrayList<String> prendasPies = new ArrayList<String>();
	public ArrayList<String> accesoriosOpcionales = new ArrayList<String>();

	public void agregarPrendaTorso(String unaPrenda) {
		this.prendasTorso.add(unaPrenda);
		
	}
	public void agregarPrendaPiernas(String unaPrenda) {
		this.prendasPiernas.add(unaPrenda);
		
	}
	public void agregarPrendaPies(String unaPrenda) {
		this.prendasPies.add(unaPrenda);
		
	}
	public ArrayList<String> getPrendasTorso() throws Exception {
		if(prendasTorso.isEmpty()) {
			throw new Exception("no hay prendas para el torso");
		}else {
		return prendasTorso;
		}
	}
	
	public ArrayList<String> getPrendasPiernas() throws Exception {
		if(prendasPiernas.isEmpty()) {
			throw new Exception("no hay prendas para las piernas");
		}else {
		return prendasPiernas;
	}
	}
	
	public ArrayList<String> getPrendasPies() throws Exception {
		if(prendasPies.isEmpty()) {
			throw new Exception("no hay prendas para los pies");
		}else {
		return prendasPies;
		}
	}
	
	public ArrayList<String> getAccesoriosOpcionales() {
		return accesoriosOpcionales;
	}
	
}
