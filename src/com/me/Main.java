package com.me;

public class Main {

    public static void main(String[] args) {

        //step 4 instance for new object of encapsulate class
        Encapsulate obj = new Encapsulate();

        Encapsulate obj2 = new Encapsulate();

        //step 5 setting values of the variables for
        //the new object,
        //calling the set methods by the new objects we created
        obj.setPlayerName("Jim");
        obj.setPlayerAge(25);
        obj.setPlayerHeight(72);

        obj2.setPlayerName("Barb");
        obj2.setPlayerAge(27);
        obj2.setPlayerHeight(49);

        //step 6 displaying values of variables
        System.out.println("Player's name: " + obj.getPlayerName());
        System.out.println("Player's age: " + obj.getPlayerAge());
        System.out.println("Player's height: " + obj.getPlayerHeight() + " inches");

        System.out.println("=============================================================================");

        System.out.println("Player's name: " + obj2.getPlayerName());
        System.out.println("Player's age: " + obj2.getPlayerAge());
        System.out.println("Player's height: " + obj2.getPlayerHeight() + " inches");

        //note:
        /*
        direct access to playername, playerage, and playerheight is not
        possible due to private encapsulation, so we access the new ones
         */

    }

}

/*results;
Player's name: Jim
Player's age: 25
Player's height: 72 inches
=============================================================================
Player's name: Barb
Player's age: 27
Player's height: 49 inches
 */
