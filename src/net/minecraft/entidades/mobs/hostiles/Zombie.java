package net.minecraft.entidades.mobs.hostiles;

public class Zombie extends MobHostil {
    public Zombie() {
        super(10, 4);
    }

    @Override
    public void moverse() {
        System.out.println("El zombie se mueve hacia el personaje");
    }
}
