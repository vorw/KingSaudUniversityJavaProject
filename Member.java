// GROUP MEMBERS:
// MOAYAD ABDULLAH BADAHDAH ---- 446108721
// SULTAN KHALID ALSANIE ---- 446108708
// GITHUB REP: https://github.com/vorw/KingSaudUniversityJavaProject
import java.util.Scanner;
public class Member {
      
	private int id;  //the member unique identification number.
    private String name;// the account holder name of the item.
    private int borrowedCount;// the number of books currently borrowed.
    private int numViewBorrowed;//the number of times the operation view borrowed books count was used.
    private int numBorrows;// the number of times the operation borrow book was used.
    private int numReturns;//the number of times the operation return book was used.
    private double sessionFees;//the total amount of fees that incurred during the session.
    public  static double TotalRevenue;//the total library profit generated from charging all accounts for using borrow operations.
    public static int TotalViewBorrowed;//the number of times the view borrowed books count was used.
    public static int TotalBorrows;// the number of times the borrow book operation was used.
    public static int TotalReturns;// the number of times the return book operation was used.

    public Member(int id, String name,int borrowedCount) {
    	this.id = id;
        this.name = name;
        this.borrowedCount = borrowedCount;
    	}

    private boolean canBorrow() { //Checks if the member can borrow more books not exceeding 5.
        if (borrowedCount < 5 && borrowedCount >= 0)
            return true;
        else 
        {
            return false;
        }
    }

    private boolean canReturn() { //Checks if the member can return a book.
        if (borrowedCount >= 1)
            return true;
        else
        {
            return false;
        }
    }
    
    public void viewBorrowedCount() { //Prints the member’s current borrowed book count.
        System.out.print(borrowedCount);
        numViewBorrowed++;
        TotalViewBorrowed++;
    }

    public boolean borrowOne() { // Simulates borrowing a book. A fee of 0.50 credit is charged and added to TotalRevenue.
        if (canBorrow()) {
            TotalBorrows++;
            borrowedCount++;
            numBorrows++;
            sessionFees += 0.50;
            TotalRevenue += 0.50;
            return true;
        }
        return false;
    }
        
    public boolean returnOne() { //Simulates returning a book. No fee is charged.
        if (canReturn()) {
            TotalReturns++;
            borrowedCount--;
            numReturns++;
            return true;
        }
        return false;
    }
    
    public void displayStatistics() { //Prints the member’s session statistics.
        System.out.println("You have borrowed: " + borrowedCount + " books");
        System.out.println("You have viewed your borrowed count: " + numViewBorrowed + " times");
        System.out.println("You have borrowed books: " + numBorrows + " times");
        System.out.println("You have returned books: " + numReturns + " times");
        System.out.println("Your session fees: " + sessionFees);
    }
    
    public void  reset() { //Resets the statistics to zero.
        numViewBorrowed = 0;
        numBorrows = 0;
        numReturns = 0;
        sessionFees = 0.0;
    }

    public int idGetter() {
        return id;
    }

    public String nameGetter() {
        return name;
    }

    public int borrowedCountGetter() {
        return borrowedCount;
    }

}
