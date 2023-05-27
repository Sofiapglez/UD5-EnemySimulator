package net.minecraft;

import net.minecraft.entidades.mobs.hostiles.Zombie;
import net.minecraft.entidades.personaje.Personaje;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        Personaje personaje = crearPersonaje();

        Zombie zombie = new Zombie();
        Random random = new Random();
        int turno = 1;

        while (personaje.getSalud() > 0 && zombie.getSalud() > 0) {
            turno++;

            int fuerzaPersonaje = personaje.atacar();
            zombie.recibirAtaque(fuerzaPersonaje);

            boolean atacar = random.nextBoolean();

            if (atacar) {
                int fuerzaZombie = zombie.atacar();
                personaje.recibirAtaque(fuerzaZombie);
            } else {
                zombie.moverse();
            }
        }

        if (personaje.getSalud() <= 0) {
            System.out.println("El personaje ha sido derrotado. El Zombie es el ganador.");
        } else {
            System.out.println("El Zombie ha sido derrotado. El personaje es el ganador.");
        }

        System.out.println("Turnos totales: " + turno);

    }
    private static Personaje crearPersonaje() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escoja una arma:");

        System.out.println("1. Ninguna");
        System.out.println("2. Espada madera");
        System.out.println("3. Espada de hierro");
        System.out.println("4. Espada de diamante");
        int arma = scanner.nextInt();
        int fuerza = 1;

        switch (arma) {
            case 1:
                fuerza = 1;
                break;
            case 2:
                fuerza = 2;
                break;
            case 3:
                fuerza = 3;
                break;
            case 4:
                fuerza = 5;
                break;
            default:
                System.out.println("Escoge una arma válida");
                break;
        }

        System.out.println("Escoja una armadura:");
        System.out.println("1. Ninguna");
        System.out.println("2. De cuero");
        System.out.println("3. De hierro");
        System.out.println("4. De diamante");

        int armadura = scanner.nextInt();
        int defensa = 0;

        switch (armadura) {
            case 1:
                defensa = 0;
                break;
            case 2:
                defensa = 1;
                break;
            case 3:
                defensa = 2;
                break;
            case 4:
                defensa = 3;
                break;
            default:
                System.out.println("Escoge una armadura válida");
                break;
        }
        return new Personaje(defensa, fuerza);
    }
}