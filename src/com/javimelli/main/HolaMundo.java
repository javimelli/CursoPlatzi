package com.javimelli.main;

public class HolaMundo {

	public static void main(String[] args){
		
		/*
		 * El JDK de java es el java development kit, es decir, el paquete de desarrolladores
		 * de java. Sirve para por de desarrollar tiene todas las clases y .java necesarios
		 * para ello. El JRE es la máquina virtual de java. Establecer las variables de entorno
		 * en windows para poder ejecutar los programas de la carpeta bin con el java.exe
		 * y el javac.exe
		 */
		
		/*
		 * lo primero que hace el ide es compilar con el compilador de java javac y genera
		 * el bytecode (.class, comienzan con las palabra cafe babe), que es un lenguaje que
		 * entiende el sistema operativo que interactúa con el hardware de nuestro equipo.
		 * Después ejecuta el .class con el java.exe.
		 */
		
		//Las variables son mmemoria volátil cuando se ejecuta el programa.
		//Ocupan ram. //Las variables pueden ser de tipo primitivo o objetos.
		//---------------------------------Tipo de datos primitivos-----------------------------
		//Tipo de datos enteros
		byte a = 0;//Ocupa un byte de -128 a 127
		short b = 0;//Ocupa 2 bytes de -32.768 a 32.7676 
		int c = 0;//Ocupa 4 bytes 
		Long d = 0L;//Ocupa 8 bytes. La L indica que es de tipo Long
		
		//Tipo de datos puntos flotantes
		float e = 0;//Ocupan 4 bytes
		double f = 0;//Ocupan 8 bytes
		
		//Tipo de datos texto
		char g = 'N';//Ocupa 2 bytes
		
		//Tipo de datos
		boolean h = true;//Ocupa un bit
		
		//---------------------------------Constantes--------------------------------------------
		//Las constantes en Java se declaran con la palabra final
		final byte B1 = 2;
		final byte B2 = 10;
		//Esto daría un fallo si no la declaramos como constantes, ya que el valor
		//de las variables pueden cambiar y desbordar el rango del tipo byte.
		byte b3 = B1 + B2;
		
		//---------------------------------Casteo---------------------------------------------
		//El casteo es sirve para cambiar el tipo de dato a su fuente.
		double d1 = 10;
		System.out.println(d1);
		int i = (int)d1;
		System.out.println(i);
		
		//-----------------------------------Arreglos-----------------------------------------
		int declaracion1[];
		int[] declaracion2;
		//Para poder usar los arrays se debe poner la capacidad
		declaracion1 = new int[5];//me reservará 4*5 bytes
		declaracion1[0] = 0;
		//Arrays bidimensionales
		int[][] bidimensional = new int[2][2];
		//Crecerá hacia abajo ilimitadamente
		int[][] bidimensional2 = new int [2][];
		bidimensional[0][0] = 0;
		//Si acedemos a una zona de memoria que no está en el array nos lanzará la excepcion
		//ArrayIndexOutBoundsException
		//System.out.println(bidimensional[3][2]);
		//Arrays tridimensionales
		int [][][] tridimensional = new int [2][2][2];
		
		//----------------------------------Operadores----------------------------------------
		
		int x = 0;
		System.out.println(x+=2);//x = x + 2
		//= += -= /= %=
		//La diferencia entre las dos instrucciones siguientes es que en la primera
		//primero se realiza la asignación y despúes la operacion, en el otro caso es al revés.
		System.out.println("El valor de x antes de la ejecución de x++: " + x++);//x = x + 1
		System.out.println("El valor de x después de la ejecución de la instrucción es : " + x);
		System.out.println("El valor de x antes de la ejecución de ++x es: " + ++x);
		
		//-----------------------------Controles de flujo-------------------------------
		/*
		 * if/else
		 * switch
		 * whilw
		 * do while
		 * for
		 * foreach :Sirve para reccorrer arrays
		 */
		for (int item : declaracion1) {
			System.out.println(item);
		}
		
	}
	
}
