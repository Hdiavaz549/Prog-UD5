/**
 * 
 */
package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear lista de personas
		List<Persona> personas = new ArrayList<>();
		personas.add(new Persona("Carlos", "Ramírez", 30));
		personas.add(new Persona("Ana", "Gómez", 25));
		personas.add(new Persona("Luis", null, 28));
		personas.add(new Persona("Beatriz", "Alonso", 22));
		personas.add(new Persona("Daniel", "Gómez", 25));
		personas.add(new Persona("Eva", null, 40));

		System.out.println("\n--- Orden por edad ---");
		personas.sort(new ComparadorPorEdad());
		personas.forEach(System.out::println);

		System.out.println("\n--- Orden por apellido ---");
		personas.sort(new ComparadorPorApellido());
		personas.forEach(System.out::println);

		System.out.println("\n--- Orden por apellido, nombre y edad ---");
		personas.sort(new ComparadorCompleto());
		personas.forEach(System.out::println);

		System.out.println("\n--- Orden con apellidos nulos al principio ---");
		personas.sort(new ComparadorCompletoConNulos());
		personas.forEach(System.out::println);

	}

}
