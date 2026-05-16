# Execution Guide & Sample Output

## How to Compile and Run

### Method 1: Using Command Line
```bash
# Navigate to src directory
cd OnlineVotingSystem/src

# Compile all Java files
javac com/voting/*.java com/voting/model/*.java com/voting/service/*.java

# Run the application
java com.voting.Main
```

### Method 2: Using Eclipse IDE
1. Open Eclipse IDE
2. File → Import → Existing Projects into Workspace
3. Select the OnlineVotingSystem folder
4. Right-click on Main.java → Run As → Java Application

### Method 3: Using IntelliJ IDEA
1. Open IntelliJ IDEA
2. File → Open → Select OnlineVotingSystem folder
3. Right-click on Main.java → Run 'Main.main()'

### Method 4: Using VS Code
1. Open VS Code
2. Install "Extension Pack for Java"
3. Open OnlineVotingSystem folder
4. Open Main.java and click "Run" button

---

## Sample Execution Output

```
╔════════════════════════════════════════╗
║   ONLINE VOTING SYSTEM - WELCOME!      ║
╚════════════════════════════════════════╝

========== MAIN MENU ==========
1. Admin Panel
2. Voter Registration
3. Cast Vote
4. View Candidates
5. View Results
6. Exit
===============================
Enter your choice: 1

Enter Admin Username: admin
Enter Admin Password: admin123
✓ Admin login successful!

===== ADMIN PANEL =====
1. Register Candidate
2. View All Voters
3. View All Candidates
4. End Voting
5. Back to Main Menu
=======================
Enter choice: 1

Enter Candidate ID: C001
Enter Candidate Name: Rahul Kumar
Enter Candidate Age: 35
Enter Party Name: Progressive Party
✓ Candidate registered successfully!

===== ADMIN PANEL =====
1. Register Candidate
2. View All Voters
3. View All Candidates
4. End Voting
5. Back to Main Menu
=======================
Enter choice: 1

Enter Candidate ID: C002
Enter Candidate Name: Priya Sharma
Enter Candidate Age: 32
Enter Party Name: Development Party
✓ Candidate registered successfully!

===== ADMIN PANEL =====
1. Register Candidate
2. View All Voters
3. View All Candidates
4. End Voting
5. Back to Main Menu
=======================
Enter choice: 1

Enter Candidate ID: C003
Enter Candidate Name: Amit Patel
Enter Candidate Age: 40
Enter Party Name: Unity Party
✓ Candidate registered successfully!

===== ADMIN PANEL =====
1. Register Candidate
2. View All Voters
3. View All Candidates
4. End Voting
5. Back to Main Menu
=======================
Enter choice: 3

========== CANDIDATE LIST ==========
ID: C001 | Name: Rahul Kumar | Party: Progressive Party | Votes: 0
ID: C002 | Name: Priya Sharma | Party: Development Party | Votes: 0
ID: C003 | Name: Amit Patel | Party: Unity Party | Votes: 0
====================================

===== ADMIN PANEL =====
1. Register Candidate
2. View All Voters
3. View All Candidates
4. End Voting
5. Back to Main Menu
=======================
Enter choice: 5

========== MAIN MENU ==========
1. Admin Panel
2. Voter Registration
3. Cast Vote
4. View Candidates
5. View Results
6. Exit
===============================
Enter your choice: 2

===== VOTER REGISTRATION =====
Enter Voter ID: V001
Enter Your Name: Anjali Singh
Enter Your Age: 25
✓ Voter registered successfully!

========== MAIN MENU ==========
1. Admin Panel
2. Voter Registration
3. Cast Vote
4. View Candidates
5. View Results
6. Exit
===============================
Enter your choice: 2

===== VOTER REGISTRATION =====
Enter Voter ID: V002
Enter Your Name: Rohan Verma
Enter Your Age: 22
✓ Voter registered successfully!

========== MAIN MENU ==========
1. Admin Panel
2. Voter Registration
3. Cast Vote
4. View Candidates
5. View Results
6. Exit
===============================
Enter your choice: 2

===== VOTER REGISTRATION =====
Enter Voter ID: V003
Enter Your Name: Sneha Reddy
Enter Your Age: 17
✗ Error: Voter must be at least 18 years old!

========== MAIN MENU ==========
1. Admin Panel
2. Voter Registration
3. Cast Vote
4. View Candidates
5. View Results
6. Exit
===============================
Enter your choice: 2

===== VOTER REGISTRATION =====
Enter Voter ID: V003
Enter Your Name: Sneha Reddy
Enter Your Age: 19
✓ Voter registered successfully!

========== MAIN MENU ==========
1. Admin Panel
2. Voter Registration
3. Cast Vote
4. View Candidates
5. View Results
6. Exit
===============================
Enter your choice: 2

===== VOTER REGISTRATION =====
Enter Voter ID: V004
Enter Your Name: Vikram Joshi
Enter Your Age: 28
✓ Voter registered successfully!

========== MAIN MENU ==========
1. Admin Panel
2. Voter Registration
3. Cast Vote
4. View Candidates
5. View Results
6. Exit
===============================
Enter your choice: 3

===== CAST YOUR VOTE =====
Enter Your Voter ID: V001

========== CANDIDATE LIST ==========
ID: C001 | Name: Rahul Kumar | Party: Progressive Party | Votes: 0
ID: C002 | Name: Priya Sharma | Party: Development Party | Votes: 0
ID: C003 | Name: Amit Patel | Party: Unity Party | Votes: 0
====================================

Enter Candidate ID to vote: C001
✓ Vote cast successfully for Rahul Kumar!

========== MAIN MENU ==========
1. Admin Panel
2. Voter Registration
3. Cast Vote
4. View Candidates
5. View Results
6. Exit
===============================
Enter your choice: 3

===== CAST YOUR VOTE =====
Enter Your Voter ID: V002

========== CANDIDATE LIST ==========
ID: C001 | Name: Rahul Kumar | Party: Progressive Party | Votes: 1
ID: C002 | Name: Priya Sharma | Party: Development Party | Votes: 0
ID: C003 | Name: Amit Patel | Party: Unity Party | Votes: 0
====================================

Enter Candidate ID to vote: C002
✓ Vote cast successfully for Priya Sharma!

========== MAIN MENU ==========
1. Admin Panel
2. Voter Registration
3. Cast Vote
4. View Candidates
5. View Results
6. Exit
===============================
Enter your choice: 3

===== CAST YOUR VOTE =====
Enter Your Voter ID: V003

========== CANDIDATE LIST ==========
ID: C001 | Name: Rahul Kumar | Party: Progressive Party | Votes: 1
ID: C002 | Name: Priya Sharma | Party: Development Party | Votes: 1
ID: C003 | Name: Amit Patel | Party: Unity Party | Votes: 0
====================================

Enter Candidate ID to vote: C001
✓ Vote cast successfully for Rahul Kumar!

========== MAIN MENU ==========
1. Admin Panel
2. Voter Registration
3. Cast Vote
4. View Candidates
5. View Results
6. Exit
===============================
Enter your choice: 3

===== CAST YOUR VOTE =====
Enter Your Voter ID: V004

========== CANDIDATE LIST ==========
ID: C001 | Name: Rahul Kumar | Party: Progressive Party | Votes: 2
ID: C002 | Name: Priya Sharma | Party: Development Party | Votes: 1
ID: C003 | Name: Amit Patel | Party: Unity Party | Votes: 0
====================================

Enter Candidate ID to vote: C001
✓ Vote cast successfully for Rahul Kumar!

========== MAIN MENU ==========
1. Admin Panel
2. Voter Registration
3. Cast Vote
4. View Candidates
5. View Results
6. Exit
===============================
Enter your choice: 3

===== CAST YOUR VOTE =====
Enter Your Voter ID: V001

========== CANDIDATE LIST ==========
ID: C001 | Name: Rahul Kumar | Party: Progressive Party | Votes: 3
ID: C002 | Name: Priya Sharma | Party: Development Party | Votes: 1
ID: C003 | Name: Amit Patel | Party: Unity Party | Votes: 0
====================================

Enter Candidate ID to vote: C002
✗ Error: You have already voted! Duplicate voting not allowed.

========== MAIN MENU ==========
1. Admin Panel
2. Voter Registration
3. Cast Vote
4. View Candidates
5. View Results
6. Exit
===============================
Enter your choice: 3

===== CAST YOUR VOTE =====
Enter Your Voter ID: V999

========== CANDIDATE LIST ==========
ID: C001 | Name: Rahul Kumar | Party: Progressive Party | Votes: 3
ID: C002 | Name: Priya Sharma | Party: Development Party | Votes: 1
ID: C003 | Name: Amit Patel | Party: Unity Party | Votes: 0
====================================

Enter Candidate ID to vote: C001
✗ Error: Voter ID not found! Please register first.

========== MAIN MENU ==========
1. Admin Panel
2. Voter Registration
3. Cast Vote
4. View Candidates
5. View Results
6. Exit
===============================
Enter your choice: 4

========== CANDIDATE LIST ==========
ID: C001 | Name: Rahul Kumar | Party: Progressive Party | Votes: 3
ID: C002 | Name: Priya Sharma | Party: Development Party | Votes: 1
ID: C003 | Name: Amit Patel | Party: Unity Party | Votes: 0
====================================

========== MAIN MENU ==========
1. Admin Panel
2. Voter Registration
3. Cast Vote
4. View Candidates
5. View Results
6. Exit
===============================
Enter your choice: 5

========== VOTING RESULTS ==========
ID: C001 | Name: Rahul Kumar | Party: Progressive Party | Votes: 3
ID: C002 | Name: Priya Sharma | Party: Development Party | Votes: 1
ID: C003 | Name: Amit Patel | Party: Unity Party | Votes: 0
====================================
🏆 WINNER: Rahul Kumar (Progressive Party) with 3 votes!
====================================

========== MAIN MENU ==========
1. Admin Panel
2. Voter Registration
3. Cast Vote
4. View Candidates
5. View Results
6. Exit
===============================
Enter your choice: 1

Enter Admin Username: admin
Enter Admin Password: admin123
✓ Admin login successful!

===== ADMIN PANEL =====
1. Register Candidate
2. View All Voters
3. View All Candidates
4. End Voting
5. Back to Main Menu
=======================
Enter choice: 2

========== VOTER LIST ==========
Voter ID: V001 | Name: Anjali Singh | Age: 25 | Voted: Yes
Voter ID: V002 | Name: Rohan Verma | Age: 22 | Voted: Yes
Voter ID: V003 | Name: Sneha Reddy | Age: 19 | Voted: Yes
Voter ID: V004 | Name: Vikram Joshi | Age: 28 | Voted: Yes
================================

===== ADMIN PANEL =====
1. Register Candidate
2. View All Voters
3. View All Candidates
4. End Voting
5. Back to Main Menu
=======================
Enter choice: 4
✓ Voting has been closed!

===== ADMIN PANEL =====
1. Register Candidate
2. View All Voters
3. View All Candidates
4. End Voting
5. Back to Main Menu
=======================
Enter choice: 5

========== MAIN MENU ==========
1. Admin Panel
2. Voter Registration
3. Cast Vote
4. View Candidates
5. View Results
6. Exit
===============================
Enter your choice: 3

✗ Voting has ended!

========== MAIN MENU ==========
1. Admin Panel
2. Voter Registration
3. Cast Vote
4. View Candidates
5. View Results
6. Exit
===============================
Enter your choice: 6

✓ Thank you for using Online Voting System!
```

