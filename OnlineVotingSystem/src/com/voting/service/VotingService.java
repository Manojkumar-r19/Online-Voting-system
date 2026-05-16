package com.voting.service;

import com.voting.model.Candidate;
import com.voting.model.Voter;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * VotingService - Core business logic using Collections Framework
 */
public class VotingService {
    private ArrayList<Candidate> candidates;
    private HashMap<String, Voter> voters;
    private boolean votingActive;
    
    public VotingService() {
        this.candidates = new ArrayList<>();
        this.voters = new HashMap<>();
        this.votingActive = true;
    }
    
    // Candidate Management
    public void addCandidate(Candidate candidate) throws Exception {
        for (Candidate c : candidates) {
            if (c.getId().equals(candidate.getId())) {
                throw new Exception("Candidate with ID " + candidate.getId() + " already exists!");
            }
        }
        candidates.add(candidate);
        System.out.println("✓ Candidate registered successfully!");
    }
    
    // Voter Management
    public void addVoter(Voter voter) throws Exception {
        if (voter.getAge() < 18) {
            throw new Exception("Voter must be at least 18 years old!");
        }
        if (voters.containsKey(voter.getId())) {
            throw new Exception("Voter with ID " + voter.getId() + " already registered!");
        }
        voters.put(voter.getId(), voter);
        System.out.println("✓ Voter registered successfully!");
    }
    
    // Vote Casting with validation
    public void castVote(String voterId, String candidateId) throws Exception {
        if (!votingActive) {
            throw new Exception("Voting has ended!");
        }
        
        Voter voter = voters.get(voterId);
        if (voter == null) {
            throw new Exception("Voter ID not found! Please register first.");
        }
        
        if (voter.hasVoted()) {
            throw new Exception("You have already voted! Duplicate voting not allowed.");
        }
        
        Candidate candidate = findCandidateById(candidateId);
        if (candidate == null) {
            throw new Exception("Invalid Candidate ID!");
        }
        
        candidate.incrementVote();
        voter.markAsVoted();
        System.out.println("✓ Vote cast successfully for " + candidate.getName() + "!");
    }
    
    private Candidate findCandidateById(String id) {
        for (Candidate c : candidates) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }
    
    // Display all candidates
    public void displayCandidates() {
        if (candidates.isEmpty()) {
            System.out.println("No candidates registered yet.");
            return;
        }
        System.out.println("\n========== CANDIDATE LIST ==========");
        for (Candidate c : candidates) {
            c.displayInfo();
        }
        System.out.println("====================================\n");
    }
    
    // Display all voters
    public void displayVoters() {
        if (voters.isEmpty()) {
            System.out.println("No voters registered yet.");
            return;
        }
        System.out.println("\n========== VOTER LIST ==========");
        for (Voter v : voters.values()) {
            v.displayInfo();
        }
        System.out.println("================================\n");
    }
    
    // Display results and winner
    public void displayResults() {
        if (candidates.isEmpty()) {
            System.out.println("No candidates to display results.");
            return;
        }
        
        System.out.println("\n========== VOTING RESULTS ==========");
        Candidate winner = candidates.get(0);
        
        for (Candidate c : candidates) {
            c.displayInfo();
            if (c.getVoteCount() > winner.getVoteCount()) {
                winner = c;
            }
        }
        
        System.out.println("====================================");
        System.out.println("🏆 WINNER: " + winner.getName() + " (" + winner.getParty() + 
                         ") with " + winner.getVoteCount() + " votes!");
        System.out.println("====================================\n");
    }
    
    public void endVoting() {
        votingActive = false;
        System.out.println("✓ Voting has been closed!");
    }
    
    public boolean isVotingActive() {
        return votingActive;
    }
    
    public int getTotalVoters() {
        return voters.size();
    }
    
    public int getTotalCandidates() {
        return candidates.size();
    }
}
