/**
 * 
 */
package Ejercicios;

/**
 * 
 */
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> colaTareas = new LinkedList<>();

        // 1. Añadir tareas iniciales
        colaTareas.addLast("Lavar los platos");
        colaTareas.addLast("Hacer la compra");
        colaTareas.addLast("Estudiar Java");
        colaTareas.addLast("Ir al gimnasio");
        colaTareas.addLast("Leer un libro");

        // 2. Mostrar tareas
        System.out.println("Tareas iniciales:");
        mostrarTareas(colaTareas);

        // 3. Añadir nueva tarea al final
        System.out.print("\nIntroduce una nueva tarea para añadir al final: ");
        String nuevaTarea = scanner.nextLine();
        colaTareas.addLast(nuevaTarea);

        // 4. Completar una tarea (eliminar la primera)
        if (!colaTareas.isEmpty()) {
            String tareaCompletada = colaTareas.removeFirst();
            System.out.println("\n Tarea completada: " + tareaCompletada);
        }

        // 5. Consultar la próxima tarea sin eliminar
        if (!colaTareas.isEmpty()) {
            System.out.println("\n Próxima tarea a realizar: " + colaTareas.getFirst());
        }

        // 6. Añadir tarea urgente al principio
        System.out.print("\nIntroduce una tarea urgente para añadir al principio: ");
        String tareaUrgente = scanner.nextLine();
        colaTareas.addFirst(tareaUrgente);

        // 7. Mostrar estado final de la cola
        System.out.println("\n Estado final de la cola de tareas:");
        mostrarTareas(colaTareas);

        scanner.close();
    }

    // Método para mostrar todas las tareas
    public static void mostrarTareas(LinkedList<String> tareas) {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
        } else {
            for (String tarea : tareas) {
                System.out.println("- " + tarea);
            }
        }
    }
}
