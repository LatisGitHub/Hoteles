package Ejercicio;

import java.util.Objects;

public class Hotel implements Comparable<Hotel>{
	protected String codigoHotel;
	protected String nombre;
	protected String localidad;
	protected double precio;
	enum zona{PLAYA, RURAL}
	zona LaZona;
	
	/**
	 * Constructor parametrizado
	 * @param codigoHotel
	 * @param nombre
	 * @param localidad
	 * @param precio
	 */
	public Hotel(String codigoHotel, String nombre, String localidad, double precio, zona z) {
		super();
		this.codigoHotel = codigoHotel;
		this.nombre = nombre;
		this.localidad = localidad;
		this.precio = precio;
		this.LaZona = z;
	}
	
	/*
	 * Constructor copia
	 */
	public Hotel(Hotel otro) {
		super();
		this.codigoHotel = otro.codigoHotel;
		this.nombre = otro.nombre;
		this.localidad = otro.localidad;
		this.precio = otro.precio;
	}
	/**
	 * Constructor vacio
	 */
	public Hotel() {
		super();
		this.codigoHotel = "";
		this.nombre = "";
		this.localidad = "";
		this.precio = 0;
	}
	//Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCodigoHotel() {
		return codigoHotel;
	}
	public zona getLaZona() {
		return LaZona;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigoHotel);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		return Objects.equals(codigoHotel, other.codigoHotel);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hotel [codigoHotel=");
		builder.append(codigoHotel);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", LaZona=");
		builder.append(LaZona);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public int compareTo(Hotel o) {
		return this.getCodigoHotel().compareTo(o.getCodigoHotel());
	}
	
	
	
}
