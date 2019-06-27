package Principal;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.Alumno;
import Modelo.Profesor;

public class Control {
	ArrayList<Alumno> listaAlumnos=new ArrayList<>();
	ArrayList<Profesor> listaProfesores=new ArrayList<>();
	
	public void Inicio() {
		JOptionPane.showMessageDialog(null, "Bienvenidos Al Sistema!");
		int op;
		do {
		op=MenuP();
		switch(op) {
			case 1: CrearAlumno();
				break;
			case 2: CrearProfesor();
				break;
			case 3: Mostrar("Alumno"); 
				break;
			case 4: Mostrar("Profesor");
				break;
			case 0: JOptionPane.showMessageDialog(null, "Hasta Pronto!!!!");
			break;
				default: JOptionPane.showMessageDialog(null, "Volver a Ingresar Opcion!");
				break;
		}
		}while(op!=0);
	}
	
	private int MenuP() {
		int op;
		try {
		op=Integer.parseInt(JOptionPane.showInputDialog("Seleccione Opcion:\n"
				+ "1- Crear Alumno\n"
				+ "2- Crear Profesor\n"
				+ "3- Listar Alumnos\n"
				+ "4- Listar Profesores\n"
				+ "0- Salir"));
		return op;
		}catch (Exception e) {
			System.out.println("Error en Metodo MenuP - Clase Control");
			return 999;
		}
	}
	
	private void CrearAlumno() {
		try {
		String nom=JOptionPane.showInputDialog("Ingrese Nombre: ");
		String ape=JOptionPane.showInputDialog("Ingrese Apellido: ");
		int lib=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de Libreta: "));
		Alumno alu=new Alumno(nom, ape, lib);
		listaAlumnos.add(alu);
		}catch (Exception e) {
			System.out.println("Error en Metodo CrearAlumno - Clase Control");
		}
	}
	
	private void CrearProfesor() {
		try {
		String nom=JOptionPane.showInputDialog("Ingrese Nombre: ");
		String ape=JOptionPane.showInputDialog("Ingrese Apellido: ");
		int leg=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de Legajo: "));
		Profesor prof=new Profesor(nom, ape, leg);
		listaProfesores.add(prof);
		}catch (Exception e) {
			System.out.println("Error en Metodo CrearProfesor - Clase Control");
		}
	}
	
	private void Mostrar(String TipoP) {
		String salida="";
		if(TipoP.equals("Alumno")) {
			salida="Listado de Alumnos: \n";
			for (Alumno alumno : listaAlumnos) {
				salida=salida+alumno.getNombre()+" "+alumno.getApellido()+" "+alumno.getLibreta()+"\n";
			}
		}else {
			salida="Listado de Profesores: \n";
			for (Profesor profe : listaProfesores) {
				salida=salida+profe.getNombre()+" "+profe.getApellido()+" "+profe.getLegajo()+"\n";
			}
		}
			
			JOptionPane.showMessageDialog(null,salida);

	}

}
