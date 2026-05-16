package com.voting.model;

/**
 * Voter class - Demonstrates Inheritance
 */
public class Voter extends Person {
    private boolean hasVoted;
    
    public Voter(String id, String name, int age) {
        super(id, name, age);
        this.hasVoted = false;
    }
    
    public boolean hasVoted() {
        return hasVoted;
    }
    
    public void markAsVoted() {
        this.hasVoted = true;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Voter ID: " + getId() + " | Name: " + getName() + 
                         " | Age: " + getAge() + " | Voted: " + (hasVoted ? "Yes" : "No"));
    }
}
