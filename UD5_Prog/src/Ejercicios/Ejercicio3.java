/**
 * 
 */
package Ejercicios;

import java.util.TreeSet;

/**
 * 
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<Integer> numeros = new TreeSet<>();
		numeros.add(42);
		numeros.add(17);
		numeros.add(89);
		
		System.out.println("Números ordenados:");
		for (int num : numeros) {
			System.out.println(num);
		}
		
		TreeSet<String> nombres = new TreeSet<>();
		nombres.add("Carlos");
		nombres.add("Ana");
		nombres.add("Beatriz");
		
		System.out.println("\nNombres ordenados:");
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
	}

}
