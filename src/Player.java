public class Player extends Entita {

    private String nickname;

    public Player(int n_cuori, Equip arma, Equip armatura, String nickname, boolean is_alive) {
        super(n_cuori, arma, armatura, is_alive);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Player: " +
                "nickname = " + nickname  +
                super.toString();
    }
    //metodo attacca
    public void attacca(Mob mob){
        int danno = this.getArma().getDamage()-mob.getArmatura().getResistence();
        if (mob.isP_ostile()){
            mob.setOstile(true);
        }
        if (danno>0){
            mob.setN_cuori(mob.getN_cuori()-danno);
            System.out.println("il mob subisce " + danno + " danni");

            if (mob.getN_cuori()>0){
                System.out.println("il mob è vivo con " + mob.getN_cuori() + " cuori");
            } else {
                System.out.println("il mob è morto");
                mob.setIs_alive(false);
            }
        }

    }
}
