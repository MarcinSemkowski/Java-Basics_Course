package OOP_Part_2_Composition_Encapsulation_and_Polimorphism.L_3;

public class Main {

    public static void main(String[] args) {

       /* Player player = new Player();
        player.name = " Tim";
        player.health = 20;
        player.weapon = "Sword";
        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health " + player.healthRemaning());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health " + player.healthRemaning());
       */
       EnhancedPlayer player = new EnhancedPlayer("Tim",200,"Sword");
        System.out.println("Initial health is " +player.getHealth());
    }

}
