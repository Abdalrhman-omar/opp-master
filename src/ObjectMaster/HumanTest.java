package ObjectMaster;

public class HumanTest {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();
        Wizard wizard = new Wizard();
        Samurai samurai1 = new Samurai();
        Samurai samurai2 = new Samurai();
        Ninja ninja = new Ninja();

//        human1.attack(human2);
//        System.out.println(human2.getHealth());

        wizard.fireball(human1);
        System.out.println(human1.getHealth());

        wizard.heal(human1);
        System.out.println(human1.getHealth());

        samurai1.deathBlow(human2);
        System.out.println(human2.getHealth());

        samurai1.meditate();
        System.out.println(samurai1.getHealth());

        ninja.steal(wizard);
        ninja.runAway();
        System.out.println(wizard.getHealth());



    }
}
