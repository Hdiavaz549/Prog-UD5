/**
 * 
 */
package Ejercicios;

import java.util.Collections;
import java.util.List;

/**
 * 
 */
import java.util.*;

public class Ejercicio15 {
    enum Palo {
        CORAZONES, DIAMANTES, TREBOLES, PICAS
    }

    static class Carta {
        int valor;         // 1 (As) a 13 (Rey)
        Palo palo;

        Carta(int valor, Palo palo) {
            this.valor = valor;
            this.palo = palo;
        }

        @Override
        public String toString() {
            String nombreValor;
            switch (valor) {
                case 1: nombreValor = "As"; break;
                case 11: nombreValor = "J"; break;
                case 12: nombreValor = "Q"; break;
                case 13: nombreValor = "K"; break;
                default: nombreValor = String.valueOf(valor);
            }
            return nombreValor + " de " + palo;
        }
    }

    public static void main(String[] args) {
        // Crear una baraja de 52 cartas
        List<Carta> baraja = new ArrayList<>();
        for (Palo palo : Palo.values()) {
            for (int valor = 1; valor <= 13; valor++) {
                baraja.add(new Carta(valor, palo));
            }
        }

        // Barajar la baraja
        Collections.shuffle(baraja);
        System.out.println("Baraja mezclada:");

        // Repartir 5 cartas
        List<Carta> mano = baraja.subList(0, 5);
        for (Carta carta : mano) {
            System.out.println(carta);
        }

        // Ordenar las cartas por valor y luego por palo
        mano.sort(new Comparator<Carta>() {
            @Override
            public int compare(Carta c1, Carta c2) {
                if (c1.valor != c2.valor) {
                    return Integer.compare(c1.valor, c2.valor);
                } else {
                    return c1.palo.ordinal() - c2.palo.ordinal();
                }
            }
        });

        System.out.println("\nMano ordenada:");
        for (Carta carta : mano) {
            System.out.println(carta);
        }
    }


	}


