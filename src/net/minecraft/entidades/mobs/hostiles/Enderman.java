package net.minecraft.entidades.mobs.hostiles;

public class Enderman extends MobHostil {
    public Enderman() {
        super(14, 0);
    }

    @Override
    public void moverse() {
        System.out.println("El enderman se ha teletransportado detrás del personaje");

    }
}
