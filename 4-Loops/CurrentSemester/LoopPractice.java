import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

//        System.out.println("How old are you?");
//        while (!scnr.hasNextInt())
//        {
//            System.out.println("Bad input!");
//            scnr.nextLine();
//            System.out.println("How old are you?");
//        }
//        int age = scnr.nextInt();
//        System.out.println("You are " + age + " years old!");


        boolean badInput = true;
        int age = -1;

        while (badInput)
        {
            System.out.println("How old are you?");

            if (scnr.hasNextInt())
            {
                age = scnr.nextInt();
                if (age > 0)
                {
                    // we have verified they gave us an int AND it is greater than 0
                    badInput = false;
                }
                else
                {
                    // they gave a negative int
                    System.out.println("Age must be greater than or equal to 0");
                }
            }
            else
            {
                // know that they didn't give an int
                System.out.println("Age must be an integer!");
                scnr.nextLine();
            }
        }

        System.out.println("You are "+ age + " years old!");

    }
}
