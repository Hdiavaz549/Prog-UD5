/**
 * 
 */
package Ejercicios;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * 
 */
public class Ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        // Crear e inicializar la lista de tipo ArrayList<Integer> con al menos 10 números enteros.
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
        lista.add(60);
        lista.add(70);
        lista.add(80);
        lista.add(90);
        lista.add(100);

        // Crear un objeto ListIterator para recorrer la lista
        ListIterator<Integer> iterador = lista.listIterator();

        // Recorrer la lista hacia adelante
        System.out.println("Recorrido hacia adelante:");
        while (iterador.hasNext()) {
            int numero = iterador.next();
            System.out.println("Índice " + iterador.previousIndex() + ": " + numero);

            // Multiplicar por 2 los números mayores que 50
            if (numero > 50) {
                iterador.set(numero * 2);  // Actualizar el valor en la lista
            }
        }

        // Mostrar la lista actualizada tras modificaciones
        System.out.println("\nLista actualizada tras recorrido hacia adelante:");
        System.out.println(lista);

        // Recorrer la lista hacia atrás
        System.out.println("\nRecorrido hacia atrás:");
        while (iterador.hasPrevious()) {
            int numero = iterador.previous();
            System.out.println("Índice " + iterador.nextIndex() + ": " + numero);

            // Si el número es menor que 30, añadir un número nuevo (por ejemplo, 25) justo después
            if (numero < 30) {
                iterador.add(25);
            }
        }

        // Mostrar la lista actualizada tras inserciones
        System.out.println("\nLista actualizada tras recorrido hacia atrás:");
        System.out.println(lista);
    }
}