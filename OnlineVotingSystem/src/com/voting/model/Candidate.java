package com.voting.model;

/**
 * Candidate class - Demonstrates Inheritance
 */
public class Candidate extends Person {
    private String party;
    private int voteCount;
    
    public Candidate(String id, String name, int age, String party) {
        super(id, name, age);
        this.party = party;
        this.voteCount = 0;
    }
    
    public String getParty() {
        return party;
    }
    
    public int getVoteCount() {
        return voteCount;
    }
    
    public void incrementVote() {
        this.voteCount++;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId() + " | Name: " + getName() + 
                         " | Party: " + party + " | Votes: " + voteCount);
    }
}
