import java.util.Scanner;
public class LibraryProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // First User Data
        String id_1 = "045637122"; // ID Number
        String username_1 = ("Ahmed"); // User name
        int firstBorrowed = 0; // Books Currently Borrowed
        int firstReturnedThisSession = 0; // Books Returned This Session
        int firstBorrowedThisSession = 0; // Books Borrowed This Session
        double firstFeesThisSession = 0; // Fees From Borrowing This Session

        // Second User Data
        String id_2 = "0453333333"; // ID Number
        String username_2 = ("Murad"); // User name
        int secondBorrowed = 0; // Books Currently Borrowed
        int secondReturnedThisSession = 0; // Books Returned This Session
        int secondBorrowedThisSession = 0; // Books Borrowed This Session
        double secondFeesThisSession = 0; // Fees From Borrowing This Session

        // Third User Data
        String id_3 = "045400254"; // ID Number
        String username_3 = ("Yasser"); // User name
        int thirdBorrowed = 0; // Books Currently Borrowed
        int thirdReturnedThisSession = 0; // Books Returned This Session
        int thirdBorrowedThisSession = 0; // Books Borrowed This Session
        double thirdFeesThisSession = 0; // Fees From Borrowing This Session

        // Admin Data
        int totalBorrows = 0; // Total Books Borrowed
        int totalReturns = 0; // Total Books Returned
        double totalRevenue = 0; // Total Revenue Generated

        // Main Menu Loop
        String main = "";
        String user = "";
        while (!main.equals("3"))
        {
            System.out.println("----------------------------");
            System.out.println("*Welcome To The Library*");
            System.out.println("----------------------------");
            System.out.println("1 - Select A User Account");
            System.out.println("2 - Login As Administrator");
            System.out.println("3 - Exit");
            System.out.println("============================");
            
            main = input.nextLine();

            if (main.equals("1")) // User Menu
            {
                System.out.println("\tAvailable Users:");
                System.out.println("\t----------------------------");
                System.out.println("\t1 - " + username_1 + " ID: " + id_1);
                System.out.println("\t2 - " + username_2 + " ID: " + id_2);
                System.out.println("\t3 - " + username_3 + " ID: " + id_3);
                System.out.println("\t============================");

                user = input.nextLine();
                String currentUser = ""; // Current Username
                int borrowed = 0; // Books Currently Borrowed
                int returned = 0; // Books Currently Returned
                int returnedThisSession = 0; // Books Returned This Session
                int borrowedThisSession = 0; // Books Borrowed This Session
                double feesThisSession = 0; // Fees From Borrowing This Session

                // Setting Data Based On Selected User
                if (user.equals("1"))
                {
                    currentUser = username_1;
                    borrowed = firstBorrowed;
                    returnedThisSession = firstReturnedThisSession;
                    borrowedThisSession = firstBorrowedThisSession;
                    feesThisSession = firstFeesThisSession;
                }
                else if (user.equals("2"))
                {
                    currentUser = username_2;
                    borrowed = secondBorrowed;
                    returnedThisSession = secondReturnedThisSession;
                    borrowedThisSession = secondBorrowedThisSession;
                    feesThisSession = secondFeesThisSession;
                }
                else if (user.equals("3"))
                {
                    currentUser = username_3;
                    borrowed = thirdBorrowed;
                    returnedThisSession = thirdReturnedThisSession;
                    borrowedThisSession = thirdBorrowedThisSession;
                    feesThisSession = thirdFeesThisSession;
                }
                else // Invalid User
                {
                    System.out.println("You've only got 3 numbers..");
                }

                // User Functions Menu
                String function = "";
                System.out.println("Look Who's Back, " + currentUser + " Glad To See You Again!");
                while (!function.equals("5"))
                {
                    System.out.println("\t\t----------------------------");
                    System.out.println("\t\t1 - View Borrowed Books");
                    System.out.println("\t\t2 - Borrow Book");  
                    System.out.println("\t\t3 - Return Book");
                    System.out.println("\t\t4 - View Session Summary");
                    System.out.println("\t\t5 - Exit");
                    System.out.println("\t\t============================");
                    
                    function = input.nextLine();
                    if (function.equals("1")) // View Borrowed Books
                    {
                        System.out.println("You Currently Have " + (borrowed) + " Books Borrowed.");
                    }
                    else if (function.equals("2")) // Borrow Book
                    {
                        System.out.println("How Many Books?");
                        int borrow = input.nextInt();
                        input.nextLine();
                        if (borrowed + borrow > 5) // Max 5 Books
                        {
                            System.out.println("Can't borrow more than 5 books..");
                        }
                        else if (borrow <= 0) // Invalid Number
                        {
                            System.out.println("How are you borrowing that number of books..");
                        }
                        else // Valid Borrow
                        {
                            borrowed += borrow;
                            borrowedThisSession += borrow;
                            System.out.println("You Have Borrowed " + borrow + " Books.");
                            feesThisSession += borrow * 0.5;
                            System.out.printf("You Have Fees Of $%.2f This Session.%n", feesThisSession);
                            totalRevenue += borrow * 0.5;
                            totalBorrows += borrow;
                        }
                    }
                    else if (function.equals("3")) // Return Book
                    {
                        System.out.println("How Many Books?");
                        returned = input.nextInt();
                        input.nextLine();
                        if (returned > borrowed) // Can't Return More Than Borrowed
                        {
                            System.out.println("You Can't Return More Books Than You Have Borrowed..");
                        }
                        else if (returned <= 0) // Invalid Number
                        {
                            System.out.println("How are you returning that number of books..");
                        }
                        else // Valid Return
                        {
                            borrowed -= returned;
                            returnedThisSession += returned;
                            System.out.println("You Have Returned " + returned + " Books.");
                            totalReturns += returned;
                        }
                    }
                    else if (function.equals("4")) // View Session Summary
                    {
                        System.out.println("Session Summary:");
                        System.out.println("Books Borrowed: " + borrowedThisSession);
                        System.out.println("Books Returned: " + returnedThisSession);
                        System.out.println("Fees: $" + feesThisSession);
                    }
                    else if (function.equals("5")) // Exit User Menu
                    {
                        System.out.println("Session Ended, " + currentUser + ". See You Again Hopefully!");
                        
                        // Updating User Data After Session
                        if (user.equals("1"))
                        {
                            firstBorrowed = borrowed;
                            firstReturnedThisSession = returnedThisSession;
                            firstBorrowedThisSession = borrowedThisSession;
                            firstFeesThisSession = feesThisSession;
                        }
                        else if (user.equals("2"))
                        {
                            secondBorrowed = borrowed;
                            secondReturnedThisSession = returnedThisSession;
                            secondBorrowedThisSession = borrowedThisSession;
                            secondFeesThisSession = feesThisSession;
                        }
                        else if (user.equals("3"))
                        {
                            thirdBorrowed = borrowed;
                            thirdReturnedThisSession = returnedThisSession;
                            thirdBorrowedThisSession = borrowedThisSession;
                            thirdFeesThisSession = feesThisSession;
                        }
                        else // Invalid User
                        {
                            System.out.println("You've only got 3 numbers..");
                        }
                    }
                    else // Invalid function
                    {
                        System.out.println("You've only got 5 numbers..");
                    }
                }
            }
            else if (main.equals("2")) // Admin Menu
            {
                String admin = "";
                System.out.println("Nice To See An Administrator Come Back!");
                while (!admin.equals("3"))
                {
                    System.out.println("\t----------------------------");
                    System.out.println("\t1 - View Total Revenue");
                    System.out.println("\t2 - Most Frequent Operation");
                    System.out.println("\t3 - Exit");
                    System.out.println("\t============================");
                    admin = input.nextLine();
                    
                    if (admin.equals("1")) // View Total Revenue
                    {
                        System.out.printf("Total Revenue: $%.2f%n", totalRevenue);
                    }
                    else if (admin.equals("2")) // Most Frequent Operation
                    {
                        if (totalBorrows > totalReturns)
                        {
                            System.out.println("Most Frequent Operation: Borrowing");
                        }
                        else if (totalReturns > totalBorrows)
                        {
                            System.out.println("Most Frequent Operation: Returning");
                        }
                        else
                        {
                            System.out.println("Both Borrows & Returns!");
                        }
                    }
                    else if (admin.equals("3")) // Exit Admin Menu
                    {
                        System.out.println("See you later!");
                    }
                    else // Invalid function
                    {
                        System.out.println("You've only got 3 numbers..");
                    }
                }
            }
        }
        System.out.println("Thank You For Using The Library!"); // Exit Program
        input.close(); // Close Scanner
    }
}
