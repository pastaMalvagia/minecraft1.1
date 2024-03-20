public class Mob extends Entita {
    private String tipo;
    private boolean ostile;//vero ostile
    private boolean p_ostile;

    public Mob(int n_cuori, Equip arma, Equip armatura, String tipo, boolean ostile, boolean p_ostile, boolean is_alive) {
        super(n_cuori, arma, armatura, is_alive);
        this.tipo = tipo;
        this.ostile = ostile;
        this.p_ostile = p_ostile;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isOstile() {
        return ostile;
    }

    public void setOstile(boolean ostile) {
        this.ostile = ostile;
    }

    public boolean isP_ostile() {
        return p_ostile;
    }

    public void setP_ostile(boolean p_ostile) {
        this.p_ostile = p_ostile;
    }


    @Override
    public String toString() {
        return "Mob: " +
                "tipo = " + tipo  +
                ", ostile = " + ostile +
                ", p_ostile = " + p_ostile +
                super.toString();
    }


    //metodo attacca
    public void attacca(Player player){
        if (ostile){
            int danno = this.getArma().getDamage()-player.getArmatura().getResistence();
            if (danno > 0){
                player.setN_cuori(player.getN_cuori()-danno);
                System.out.println("il player ha subito "+ danno + " danni");
                if (player.getN_cuori()<=0){
                    player.setIs_alive(false);
                    System.out.println("il player è morto");
                } else {
                    System.out.println("il player ha "+ player.getN_cuori() +"cuori");
                }
            }
        }
    }
}