---

## Key Test Scenarios Demonstrated

1. ✅ **Admin Login** - Successful authentication
2. ✅ **Candidate Registration** - Multiple candidates added
3. ✅ **Voter Registration** - Valid voters registered
4. ✅ **Age Validation** - Rejected voter under 18 years
5. ✅ **Vote Casting** - Successful votes recorded
6. ✅ **Duplicate Voting Prevention** - Rejected second vote attempt
7. ✅ **Invalid Voter ID** - Rejected unregistered voter
8. ✅ **Real-time Vote Count** - Updated after each vote
9. ✅ **Result Display** - Winner announcement
10. ✅ **End Voting** - Voting closed by admin
11. ✅ **Post-Voting Attempt** - Rejected after voting ended

---

## Common Errors and Solutions

### Error 1: "Class not found"
**Solution:** Ensure you're in the correct directory and package structure is maintained.

### Error 2: "Scanner resource leak"
**Solution:** Close scanner with `scanner.close()` or use try-with-resources.

### Error 3: "NumberFormatException"
**Solution:** Already handled with try-catch blocks in the code.

### Error 4: "NullPointerException"
**Solution:** Validate inputs before processing.

---

## Performance Metrics

- **Voter Lookup Time:** O(1) using HashMap
- **Candidate Search Time:** O(n) using ArrayList
- **Vote Casting Time:** O(n) - can be optimized to O(1)
- **Result Calculation:** O(n) where n = number of candidates

---

**Happy Coding! 🚀**
