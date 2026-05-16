package com.voting.model;

/**
 * Abstract base class demonstrating Abstraction and Inheritance
 */
public abstract class Person {
    private String id;
    private String name;
    private int age;
    
    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    // Encapsulation - Getters and Setters
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    // Abstract method - must be implemented by subclasses
    public abstract void displayInfo();
}
