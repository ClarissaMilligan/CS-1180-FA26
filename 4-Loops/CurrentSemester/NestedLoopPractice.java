import java.util.Scanner;

public class NestedLoopPractice
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        enum Operator {INVALID, PLUS, MINUS, MULTIPLY, DIVIDE};
        Operator op = Operator.INVALID;

        boolean keepLooping = true;
        double runningValue = 0.0;

        while (keepLooping)
        {
            System.out.println("Choose either addition, subtraction, multiplication, or division: (+ - * /)");
            String operator = scnr.next();
            if (operator.equals("+") || operator.equalsIgnoreCase("plus") || operator.equalsIgnoreCase("addition"))
            {
                op = Operator.PLUS;
            }
            else if (operator.equals("-") || operator.equalsIgnoreCase("minus") || operator.equalsIgnoreCase("subtraction"))
            {
                op = Operator.MINUS;
            }
            else if (operator.equals("*") || operator.equalsIgnoreCase("multiply") || operator.equalsIgnoreCase("multiplication"))
            {
                op = Operator.MULTIPLY;
            }
            else if (operator.equals("/") || operator.equalsIgnoreCase("divide") || operator.equalsIgnoreCase("division"))
            {
                op = Operator.DIVIDE;
            }
            else
            {
                System.out.println("Bad input! Please type either '+', '-', '*', or '/'!");
                op = Operator.INVALID;
            }

            if (op != Operator.INVALID)
            {
                boolean notAnInt = true;
                int numTimes = -1;
                while (notAnInt)
                {
                    System.out.println("Enter the number of times to perform the operation:");
                    if (scnr.hasNextInt())
                    {
                        numTimes = scnr.nextInt();
                        notAnInt = false;
                    }
                    else
                    {
                        System.out.println("You must type in an integer!");
                        scnr.nextLine();
                    }
                }

                for (int i = 0; i < numTimes; i++)
                {
                    notAnInt = true;
                    double newValue = 0.0;
                    while (notAnInt)
                    {
                        System.out.println("Enter a number:");
                        if (scnr.hasNextDouble())
                        {
                            newValue = scnr.nextDouble();
                            notAnInt = false;
                        }
                        else
                        {
                            System.out.println("You must type in a number!");
                            scnr.nextLine();
                        }
                    }

                    // runningValue += -= *= /= newValue

                }

            }

        }
    }
}
