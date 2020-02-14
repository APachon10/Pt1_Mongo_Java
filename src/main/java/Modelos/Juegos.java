package Modelos;

public class Juegos {
	private double precio;
	private String plataforma;
	//Getters
	public double getPrecio() {
		return precio;
	}
	public String getPlataforma() {
		return plataforma;
	}
	//Setters
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	@Override
	public String toString() {
		return "Juegos [precio=" + precio + ", plataforma=" + plataforma + "]";
	}
}
