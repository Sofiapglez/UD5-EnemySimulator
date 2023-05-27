public abstract class MobPacifico extends Mob implements Daño {

    public MobPacifico(int salud) {
        super(salud);
    }

    @Override
    public void recibirAtaque(int ataque) {
        salud -= ataque;
        System.out.println("El mob ha recibido " + ataque + "puntos de daño");
        System.out.println("Salud restante: " + salud);
    }

    @Override
    public void moverse() {

    }

}
