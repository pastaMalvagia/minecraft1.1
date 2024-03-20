public class MainMinecraft {
    public static void main(String[] args){
        Equip nulla = new Equip(false,0,0);
        Equip arma1 = new Equip(false,3, 0);
        Equip arma2 = new Equip(false,4,0);
        Equip armatura1 = new Equip(true,0,2);
        Equip armatura2 = new Equip(true,0,3);

        Player Juan = new Player(20,arma2,armatura2,"juan",true);

        Mob zombi = new Mob(20, arma2, armatura1,"zombi", true, false, true);
        Mob ragno = new Mob(15, arma1,nulla,"ragno",false,true,true);
        Mob pollo = new Mob(10,nulla,nulla,"pollo",false,false,true);

        System.out.println("Juan attacca uno zombi");
        Juan.attacca(zombi);
        System.out.println(Juan.toString());
        System.out.println(zombi.toString());
        System.out.println("Juan attacca un ragno");
        Juan.attacca(ragno);
        System.out.println(Juan.toString());
        System.out.println(ragno.toString());
        System.out.println("Juan attacca un pollo");
        Juan.attacca(pollo);
        System.out.println(Juan.toString());
        System.out.println(pollo.toString());
        System.out.println("zombi attacca Juan");
        zombi.attacca(Juan);
        System.out.println(zombi.toString());
        System.out.println(Juan.toString());
    }
}
