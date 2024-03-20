abstract class Entita{ // classe astratta usata per creare altre classi e non serve ad altro
    private int n_cuori;
    private Equip arma;
    private Equip armatura;
    private boolean is_alive;

    public Entita(int n_cuori, Equip arma, Equip armatura, boolean is_alive) {
        this.n_cuori = n_cuori;
        this.arma = arma;
        this.armatura = armatura;
        this.is_alive= is_alive;
    }

    public int getN_cuori() {
        return n_cuori;
    }

    public void setN_cuori(int n_cuori) {
        this.n_cuori = n_cuori;
    }

    public Equip getArma() {
        return arma;
    }

    public void setArma(Equip arma) {
        this.arma = arma;
    }

    public Equip getArmatura() {
        return armatura;
    }

    public void setArmatura(Equip armatura) {
        this.armatura = armatura;
    }

    public boolean isIs_alive() {
        return is_alive;
    }

    public void setIs_alive(boolean is_alive) {
        this.is_alive = is_alive;
    }

    @Override
    public String toString() {
        return ", n_cuori = " + n_cuori +
                ", arma = " + arma +
                ", armatura = " + armatura +
                ", vivo = "+ is_alive;

    }
}

