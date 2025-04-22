/**
 * 
 */
package Ejercicios;

/**
 * 
 */

import java.util.*;
public class Ejercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        // Crear una colección (ArrayList) de elementos Integer
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("Original: " + numeros);

        // Desordenar la colección
        Collections.shuffle(numeros);
        System.out.println("Desordenado: " + numeros);

        // Ordenar en orden ascendente
        Collections.sort(numeros);
        System.out.println("Orden ascendente: " + numeros);

        // Darle la vuelta (orden inverso)
        Collections.reverse(numeros);
        System.out.println("Orden inverso: " + numeros);

        // Buscar un elemento (por ejemplo, buscar el número 3)
        int elementoABuscar = 3;
        if (numeros.contains(elementoABuscar)) {
            System.out.println("El elemento " + elementoABuscar + " está en la lista en la posición: " + numeros.indexOf(elementoABuscar));
        } else {
            System.out.println("El elemento " + elementoABuscar + " no se encuentra en la lista.");
        }

        // Crear una lista a partir de un array utilizando Arrays
        Integer[] arrayDeNumeros = {10, 20, 30, 40, 50};
        List<Integer> listaDesdeArray = Arrays.asList(arrayDeNumeros);
        System.out.println("Lista desde array: " + listaDesdeArray);
    }
}
