/**
 * 
 */
package Ejercicios;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 
 */

	public class Ejercicio7 {
	    public static void main(String[] args) {
	        // Crear instancias de cada tipo de Set
	        Set<String> hashSet = new HashSet<>();
	        Set<String> treeSet = new TreeSet<>();
	        Set<String> linkedHashSet = new LinkedHashSet<>();

	        // Agregar elementos a cada Set
	        String[] elementos = {"Java", "Python", "C++", "JavaScript", "Ruby", "Java"};
	        for (String elemento : elementos) {
	            hashSet.add(elemento);
	            treeSet.add(elemento);
	            linkedHashSet.add(elemento);
	        }

	        // Crear un nuevo TreeSet (SortedSet) a partir de hashSet
	        SortedSet<String> sortedSetFromHashSet = new TreeSet<>(hashSet);
	        
	        // Obtener primer y último elemento del TreeSet
	        System.out.println("\n--- Primer y Último elemento de TreeSet ---");
	        System.out.println("Primer elemento: " + ((TreeSet<String>)treeSet).first());
	        System.out.println("Último elemento: " + ((TreeSet<String>)treeSet).last());

	        // Obtener primer y último elemento del nuevo SortedSet (TreeSet) creado a partir de hashSet
	        System.out.println("\nPrimer y Último elemento del SortedSet desde HashSet:");
	        System.out.println("Primer elemento: " + sortedSetFromHashSet.first());
	        System.out.println("Último elemento: " + sortedSetFromHashSet.last());

	        // Obtener todos los elementos previos a un dado: por ejemplo, "C++"
	        String dado = "C++";
	        SortedSet<String> elementosPrevios = sortedSetFromHashSet.headSet(dado);
	        
	        System.out.println("\nElementos previos a '" + dado + "': " + elementosPrevios);
	        
	        // Mostrar todos los sets para ver el orden
	        System.out.println("\nHashSet: " + hashSet);
	        System.out.println("TreeSet: " + treeSet);
	        System.out.println("LinkedHashSet: " + linkedHashSet);
	    }
	}

