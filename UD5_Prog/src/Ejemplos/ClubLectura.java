/**
 * 
 */
package Ejemplos;

/**
 * 
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ClubLectura {
	public static void main(String[] args) {
        Set<String> libros = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        
        // Agregar libros
        System.out.println("Introduce títulos de libros (escribe 'fin' para terminar):");
        while (true) {
            String libro = scanner.nextLine();
            if (libro.equalsIgnoreCase("fin")) {
                break;
            }
            if (libros.add(libro)) {
                System.out.println("Libro agregado.");
            } else {
                System.out.println("Este libro ya está en la lista.");
            }
        }
        
        // Mostrar libros con for-each
        System.out.println("\n Lista de libros (for-each):");
        for (String libro : libros) {
            System.out.println(libro);
        }

        // Mostrar libros con Iterator
        System.out.println("\n Lista de libros (Iterator):");
        Iterator<String> iter = libros.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
            iter.remove();
        }

        scanner.close();
    }
}
