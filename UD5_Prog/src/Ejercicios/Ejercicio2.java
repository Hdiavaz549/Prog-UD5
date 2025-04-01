/**
 * 
 */
package Ejercicios;

/**
 * 
 */
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> nombres = new LinkedHashSet<>();
		
		nombres.add("Carlos");
		nombres.add("Ana");
		nombres.add("Luis");
		nombres.add("Beatriz");
		
		System.out.println("Contenido del conjunto: " + nombres);
		boolean agregado = nombres.add("Ana");
		System.out.println("¿Se agragó 'Ana' otra vez?" + agregado);
		nombres.add(null);
		System.out.println("Despues de agregar null: + alumnos");
		
		System.out.println("Recorrido en orden de inserción:");
        for (String alumno : nombres) {
            System.out.println(alumno);
        }
        
        Set<String> hashSet = new HashSet<>(nombres);
        System.out.println("Recorrido con HashSet (sin orden definido):");
        for (String alumno : hashSet) {
            System.out.println(alumno);
        }
	}

}
