// GROUP MEMBERS:
// MOAYAD ABDULLAH BADAHDAH ---- 446108721
// SULTAN KHALID ALSANIE ---- 446108708
// GITHUB REP: https://github.com/vorw/KingSaudUniversityJavaProject
import java.util.Scanner;
public class LibrarySimulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Members created
        Member user1 = new Member(45637122, "Ahmed", 0); // user 1
        Member user2 = new Member(45333333, "Murad", 0); // user 2
        Member user3 = new Member(45400254, "Yasser", 0); // user 3
        Member currentUser = null;

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
                System.out.println("\t1 - " + user1.nameGetter() + " ID: " + user1.idGetter());
                System.out.println("\t2 - " + user2.nameGetter() + " ID: " + user2.idGetter());
                System.out.println("\t3 - " + user3.nameGetter() + " ID: " + user3.idGetter());
                System.out.println("\t============================");

                user = input.nextLine();
                // Setting Data Based On Selected User
                if (user.equals("1"))
                {
                    currentUser = user1;
                }
                else if (user.equals("2"))
                {
                    currentUser = user2;
                }
                else if (user.equals("3"))
                {
                    currentUser = user3;
                }
                else // Invalid User
                {
                    System.out.println("You've only got 3 numbers..");
                    continue;
                }

                // User Functions Menu
                String function = "";
                System.out.println("Look Who's Back, " + currentUser.nameGetter() + " Glad To See You Again!");
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
                        System.out.print("You Currently Have ");
                        currentUser.viewBorrowedCount();
                        System.out.println(" Books Borrowed.");
                    }
                    else if (function.equals("2")) // Borrow Book
                    {
                        System.out.println("How Many Books?");
                        int wantToBorrow = input.nextInt();
                        input.nextLine();
                        if (wantToBorrow <= 0)
                            System.err.println("Can't borrow this amount of books");
                        else {
                            for (int i = 1; i <= wantToBorrow; i++) {
                                if (currentUser.borrowOne()) {
                                    System.out.println("Borrowed one Book Successfully!");
                                }
                                else {
                                    System.err.println("No more books can be borrowed.");
                                    break;
                                }
                            }
                        }
                    }
                    else if (function.equals("3")) // Return Book
                    {
                        System.out.println("How Many Books?");
                        int wantToReturn = input.nextInt();
                        input.nextLine();
                        if (wantToReturn <= 0) {
                            System.err.println("Can't return this amount of books"); }
                        else{
                            for (int i = 1; i <= wantToReturn; i++) {
                                if (currentUser.returnOne()) {
                                    System.out.println("Returned one Book Successfully!");
                                }
                                else {
                                    System.err.println("No more books left to return");
                                    break;
                                }
                            }
                        }
                    }
                    else if (function.equals("4")) // View Session Summary
                    {
                       currentUser.displayStatistics();
                    }
                    else if (function.equals("5")) // Exit User Menu
                    {
                        currentUser.reset();
                        System.out.println("Session Ended, " + currentUser.nameGetter() + ". See You Again Hopefully!");
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
                        System.out.printf("Total Revenue: $%.2f%n", Member.TotalRevenue);
                    }
                    else if (admin.equals("2")) // Most Frequent Operation
                    {
                        if (Member.TotalBorrows > Member.TotalReturns)
                        {
                            System.out.println("Most Frequent Operation: Borrowing");
                        }
                        else if (Member.TotalReturns > Member.TotalBorrows)
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
