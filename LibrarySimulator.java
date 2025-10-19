import java.util.Scanner;
public class Library {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // First User Data
        int id_1 = 045637122; // ID Number
        String username_1 = ("Ahmed"); // User name
        int firstBorrowed = 2; // Books Currently Borrowed
        int firstBorrowedThisSession = 0; // Books Borrowed This Session

        // Second User Data
        int id_2 = 0453333333; // ID Number
        String username_2 = ("Murad"); // User name
        int secondBorrowed = 5; // Books Currently Borrowed
        int secondBorrowedThisSession = 0; // Books Borrowed This Session

        // Third User Data
        int id_3 = 045400254; // ID Number
        String username_3 = ("Yasser"); // User name
        int thirdBorrowed = 10; // Books Currently Borrowed
        int thirdBorrowedThisSession = 0; // Books Borrowed This Session

        // Administrator




        System.out.println("The Library Welcomes You!");
        System.out.println("----------------------")
        System.out.println("1 - Select A User Account");
        System.out.println("2 - Login As Administrator");
        System.out.println("3 - Exit");
        String menu = input.nextLine();
        if (menu == "1") {
            System.out.println("Available Users:");
            System.out.println("1 - " + username_1 + " ID: " + id_1);
            System.out.println("2 - " + username_2 + " ID: " + id_2);
            System.out.println("3 - " + username_3 + " ID: " + id_3);
            String user = input.nextLine();
            if (user == "1") {
                System.out.println("Look Who's Back, " + username_1 + " Glad To See You Again!");
                System.out.println("1 - View Borrowed Books");
                System.out.println("2 - Borrow Book");
                System.out.println("3 - Return Book");
                System.out.println("4 - View Session Summary");
                System.out.println("5 - Exit");
                String function = input.nextLine();
                if (function == "1") {
                    System.out.println("You Currently Have " + firstBorrowed + " Books Borrowed.");
                if (function == "2") {
                    System.out.println("How Many Books?");
                    int numberOfBooks = input.nextInt();
            } else if (user == "2") {
                System.out.println("Look Who's Back, " + username_2 + " Glad To See You Again!");
                System.out.println("1 - View Borrowed Books");
                System.out.println("2 - Borrow Book");
                System.out.println("3 - Return Book");
                System.out.println("4 - View Session Summary");
                System.out.println("5 - Exit");
                String function = input.nextLine();
                if (function == "1") {
                    System.out.println("You Currently Have " + secondBorrowed + " Books Borrowed.");
                } else if (function == "2") {
                    System.out.println("How Many Books?");
                    int numberOfBooks = input.nextInt();
            } else if (user == "3") {
                System.out.println("Look Who's Back, " + username_3 + " Glad To See You Again!");
                System.out.println("1 - View Borrowed Books");
                System.out.println("2 - Borrow Book");
                System.out.println("3 - Return Book");
                System.out.println("4 - View Session Summary");
                System.out.println("5 - Exit");
                String function = input.nextLine();
                if (function == "1") {
                    System.out.println("You Currently Have " + thirdBorrowed + " Books Borrowed.");
                } else if (function == "2") {
                    System.out.println("How Many Books?");
                    int numberOfBooks = input.nextInt();
            } else
                System.out.println("You've only got 3 numbers..");
        } else if (menu == "2")) {
            System.out.print(w);
        } else if (menu == "3") {

        } else
            System.out.println("You've only got 3 numbers..");
    }
}
