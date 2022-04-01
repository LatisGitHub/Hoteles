package Ejercicio;

import Ejercicio.Hotel.zona;

public class TestHotel {
	
	public static void main(String[] args) {
		IndaloHoteles h = new IndaloHoteles();
		h.addHoteles(new Hotel("1", "Hola", "Almeria", 10, zona.PLAYA));
		h.addHoteles(new Hotel("3", "Adios", "Zaragoza", 5, zona.PLAYA));
		h.addHoteles(new Hotel("7", "Buenas", "Cuenca", 20, zona.RURAL));
		h.addHoteles(new Hotel("2", "Prueba", "Garrucha", 20, zona.RURAL));
		
	
		h.buscarEficiente("2");
		h.arbolOrdenado(zona.PLAYA);
		
	}
	

}
