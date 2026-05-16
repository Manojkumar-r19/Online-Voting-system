package com.voting.model;

/**
 * Admin class for system administration
 */
public class Admin {
    private String username;
    private String password;
    
    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
    
    public String getUsername() {
        return username;
    }
}
