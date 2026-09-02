import java.util.Scanner;

public class ConsoleIO
{
    public static void main(String[] args)
    {
        System.out.println("Hello class!!!");
        System.out.println("What is your name?");

        Scanner scnr = new Scanner(System.in);

        // to get a String from the user (multiple characters), I can call
        // - next() will get all the characters UNTIL there is a whitespace
        // - nextLine() will get all the characters UNTIL a newline (enter key press)
        String userName = scnr.next();
        userName = scnr.next();

        System.out.println(userName);


    }
}
