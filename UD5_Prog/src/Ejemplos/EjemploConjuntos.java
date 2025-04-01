/**
 * 
 */
package Ejemplos;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 */

public class EjemploConjuntos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set <Integer>naturales = new HashSet<>();
		naturales.add(1);
		naturales.add(2);
		naturales.add(3);
		naturales.add(4);
		System.out.println("HashSet: " + naturales);
		System.out.println("Naturales referencia: " + naturales.hashCode());
	}

}
