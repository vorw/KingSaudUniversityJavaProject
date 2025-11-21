// GROUP MEMBERS:
// MOAYAD ABDULLAH BADAHDAH ---- 446108721
// SULTAN KHALID ALSANIE ---- 446108708
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

    public void Member(int id, String name,int borrowedCount ) {
    	
    	}
    private void canBorrow(){
    
    if (Borrowed<5&&this.Borrowed>-1)
         System.out.println("you can borrow books");
    else 
    	 System.out.println("you can't borrow books more than 5");	
    }//Checks if the member can borrow more books.
    private void canReturn(){
    	
    	  if (Borrowed>=1)
    	         System.out.println("you can return books");
    	    else 
    	    	 System.out.println("you can't return books becuase you don,t have books already");	
    	        
   
    		}//Checks if the member can return a book
    
    public void viewBorrowedCount() {
    	 
    	System.out.println(Borrowed);
    	
    }//Prints the member’s current borrowed book count.
    public void borrowOne(){
    	Scanner input = new Scanner(System.in);
    	int return_books = input.nextInt();
        Borrowed - this.return_books;
    System.out.print(Borrowed);
    	input.close();//close input
    }// Simulates borrowing a book. A fee of 0.50 credit is charged and added to TotalRevenue.
    public void returnOne(){
    	Scanner input = new Scanner(System.in);
    	int return_books = input.nextInt();
        Borrowed - this.return_books;
    System.out.print(Borrowed);//close input
    }//Simulates returning a book. No fee is charged.
    
    public void displayStatistics() {
    	
    	System.out.println(borrowedCount);
    }//Prints the member’s session statistics.
    public void  reset() {
    	
    	
    }//Resets the statistics to zero.
   public void Setters() {
	   
	   
   }
    
    
    
    
    public void getters() {
    	
    	
    }
    
    
    
    

}

