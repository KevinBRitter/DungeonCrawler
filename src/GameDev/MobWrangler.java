package GameDev;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MobWrangler {

    public static void main(String[] args)
    {
        // Initialize variables
        Introduction gameStart = new Introduction();
        PathDecisions stupidPath = new PathDecisions();
        Encounter rumble = new Encounter();

        Goblin goblin;
        Monster mob;
        Human player, human;
        player = new Human("Bobert");
        Random random = new Random();
        Scanner decision = new Scanner(System.in);

        // Initialize variables
        ArrayList<Integer> roomList;
        ArrayList<Monster> monsterList;
        int intPlayerRoomChoice = 4, intCurrentRoom = 4, intPreviousRoom = 7, intMonsterCount = 1, intMobChoice;
        boolean keepFighting = false;


        gameStart.intro();


        // Game loop that runs until the player opens the locked door.
        // This trigger requires the finding of at least 3 keys looted from mobs slain
        do {
            if (player.isDead)
            {
                // Go to end game credits
            }
            else
                {
                    intMobChoice = random.nextInt(intMonsterCount);
                    if (intMobChoice == 0) {
                        goblin = new Goblin();
                        mob = goblin;
                    } else {
                        human = new Human();
                        mob = human;
                    }

                    System.out.println("You've entered the room and see a " + mob.strName + " preparing to attack.");
                    System.out.println("You lunge forward and attack the " + mob.strName + " before it can react to you.");
                    rumble.Attack(player, mob);
                    keepFighting = rumble.CheckHealth(player, mob);
                    if(keepFighting)
                    {
                        // Attack, defend loop here
                    }
                    else
                    {
                        // Monster died
                        player.RaiseEXP(mob.GetEXP());
                        player.UpdateLvl();
                        if(mob.CheckKey())
                        {
                            player.addKey();
                        }
                    }
                    intPlayerRoomChoice = stupidPath.choosePath(intPreviousRoom, intCurrentRoom);
                    intPreviousRoom = intCurrentRoom;
                    intCurrentRoom = intPlayerRoomChoice;
                }
            }
            while (player.intKeyCount < 3) ;
            System.out.println("You found the keys!");
            System.out.println("Game over man!");

//        System.out.println("Working code!");
//        System.out.println("Your health: " + player.intCurrentHealth);
//        System.out.println("Your attack power: " + player.intAttackPower);
//        System.out.println("\nGoblin health: " + goblin.intCurrentHealth);
//        System.out.println("Goblin attack power: " + goblin.intAttackPower);
//        rumble.Attack(player, goblin);
//        System.out.println("\nGoblin health: " + goblin.intCurrentHealth);
//        System.out.println("Congrats, you killed the goblin... You're crazy man... crazy!");
//        int choice = stupidPath.choosePath(7, 4);
//        System.out.println("You chose: " + choice);
//        System.out.println("Rinse and repeat!");
    }
}
