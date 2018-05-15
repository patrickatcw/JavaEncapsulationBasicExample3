package com.me;

//step 1 make this class
public class Encapsulate {

    //step 2 variables or fields, these are private.
    //but can be accessed by the public methods of class
    private String playerName;
    private int playerAge;
    private int playerHeight;

    //step 3 getters and setters
    //get method for name to access
    //private variable playerName
    public String getPlayerName() {
        return playerName;
    }

    // set method for name to access
    // private variable playerName
    public void setPlayerName(String newName) {
        //this.playerName = playerName;
        playerName = newName;
    }

    // get method for age to access
    // private variable playerAge
    public int getPlayerAge() {
        return playerAge;
    }

    // set method for age to access
    // private variable playerage
    public void setPlayerAge(int newAge) {
        //this.playerAge = playerAge;
        playerAge = newAge;
    }

    // get method for height to access
    // private variable playerHeight
    public int getPlayerHeight() {
        return playerHeight;
    }

    // set method for height to access
    // private variable playerheoght
    public void setPlayerHeight(int newHeight) {
        //this.playerHeight = playerHeight;
        playerHeight = newHeight;

    }
}
