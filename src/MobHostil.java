public abstract class MobHostil extends Mob implements Combate {
    private int fuerza;

    public MobHostil(int salud, int fuerza) {
        super(salud);
        this.fuerza = fuerza;
    }

    @Override
    public int atacar() {
        return fuerza;
    }

    @Override
    public void recibirAtaque(int ataque) {
        salud -= ataque;
        System.out.println("El mob ha recibido " + ataque + " de daño. " + "Salud restante: " + salud);
    }

    @Override
    public void moverse() {
    }

    public int getSalud() {
        return salud;
    }
}
