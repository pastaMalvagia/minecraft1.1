public class Equip {
    private boolean type;
    // falso arma vero armatura
    private int damage;
    private int resistence;

 /*   public equip(String name,boolean type, int dm, int rc) {
        this.name = name;
        this.type = type;
        damage = dm;
        resistence = rc;
    }*/


    public Equip(){
        type =true;
        damage=0;
        resistence=0;
    }

    public Equip(boolean type, int damage, int resistence) {
        this.type = type;
        this.damage = damage;
        this.resistence = resistence;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getResistence() {
        return resistence;
    }

    public void setResistence(int resistence) {
        this.resistence = resistence;
    }

    @Override
    public String toString() {
        return "equip{" +
                ", type=" + type +
                ", damage=" + damage +
                ", resistence=" + resistence +
                '}';
    }


}


/*public static void getInfoEquip(equip equip){
        System.out.println("name: " + equip.name);
        System.out.println("type :" + equip.type);
        System.out.println("damage:" + equip.damage);
        System.out.println("resistance :" + equip.resistence);

    }*/