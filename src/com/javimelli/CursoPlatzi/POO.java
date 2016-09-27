package com.javimelli.CursoPlatzi;

public class POO {

	/*
	 * Dividir porblemas en subproblemas y esos en más subproblemas...
	 * 
	 * Definir el dominio del problema.
	 * Recopilar los requisitos de cliente, definir un alcance de hasta donde
	 * vamos a llevar el sistema con la POO. PROBLEM DOMAIN ¿Qué queremos lograr? 
	 * 
	 * Fijarnos en el escenario del problema y simularlo con objetos
	 * 
	 * Identificar objetos
	 * 	- Físicos: cohe, persona...
	 *  - Conceptuales: Cuenta corriente, nómina...
	 *  Los objetos están formados por propiedas(características) y métodos(Lo que pueden hacer).
	 *  Los sustantivos son propiedades y los verbos son métodos.
	 *  
	 *  La clase Object es la clase padre de todos los objetos que declaremos.
	 */
	
	/*
	 * MODIFICADORES DE ACCESO
	 * public accesible desde cualquier lugar, incluidas las instancias de las clases.
	 * protected accesible desde subclases, clases en el mismo paquete y en la clase donde se definió.
	 * private Accesible solo en la clase donde está definido.
	 * Default accesible  por clases que están en el mismo paquete y en la clase donde se definió.
	 */
	
	/*
	 * INTERFAZ LIST
	 * Vector, ArrayList y LinkedList Implementan la interfaz List.
	 */
	public static void main(String args[]){
		String saludo1 = "hola";
		String saludo2 = new String(" hola Javi");
		System.out.println(saludo2.substring(0, 3));//Incluye los caractres 0, 1 y 2
		System.out.println(saludo2.trim());//Quita los espacios en blanco del principio
		Integer nuemero1 = new Integer(0);
		int primitivo = 0;
	}

	
}
