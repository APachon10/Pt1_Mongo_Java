package Modelos;

public class Consolas {
	private String nombre;
	private double precio;
	//Getters
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
	//Setters
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Consolas [nombre=" + nombre + ", precio=" + precio + ", getNombre()=" + getNombre() + ", getPrecio()="
				+ getPrecio() + "]";
	}
	
	
}
