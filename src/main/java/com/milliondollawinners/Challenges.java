package com.milliondollawinners;

public class Challenges {

    // instance variables
    private String challengeDescription;

    // constructors 
    public Challenges() {
        challengeDescription = "No description for this challenge.";
    }

    public Challenges(String challengeDescription) {
        this.challengeDescription = challengeDescription;
    }

    // methods
    // accessor methods

    public String getChallengeDescription() {
        return challengeDescription;
    }
}
