package Modelo;

public class Profesor extends Persona{
	private int legajo;

	public Profesor(String nombre, String apellido, int legajo) {
		super(nombre, apellido);
		this.legajo = legajo;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
}
