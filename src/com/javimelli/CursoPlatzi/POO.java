package com.javimelli.CursoPlatzi;

public class POO {

	/*
	 * Dividir porblemas en subproblemas y esos en m�s subproblemas...
	 * 
	 * Definir el dominio del problema.
	 * Recopilar los requisitos de cliente, definir un alcance de hasta donde
	 * vamos a llevar el sistema con la POO. PROBLEM DOMAIN �Qu� queremos lograr? 
	 * 
	 * Fijarnos en el escenario del problema y simularlo con objetos
	 * 
	 * Identificar objetos
	 * 	- F�sicos: cohe, persona...
	 *  - Conceptuales: Cuenta corriente, n�mina...
	 *  Los objetos est�n formados por propiedas(caracter�sticas) y m�todos(Lo que pueden hacer).
	 *  Los sustantivos son propiedades y los verbos son m�todos.
	 *  
	 *  La clase Object es la clase padre de todos los objetos que declaremos.
	 */
	
	/*
	 * MODIFICADORES DE ACCESO
	 * public accesible desde cualquier lugar, incluidas las instancias de las clases.
	 * protected accesible desde subclases, clases en el mismo paquete y en la clase donde se defini�.
	 * private Accesible solo en la clase donde est� definido.
	 * Default accesible  por clases que est�n en el mismo paquete y en la clase donde se defini�.
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
