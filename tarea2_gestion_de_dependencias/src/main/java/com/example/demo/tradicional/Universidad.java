package com.example.demo.tradicional;

import java.util.Random;

public class Universidad {

	private String nombre;
	private String facultad;
	private boolean gratuidad;
	private int valor;
	
	
	public void registraUni (String nombreUni, String facultad) {
		this.nombre= nombreUni;
		this.facultad=facultad;
		
		this.valor=obtenerValor(nombreUni);
	}
	
	public int obtenerValor(String nomUniversidad) {
		gratuidad=true;
		valor=0;
		if(nomUniversidad.equals("UCE") ) {
			gratuidad=true;
		}else if(nomUniversidad.equals("UTE")) {
			gratuidad=false;
		}else if(nomUniversidad.equals("ESPE")) {
			gratuidad=true;
		}else if(nomUniversidad.equals("PUCE")) {
			gratuidad=false;
		}
					
		if(gratuidad==false) {
			valor= (int)(Math.random() * ((2500 - 500) + 1)) + 500;
		}		
		return valor;
	}

	@Override
	public String toString() {
		return "\t[Nombre: " + nombre 
				+ "\n\t\t Facultad: " + facultad 
				+ "\n\t\t Gratuidad: " + gratuidad 
				+ "\n\t\t Valor a pagar: " + valor + "]";
	}
	
	
	
	
	
}
