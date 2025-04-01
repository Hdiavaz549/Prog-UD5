/**
 * 
 */
package Ejercicios;

/**
 * 
 */
import java.util.*;

public class Ejercicio4 {
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

        // Imprimir cada Set
        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Medir tiempo de inserción para cada Set
        medirTiempoInsercion(new HashSet<>());
        medirTiempoInsercion(new TreeSet<>());
        medirTiempoInsercion(new LinkedHashSet<>());

        // Medir tiempo de búsqueda
        medirTiempoBusqueda(hashSet, "Python");
        medirTiempoBusqueda(treeSet, "Python");
        medirTiempoBusqueda(linkedHashSet, "Python");

        // Escenarios prácticos
        escenarioHashSet();
        escenarioTreeSet();
        escenarioLinkedHashSet();

        // Iteración básica
        System.out.println("\nIteración con iterador:");
        mostrarElementosConIterador(hashSet);
        mostrarElementosConIterador(treeSet);
        mostrarElementosConIterador(linkedHashSet);

        // Modificación durante iteración
        escenarioModificacionDuranteIteracion();
    }

    private static void medirTiempoInsercion(Set<Integer> set) {
        long inicio = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            set.add(i);
        }
        long fin = System.nanoTime();
        System.out.println("Tiempo de inserción para " + set.getClass().getSimpleName() + ": " + (fin - inicio) + " ns");
    }

    private static void medirTiempoBusqueda(Set<String> set, String elemento) {
        long inicio = System.nanoTime();
        boolean encontrado = set.contains(elemento);
        long fin = System.nanoTime();
        System.out.println("Tiempo de búsqueda para " + set.getClass().getSimpleName() + " buscando '" + elemento + "': " + (fin - inicio) + " ns. Encontrado: " + encontrado);
    }

    private static void mostrarElementosConIterador(Set<String> set) {
        Iterator<String> iterator = set.iterator();
        int index = 1;
        while (iterator.hasNext()) {
            System.out.println("Elemento #" + index + ": " + iterator.next());
            index++;
        }
    }

    private static void escenarioHashSet() {
        Set<String> codigosProductos = new HashSet<>();
        codigosProductos.add("P001");
        codigosProductos.add("P002");
        codigosProductos.add("P003");
        System.out.println("Códigos de productos en HashSet: " + codigosProductos);
    }

    private static void escenarioTreeSet() {
        Set<String> nombresEstudiantes = new TreeSet<>();
        nombresEstudiantes.add("Ana");
        nombresEstudiantes.add("Carlos");
        nombresEstudiantes.add("Beatriz");
        System.out.println("Lista ordenada de estudiantes en TreeSet: " + nombresEstudiantes);
    }

    private static void escenarioLinkedHashSet() {
        Set<String> historialNavegacion = new LinkedHashSet<>();
        historialNavegacion.add("www.google.com");
        historialNavegacion.add("www.github.com");
        historialNavegacion.add("www.stackoverflow.com");
        System.out.println("Historial de navegación en LinkedHashSet: " + historialNavegacion);
    }

    private static void escenarioModificacionDuranteIteracion() {
        Set<Integer> treeSetNumeros = new TreeSet<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            treeSetNumeros.add(random.nextInt(100) + 1);
        }

        System.out.println("TreeSet antes de modificar: " + treeSetNumeros);

        Iterator<Integer> iterator = treeSetNumeros.iterator();
        while (iterator.hasNext()) {
            int numero = iterator.next();
            if (numero % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("TreeSet después de eliminar números pares: " + treeSetNumeros);

        try {
            for (Integer num : treeSetNumeros) {
                if (num == 1000) {
                    treeSetNumeros.add(1000);
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Error: No se puede modificar el conjunto durante la iteración con for-each");
        }

        System.out.println("TreeSet final: " + treeSetNumeros);
    }
}




