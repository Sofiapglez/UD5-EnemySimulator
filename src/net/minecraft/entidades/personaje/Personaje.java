package net.minecraft.entidades.personaje;

import net.minecraft.interfaces.Combate;

public class Personaje implements Combate {
    private int salud;
    private int defensa;
    private int fuerza;

    public Personaje( int defensa, int fuerza) {
        this.salud = 12;
        this.defensa = defensa;
        this.fuerza = fuerza;
    }
    @Override
    public int atacar() {
        return fuerza;
    }

    @Override
    public void recibirAtaque(int ataque) {
        int daño = ataque - defensa;
        salud -= daño;
        System.out.println("El personaje ha recibido: " + ataque + " puntos de daño." + " Salud restante: "  + this.salud);
    }
    public int getSalud() {
        return salud;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getFuerza() {
        return fuerza;
    }

}
