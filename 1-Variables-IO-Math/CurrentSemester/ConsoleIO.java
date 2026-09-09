import java.util.Scanner;

public class ConsoleIO
{
    public static void main(String[] args)
    {
        System.out.println("Hello class!!!");

        int myFavoriteNumber = 8;

        // Scanner on the RHS of the assignment is a call to the constructor
        // Constructor is a special method in a class with the same name as the class
        // We pass System.in to the constructor to indicate we would like to read from the console
        Scanner scnr = new Scanner(System.in);


        System.out.println("What is your first name?");

        // to get a String from the user (multiple characters), I can call
        // - next() will get all the characters UNTIL there is a whitespace
        // - nextLine() will get all the characters UNTIL a newline (enter key press)
        String firstName = scnr.next();

        System.out.println("What is your last name?");
        String lastName = scnr.next();

        System.out.println("How old are you?");
        int userAge = scnr.nextInt();
        int birthYear = 2026 - userAge;

        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Birth date: " + birthYear);

        char firstLetter = firstName.charAt(0);
        System.out.println("The first letter of your name is: " + firstLetter);

        boolean hasAnA = firstName.contains("a");
        int index = firstName.indexOf("a");
        System.out.println("The first name contains the letter 'a': " + hasAnA);
        System.out.println("'a' was found at index " + index);
        System.out.println("the first name is " + firstName.length() + " characters long");
        System.out.println("the last three characters of the name are: " + firstName.substring(firstName.length() - 3));

    }
}
