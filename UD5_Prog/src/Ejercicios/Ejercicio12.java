/**
 * 
 */
package Ejercicios;

/**
 * 
 */
import java.util.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> diccionario;

        System.out.println("Elige el tipo de implementación para el diccionario:");
        System.out.println("1 - HashMap");
        System.out.println("2 - LinkedHashMap");
        System.out.println("3 - TreeMap");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // limpiar el buffer

        switch (opcion) {
            case 1:
                diccionario = new HashMap<>();
                break;
            case 2:
                diccionario = new LinkedHashMap<>();
                break;
            case 3:
                diccionario = new TreeMap<>();
                break;
            default:
                System.out.println("Opción inválida. Se usará HashMap por defecto.");
                diccionario = new HashMap<>();
                break;
        }

        // Añadir entradas iniciales
        diccionario.put("ent", "Número entero");
        diccionario.put("dec", "Número decimal");
        diccionario.put("cad", "Cadena");
        diccionario.put("log", "Lógico");
        diccionario.put("bucle", "Estructura repetición");

        // Intentar añadir valor duplicado con distinta clave
        diccionario.put("bool", "Lógico"); // mismo valor, clave diferente

        // Intentar añadir valor nuevo con clave duplicada
        if (diccionario.containsKey("bucle")) {
            System.out.println("La clave 'bucle' ya existe. No se añadirá de nuevo.");
        } else {
            diccionario.put("bucle", "Repetición");
        }

        // Obtener y mostrar un valor
        String valorLog = diccionario.get("log");
        System.out.println("\nValor original de 'log': " + valorLog);

        // Cambiar valor de 'log'
        diccionario.put("log", "Booleano");

        // Iterar y mostrar el diccionario
        System.out.println("\nContenido del diccionario:");
        Iterator<Map.Entry<String, String>> iterador = diccionario.entrySet().iterator();
        while (iterador.hasNext()) {
            Map.Entry<String, String> entrada = iterador.next();
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());

            // Intentar añadir un valor null durante la iteración (causará ConcurrentModificationException si no se maneja)
            // Para evitar eso, comentamos esta parte o la manejamos por separado
            /*
            if (!diccionario.containsKey("nulo")) {
                diccionario.put("nulo", null); // Esto lanzaría una excepción si se hace dentro del bucle
            }
            */
        }

        // Añadir un valor null fuera del bucle (seguro)
        diccionario.put("nulo", null);
        System.out.println("\nSe añadió una entrada con valor null: nulo -> " + diccionario.get("nulo"));

        // Mostrar diccionario final
        System.out.println("\nDiccionario final:");
        for (Map.Entry<String, String> entrada : diccionario.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }

        scanner.close();
    }
}
