package com.example.demo.tradicional;

public class Estudiante {
	
	private String nombre;
	private String cedula;
		
	public void generaEstudiante(String nombre, String cedula) {
		
		this.nombre=nombre;
		this.cedula=cedula;
	}
	
	@Override
	public String toString() {
		return "[Nombre=" + nombre + ", cedula=" + cedula + "]";
	}
	
	
}
