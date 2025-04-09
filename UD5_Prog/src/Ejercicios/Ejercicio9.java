/**
 * 
 */
package Ejercicios;

/**
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio9 {

	/**
	 * @param args
	 */
	
	    public static void main(String[] args) {
	        
	        // Crear la lista de nombres e inicializarla
	        List<String> nombres = new ArrayList<>();
	        
	        // Añadir 5 nombres iniciales
	        nombres.add("Ana");
	        nombres.add("Carlos");
	        nombres.add("Luis");
	        nombres.add("Marta");
	        nombres.add("Pedro");
	        
	        // Mostrar los nombres actuales en la lista
	        mostrarNombres(nombres);
	        
	        // Añadir un nuevo nombre solicitado por el usuario
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce un nuevo nombre: ");
	        String nuevoNombre = scanner.nextLine();
	        nombres.add(nuevoNombre);
	        
	        // Eliminar un nombre específico
	        System.out.print("Introduce el nombre que deseas eliminar: ");
	        String nombreEliminar = scanner.nextLine();
	        if (nombres.contains(nombreEliminar)) {
	            nombres.remove(nombreEliminar);
	            System.out.println("El nombre " + nombreEliminar + " ha sido eliminado.");
	        } else {
	            System.out.println("El nombre no se encuentra en la lista.");
	        }
	        
	        // Mostrar el número total de nombres en la lista
	        System.out.println("Número total de nombres en la lista: " + nombres.size());
	        
	        // Mostrar los nombres actualizados
	        mostrarNombres(nombres);
	        
	        scanner.close();
	    }
	    
	    // Método para mostrar los nombres en la lista
	    public static void mostrarNombres(List<String> lista) {
	        System.out.println("Nombres en la lista:");
	        for (String nombre : lista) {
	            System.out.println(nombre);
	        }
	    }
	}
