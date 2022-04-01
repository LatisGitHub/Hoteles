package Ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import Ejercicio.Hotel.zona;

public class IndaloHoteles {
	
	protected ArrayList<Hotel> Hoteles;

	public IndaloHoteles() {
		super();
		Hoteles = new ArrayList<>();
	}
	
	public ArrayList<Hotel> getHoteles() {
		return Hoteles;
	}

	/**
	 * Agrega un Hotel
	 * @param h
	 */
	public void addHoteles(Hotel h){
		if(!Hoteles.contains(h)) {
			Hoteles.add(h);
		}
	}
	/**
	 * Elimina un hotel
	 * @param h
	 */
	public void deleteHoteles(Hotel h) {
		Hoteles.remove(h);
	}
	
	/**
	 * Busca un hotel de manera eficiente
	 * @param codigoHotel
	 * @return
	 */
	public Hotel buscarEficiente(String codigoHotel) {
		Collections.sort(Hoteles);
		int index = Collections.binarySearch(Hoteles, new Hotel(codigoHotel, "", "", 0, null));
		return Hoteles.get(index);
	}
	/**
	 * Pintar por nombre
	 */
	public void pintarOrdenadoNombre() {
		Hoteles.sort(new Comparator<Hotel>() {

			
			public int compare(Hotel h1, Hotel h2) {
				return h1.getNombre().compareTo(h2.getNombre());
			}

		});
		for(Hotel h: Hoteles) {
			System.out.println(h);
		}
	}
	/**
	 * Pintar por precios
	 */
	public void pintarOrdenadoPrecio() {
		Hoteles.sort(new Comparator<Hotel>() {

			
			public int compare(Hotel h1, Hotel h2) {
				if (h1.getPrecio()>h2.getPrecio()) {
					return 1;
				}else if(h1.getPrecio()<h2.getPrecio()) {
					return -1;
				}
				return 0;
			}

		});
		for(Hotel h: Hoteles) {
			System.out.println(h);
		}
	}
	/**
	 * Pintar por localidad
	 */
	public void pintarOrdenadoLocalidad() {
		Hoteles.sort(new Comparator<Hotel>() {

			
			public int compare(Hotel h1, Hotel h2) {
				return h1.getLocalidad().compareTo(h2.getLocalidad());
			}

		});
		for(Hotel h: Hoteles) {
			System.out.println(h);
		}
	}
	
	/**
	 * Pintar Ordenado por zona
	 */
	
	//FALTAR REVISAR
	public void pintarOrdenadoZona() {
		Hoteles.sort(new Comparator<Hotel>() {

			
			public int compare(Hotel h1, Hotel h2) {
				if (h1.getLaZona().equals(zona.PLAYA)) {
					return 1;
				}else if(h1.getLaZona().equals(zona.RURAL)) {
					return -1;
				}
				return 0;
			}

		});
		for(Hotel h: Hoteles) {
			System.out.println(h);
		}
	}
	
	public void arbolOrdenado(zona z) {	
		
		TreeSet<Hotel> hotels2 = new TreeSet<>(new Comparator<Hotel>() {
			
			@Override
			public int compare(Hotel h1, Hotel h2) {
				if (h1.getPrecio()>h2.getPrecio()) {
					return 1;
				}else if(h1.getPrecio()<h2.getPrecio()) {
					return -1;
				}
				return 0;
			}
	    });
		for(Hotel h: hotels2) {
			if (h.getLaZona().equals(z)) {
				hotels2.add(h);
				System.out.println(h);
			}
		}
	
	}
	
}
