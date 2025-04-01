/**
 * 
 */
package Ejercicios;

/**
 * 
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet<String> libros = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
				int opcion = 0;

				do {
					System.out.println("\nMenú");
					System.out.println("1. Agregar libro");
					System.out.println("2. Mostrar libros");
					System.out.println("3. Salir");
					System.out.println("Seleccione una opción: ");
					scanner.nextLine();
					
					switch (opcion) {
	                case 1:
	                    System.out.print("Ingrese el nombre del libro: ");
	                    String libro = scanner.nextLine();
	                    if (libros.add(libro)) {
	                        System.out.println("Libro agregado correctamente.");
	                    } else {
	                        System.out.println("El libro ya existe en la colección.");
	                    }
	                    break;
	                case 2:
	                    if (libros.isEmpty()) {
	                        System.out.println("No hay libros en la colección.");
	                    } else {
	                        System.out.println("\nLibros en la colección (usando for-each):");
	                        for (String nombre : libros) {
	                            System.out.println("- " + nombre);
	                        }
	                        
	                        System.out.println("\nLibros en la colección (usando Iterator):");
	                        Iterator<String> iterador = libros.iterator();
	                        while (iterador.hasNext()) {
	                            System.out.println("- " + iterador.next());
	                        }
	                    }
	                    break;
	                case 3:
	                    System.out.println("Saliendo...");
	                    break;
	                default:
	                    System.out.println("Opción no válida. Intente nuevamente.");
	            }
	        } while (opcion != 3);

	        scanner.close();
	    }
	}

