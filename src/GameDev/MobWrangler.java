package GameDev;


import java.util.ArrayList;

public class MobWrangler {

    public static void main(String[] args) {
        PathDecisions stupidPath = new PathDecisions();
        Goblin goblin = new Goblin();
        Human player = new Human("Bobert");
        // Initialize variables
        ArrayList<Integer> roomList;
        ArrayList<Monster> combatantList;
        System.out.println("Working code!");
        System.out.println("Your health: " + player.intCurrentHealth);
        System.out.println("Your attack power: " + player.intAttackPower);
        System.out.println("\nGoblin health: " + goblin.intCurrentHealth);
        System.out.println("Goblin attack power: " + goblin.intAttackPower);
        Encounter.Attack(player, goblin);
        System.out.println("\nGoblin health: " + goblin.intCurrentHealth);
        System.out.println("Congrats, you killed the goblin... You're crazy man... crazy!");
        int choice = stupidPath.choosePath(7, 4);
        System.out.println("You chose: " + choice);
        System.out.println("Rinse and repeat!");
    }
}
