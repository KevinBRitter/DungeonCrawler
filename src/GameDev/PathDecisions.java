package GameDev;

import java.util.Scanner;

public class PathDecisions
{
    // Attributes
    int prevRoomNum, currentRoomNum, playerChoice;
    Scanner choiceIn;
    public int choosePath(int prevRoom, int currentRoom)
    {
        this.prevRoomNum = prevRoom;
        this.currentRoomNum = currentRoom;
        if (prevRoom == 7)
        {
            // You are in room 4, choices of 3, 5, or back to 7
            System.out.println("Ok, there's options.  Should you go right or left?");
            System.out.println("You can go back too, but that's a dead end right?");
            System.out.println(" 1. - Left, 2. Right, 3. Back ");
            playerChoice = verifyChoice(3);
        }
        else if (prevRoom == 4 && currentRoom == 3)
        {
            // You are in room 3, choices of 6, 2, 1, or back to 4
            System.out.println("Should you go left, forward, right or back?");
            System.out.println(" 1. - Left, 2. Forward, 3. Right, 4. Back ");
            playerChoice = verifyChoice(4);
        }
        else if (prevRoom == 4 && currentRoom == 5)
        {
            // You are in room 5, choices of 1, 8, or back to 4
            System.out.println("Ok, there's options.  Should you go right or left?");
            System.out.println("You can go back too, but that's a dead end right?");
            System.out.println(" 1. - Left, 2. Right, 3. Back ");
            playerChoice = verifyChoice(3);
        }
        else if (currentRoom == 6)
        {
            // You are in room 6, choices of back to 3
            System.out.println("Ok, there's options.  Should you go right or left?");
            System.out.println("You can go back too, but that's a dead end right?");
            System.out.println(" 1. - Left, 2. Right, 3. Back ");
            playerChoice = verifyChoice(1);
        }
        else if (currentRoom == 2)
        {
            // You are in room 2, choices of back to 3
            System.out.println("Ok, there's options.  Should you go right or left?");
            System.out.println("You can go back too, but that's a dead end right?");
            System.out.println(" 1. - Left, 2. Right, 3. Back ");
            playerChoice = verifyChoice(1);
        }
        else if (currentRoom == 8)
        {
            // You are in room 8, choices of back to 5
            System.out.println("Ok, there's options.  Should you go right or left?");
            System.out.println("You can go back too, but that's a dead end right?");
            System.out.println(" 1. - Left, 2. Right, 3. Back ");
            playerChoice = verifyChoice(1);
        }
        else if (prevRoom == 4 && currentRoom == 7)
        {
            // You are in room 7, choices of back to 4
            System.out.println("Ok, there's options.  Should you go right or left?");
            System.out.println("You can go back too, but that's a dead end right?");
            System.out.println(" 1. - Left, 2. Right, 3. Back ");
            playerChoice = verifyChoice(1);
        }
        else if (prevRoom == 5 && currentRoom == 4)
        {
            // You are in room 4, choices of 7, 3, or back to 5
            System.out.println("Ok, there's options.  Should you go right or left?");
            System.out.println("You can go back too, but that's a dead end right?");
            System.out.println(" 1. - Left, 2. Right, 3. Back ");
            playerChoice = verifyChoice(3);
        }
        else if (prevRoom == 1 && currentRoom == 5)
        {
            // You are in room 5, choices of 8, 4, or back to 1
            System.out.println("Ok, there's options.  Should you go right or left?");
            System.out.println("You can go back too, but that's a dead end right?");
            System.out.println(" 1. - Left, 2. Right, 3. Back ");
            playerChoice = verifyChoice(3);
        }
        else if (prevRoom == 3 && currentRoom == 4)
        {
            // You are in room 4, choices of 5, 7, or back to 3
            System.out.println("Ok, there's options.  Should you go right or left?");
            System.out.println("You can go back too, but that's a dead end right?");
            System.out.println(" 1. - Left, 2. Right, 3. Back ");
            playerChoice = verifyChoice(3);
        }
        else if (prevRoom == 3 && currentRoom == 1)
        {
            // You are in room 1, choices of Exit, 5, or back to 3
            System.out.println("Ok, there's options.  Should you go right or left?");
            System.out.println("You can go back too, but that's a dead end right?");
            System.out.println(" 1. - Left, 2. Right, 3. Back ");
            playerChoice = verifyChoice(3);
        }
        else if (prevRoom == 2 && currentRoom == 3)
        {
            // You are in room 3, choices of 1, 4, 6, or back to 2
            System.out.println("Ok, there's options.  Should you go left, forward, or right?");
            System.out.println("You can go back too.");
            System.out.println(" 1. - Left, 2. Forward, 3. Right, 4. Back ");
            playerChoice = verifyChoice(4);
        }
        else if (prevRoom == 6 && currentRoom == 3)
        {
            // You are in room 3, choices of 2, 1, 4, or back to 6
            System.out.println("Ok, there's options.  Should you go left, forward, or right?");
            System.out.println("You can go back too.");
            System.out.println(" 1. - Left, 2. Forward, 3. Right, 4. Back ");
            playerChoice = verifyChoice(4);
        }
        else if (prevRoom == 8 && currentRoom == 5)
        {
            // You are in room 5, choices of 4, 1, or back to 8
            System.out.println("Ok, there's options.  Should you go right or left?");
            System.out.println("You can go back too, but that's a dead end right?");
            System.out.println(" 1. - Left, 2. Right, 3. Back ");
            playerChoice = verifyChoice(3);
        }
        else if (prevRoom == 1 && currentRoom == 3)
        {
            // You are in room 3, choices of 4, 6, 2, or back to 1
            System.out.println("Ok, there's options.  Should you go left, forward, or right?");
            System.out.println("You can go back too.");
            System.out.println(" 1. - Left, 2. Forward, 3. Right, 4. Back ");
            playerChoice = verifyChoice(4);
        }
        else if (prevRoom == 5 && currentRoom == 1)
        {
            // You are in room 1, choices of 3, Exit, or back to 5
            System.out.println("Ok, there's options.  Should you go right or left?");
            System.out.println("You can go back too, but that's a dead end right?");
            System.out.println(" 1. - Left, 2. Right, 3. Back ");
            playerChoice = verifyChoice(3);
        }
        return playerChoice;
    }
    public int verifyChoice(int options)
    {
        boolean valid = false;
        int choice = 0;
        do {
            choiceIn  = new Scanner(System.in);
            try {
                choice = Integer.parseInt(choiceIn.nextLine());
                for (int i = 1; i == options; i++)
                {
                    if( choice == i){ valid = true; }
                }

            } catch (Exception e)
            {
                // No message. Crash prevention.
            }
            if( !valid )
            {
                System.out.println(" Well, you made a choice... but " + this.choiceIn + " wasn't an option.");
                System.out.println("Be sure to try one of the given integers.");
                choiceIn.close();
            }
        } while( !valid );
        return choice;
    }
}
