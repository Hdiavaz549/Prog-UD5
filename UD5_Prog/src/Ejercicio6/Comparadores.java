/**
 * 
 */
package Ejercicio6;

import java.util.Comparator;

/**
 * 
 */
class ComparadorPorEdad implements Comparator<Persona> {
    public int compare(Persona p1, Persona p2) {
        return Integer.compare(p1.getEdad(), p2.getEdad());
    }
}

class ComparadorPorApellido implements Comparator<Persona> {
    public int compare(Persona p1, Persona p2) {
        return p1.getApellido().compareToIgnoreCase(p2.getApellido());
    }
}

class ComparadorCompleto implements Comparator<Persona> {
    public int compare(Persona p1, Persona p2) {
        int cmp = p1.getApellido().compareToIgnoreCase(p2.getApellido());
        if (cmp != 0) return cmp;

        cmp = p1.getNombre().compareToIgnoreCase(p2.getNombre());
        if (cmp != 0) return cmp;

        return Integer.compare(p1.getEdad(), p2.getEdad());
    }
}

class ComparadorCompletoConNulos implements Comparator<Persona> {
    public int compare(Persona p1, Persona p2) {
        String a1 = p1.getApellido();
        String a2 = p2.getApellido();

        if (a1 == null && a2 != null) return -1;
        if (a1 != null && a2 == null) return 1;
        if (a1 == null && a2 == null) return 0;

        int cmp = a1.compareToIgnoreCase(a2);
        if (cmp != 0) return cmp;

        cmp = p1.getNombre().compareToIgnoreCase(p2.getNombre());
        if (cmp != 0) return cmp;

        return Integer.compare(p1.getEdad(), p2.getEdad());
    }
}

