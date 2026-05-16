# Online Voting System - Java Console Application

## 📋 Project Overview
A complete console-based **Online Voting System** developed using **Core Java** and **Object-Oriented Programming (OOP)** principles. This system enables secure voter registration, candidate management, vote casting with duplicate prevention, and real-time result display.

## 🎯 Features
- ✅ **Admin Panel** with password authentication
- ✅ **Candidate Registration** by admin
- ✅ **Voter Registration** with age validation (18+)
- ✅ **Secure Vote Casting** with duplicate prevention
- ✅ **Real-time Vote Counting**
- ✅ **Result Display** with winner announcement
- ✅ **Menu-driven Console Interface**
- ✅ **Exception Handling** for robust error management

## 🛠️ Technologies Used
- **Language:** Java (JDK 8+)
- **IDE:** Eclipse / IntelliJ IDEA / VS Code
- **Concepts:** OOP, Collections Framework, Exception Handling
- **Data Structures:** ArrayList, HashMap

## 📂 Project Structure
```
OnlineVotingSystem/
│
├── src/
│   └── com/
│       └── voting/
│           ├── Main.java                    # Entry point
│           ├── model/
│           │   ├── Person.java              # Abstract base class
│           │   ├── Admin.java               # Admin authentication
│           │   ├── Candidate.java           # Candidate entity
│           │   └── Voter.java               # Voter entity
│           └── service/
│               └── VotingService.java       # Business logic
│
└── docs/
    ├── README.md
    ├── PROJECT_DOCUMENTATION.md
    └── VIVA_QUESTIONS.md
```

## 🎓 OOP Concepts Implemented

### 1. **Encapsulation**
- Private fields with public getters/setters in all model classes
- Data hiding and controlled access

### 2. **Inheritance**
- `Person` (abstract base class)
  - `Candidate` extends Person
  - `Voter` extends Person

### 3. **Abstraction**
- Abstract `Person` class with abstract method `displayInfo()`
- Implementation in child classes

### 4. **Polymorphism**
- Method overriding: `displayInfo()` in Candidate and Voter classes
- Runtime polymorphism demonstration

## 🚀 How to Run

### Prerequisites
- JDK 8 or higher installed
- Eclipse IDE / IntelliJ IDEA / VS Code with Java extension

### Steps to Execute
1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/online-voting-system.git
   ```

2. **Open in IDE:**
   - Import the project into Eclipse/IntelliJ
   - Or open the folder in VS Code

3. **Compile and Run:**
   ```bash
   cd OnlineVotingSystem/src
   javac com/voting/Main.java
   java com.voting.Main
   ```

4. **Default Admin Credentials:**
   - Username: `admin`
   - Password: `admin123`

## 📖 Usage Flow

### Admin Operations:
1. Login with admin credentials
2. Register candidates with party details
3. View all voters and candidates
4. End voting when required

### Voter Operations:
1. Register as a voter (age 18+)
2. Cast vote for a candidate
3. View candidate list
4. View results

## 📊 Sample Output
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
Enter your choice: 4

========== CANDIDATE LIST ==========
ID: C001 | Name: John Doe | Party: Party A | Votes: 5
ID: C002 | Name: Jane Smith | Party: Party B | Votes: 3
====================================

========== VOTING RESULTS ==========
🏆 WINNER: John Doe (Party A) with 5 votes!
====================================
```

## 🔐 Security Features
- Password-based admin authentication
- Duplicate voting prevention using voter ID tracking
- Age validation for voter registration
- Input validation and exception handling

## 📝 Key Learning Outcomes
- Core Java programming
- OOP principles implementation
- Collections Framework (ArrayList, HashMap)
- Exception handling
- Console-based application development
- Menu-driven program design

## 👨‍💻 Author
**Your Name**
- GitHub: [@yourusername](https://github.com/yourusername)
- LinkedIn: [Your Profile](https://linkedin.com/in/yourprofile)

## 📄 License
This project is open-source and available for educational purposes.

## 🤝 Contributing
Contributions, issues, and feature requests are welcome!

## ⭐ Show Your Support
Give a ⭐️ if this project helped you!

---
**Note:** This is a college mini project developed for educational purposes to demonstrate Core Java and OOP concepts.
