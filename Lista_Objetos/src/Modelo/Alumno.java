package Modelo;

public class Alumno extends Persona{

	private int libreta;
	public Alumno(String nombre, String apellido,int libreta) {
		super(nombre, apellido);
		this.libreta=libreta;
	}
	public int getLibreta() {
		return libreta;
	}
	public void setLibreta(int libreta) {
		this.libreta = libreta;
	}
	@Override
	public String toString() {
		return "Alumno [toString()=" + super.toString() + "]";
	}

	
	
	
}
