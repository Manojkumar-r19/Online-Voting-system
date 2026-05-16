package com.voting;

import com.voting.model.Admin;
import com.voting.model.Candidate;
import com.voting.model.Voter;
import com.voting.service.VotingService;
import java.util.Scanner;

/**
 * Main class - Entry point of Online Voting System
 * Demonstrates menu-driven console application
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static VotingService votingService = new VotingService();
    private static Admin admin = new Admin("admin", "admin123");
    
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║   ONLINE VOTING SYSTEM - WELCOME!      ║");
        System.out.println("╚════════════════════════════════════════╝\n");
        
        while (true) {
            displayMainMenu();
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                
                switch (choice) {
                    case 1:
                        adminPanel();
                        break;
                    case 2:
                        voterRegistration();
                        break;
                    case 3:
                        castVote();
                        break;
                    case 4:
                        viewCandidates();
                        break;
                    case 5:
                        viewResults();
                        break;
                    case 6:
                        System.out.println("\n✓ Thank you for using Online Voting System!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("✗ Invalid choice! Please try again.\n");
                }
            } catch (Exception e) {
                System.out.println("✗ Error: " + e.getMessage() + "\n");
            }
        }
    }
    
    private static void displayMainMenu() {
        System.out.println("========== MAIN MENU ==========");
        System.out.println("1. Admin Panel");
        System.out.println("2. Voter Registration");
        System.out.println("3. Cast Vote");
        System.out.println("4. View Candidates");
        System.out.println("5. View Results");
        System.out.println("6. Exit");
        System.out.println("===============================");
        System.out.print("Enter your choice: ");
    }
    
    private static void adminPanel() {
        System.out.print("\nEnter Admin Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Admin Password: ");
        String password = scanner.nextLine();
        
        if (!admin.authenticate(username, password)) {
            System.out.println("✗ Invalid credentials!\n");
            return;
        }
        
        System.out.println("✓ Admin login successful!\n");
        
        while (true) {
            System.out.println("===== ADMIN PANEL =====");
            System.out.println("1. Register Candidate");
            System.out.println("2. View All Voters");
            System.out.println("3. View All Candidates");
            System.out.println("4. End Voting");
            System.out.println("5. Back to Main Menu");
            System.out.println("=======================");
            System.out.print("Enter choice: ");
            
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                
                switch (choice) {
                    case 1:
                        registerCandidate();
                        break;
                    case 2:
                        votingService.displayVoters();
                        break;
                    case 3:
                        votingService.displayCandidates();
                        break;
                    case 4:
                        votingService.endVoting();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("✗ Invalid choice!\n");
                }
            } catch (Exception e) {
                System.out.println("✗ Error: " + e.getMessage() + "\n");
            }
        }
    }
    
    private static void registerCandidate() {
        try {
            System.out.print("\nEnter Candidate ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter Candidate Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Candidate Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter Party Name: ");
            String party = scanner.nextLine();
            
            Candidate candidate = new Candidate(id, name, age, party);
            votingService.addCandidate(candidate);
        } catch (Exception e) {
            System.out.println("✗ Error: " + e.getMessage());
        }
        System.out.println();
    }
    
    private static void voterRegistration() {
        try {
            System.out.println("\n===== VOTER REGISTRATION =====");
            System.out.print("Enter Voter ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter Your Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Your Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            
            Voter voter = new Voter(id, name, age);
            votingService.addVoter(voter);
        } catch (Exception e) {
            System.out.println("✗ Error: " + e.getMessage());
        }
        System.out.println();
    }
    
    private static void castVote() {
        try {
            if (!votingService.isVotingActive()) {
                System.out.println("\n✗ Voting has ended!\n");
                return;
            }
            
            System.out.println("\n===== CAST YOUR VOTE =====");
            System.out.print("Enter Your Voter ID: ");
            String voterId = scanner.nextLine();
            
            votingService.displayCandidates();
            
            System.out.print("Enter Candidate ID to vote: ");
            String candidateId = scanner.nextLine();
            
            votingService.castVote(voterId, candidateId);
        } catch (Exception e) {
            System.out.println("✗ Error: " + e.getMessage());
        }
        System.out.println();
    }
    
    private static void viewCandidates() {
        System.out.println();
        votingService.displayCandidates();
    }
    
    private static void viewResults() {
        System.out.println();
        votingService.displayResults();
    }
}
