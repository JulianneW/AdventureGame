/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adventuregame;
import java.util.Scanner;
/**
 *
 * @author JuWoj8013
 */
public class AdventureGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        String response1;
        String response2;
        String response3;
        String response4;
        String response5;
        String response6;
        String response7;
        String response8;
        String response9;
        String response10;
        System.out.println("You enter a hainted house and find two doors labeled 'Kitchen' and 'Bedroom' Which one do you enter?");
        response1 = keyedInput.nextLine();
        if (response1.equals("Kitchen"))
            {
                System.out.println("You encounter witches brewing stew in a cauldron. Do you drink what they offer you?");
                response2 = keyedInput.nextLine();
                if (response2.equals("Yes"))
            {
                System.out.println("You're dead. Didn't your mom tell you not to take sketchy drinks from strangers?");
            }
                if (response2.equals("No"))
            {
                System.out.println("Smart choice! You pour the soup over the witches, they melt, and you crawl up through the chimney");
                System.out.println("You are now in the attic. Do you escaape through the window or hole in the floor?");
            }  
                response3 = keyedInput.nextLine();
                if (response3.equals("Window"))
            {
                System.out.println("You are outside! You spot a bike and ride it far away. Congratulations, you escaped!");
            }     
                if (response3.equals("Hole"))
            {
                System.out.println("There was no ladder. You fell flat on your face. Next time look before you leap");
            }     
            }
        if (response1.equals("Bedroom"))
            {
                System.out.println("There is a child sleeping in the bed. Do you wake him?");
                response4 = keyedInput.nextLine();
                if (response4.equals("Yes"))
            {
                System.out.println("Good job. The child woke up and suck the soul right out of your body. Nice.");
            }    
                if (response4.equals("No"))
            {
                System.out.println("Smart choice! Never wake a sleeping child. You notice two keys sitting on a dresser.");
                System.out.println("Do you take the one labeled 'Car' or 'Basement'?");
            }      
                response5 = keyedInput.nextLine();
                if (response5.equals("Car"))
            {
                System.out.println("You exit the way you came and find thee garage. The door to the outside is wide open.");
                System.out.println("There is a car and a bike. Which do you take?");
            }       
                if (response5.equals("Basement"))
            {
                System.out.println("There is a stairway in the room that leads to the basement. You enter.");
                System.out.println("There are four ghosts hanging around. Do you approach them?");
            }      
               response7 = keyedInput.nextLine();
               if (response7.equals("Yes"))
            {
                System.out.println("They're friendly! They help you out and you promise to come visit!");
            }    
               if (response7.equals("No"))
            {
                System.out.println("Well I guess you're just stuck on the ladder for eternity now. Hope you can hold on.");
            }    
                response6 = keyedInput.nextLine();
                if (response6.equals("Car"))
            {
                System.out.println("You start it up using the key and quickly zoom back home. You escaped.");
            }       
               if (response6.equals("Bike"))   
            {
                System.out.println("I mean you got away but... you had the keys to the car.");
            }    
               if (response5.equals("Basement"))
            {
                System.out.println("There is a stairway in the room that leads to the basement. You enter.");
                System.out.println("There are four ghosts hanging around. Do you approach them?");
            }      
               response7 = keyedInput.nextLine();
               if (response7.equals("Yes"))
            {
                System.out.println("They're friendly! They help you out and you promise to come visit!");
            }    
               if (response7.equals("No"))
            {
                System.out.println("Well I guess you're just stuck on the ladder for eternity now. Hope you can hold on.");
            }       
            }

        // TODO code application logic here
    }
    
}
