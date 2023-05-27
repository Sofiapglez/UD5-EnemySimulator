public abstract class Mob {
    protected int salud;

    public Mob(int salud) {
        this.salud = salud;
    }

    public abstract void moverse();
}
