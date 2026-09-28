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
            String input = scnr.next();
            if (input.equals("+") || input.equalsIgnoreCase("plus") || input.equalsIgnoreCase("addition"))
            {
                op = Operator.PLUS;
            }
            else if (input.equals("-") || input.equalsIgnoreCase("minus") || input.equalsIgnoreCase("subtraction"))
            {
                op = Operator.MINUS;
            }
            else if (input.equals("*") || input.equalsIgnoreCase("multiply") || input.equalsIgnoreCase("multiplication"))
            {
                op = Operator.MULTIPLY;
            }
            else if (input.equals("/") || input.equalsIgnoreCase("divide") || input.equalsIgnoreCase("division"))
            {
                op = Operator.DIVIDE;
            }
            else if (input.equalsIgnoreCase("done"))
            {
                keepLooping = false;
                op = Operator.INVALID;
            }
            else
            {
                System.out.println("Bad input! Please type either '+', '-', '*', or '/'!");
                op = Operator.INVALID;
            }
            scnr.nextLine();

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
                    }
                    scnr.nextLine();
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

                    switch (op)
                    {
                        case PLUS:
                            runningValue += newValue;
                            // runningValue = runningValue + newValue;
                            break;
                        case MINUS:
                            runningValue -= newValue;
                            break;
                        case MULTIPLY:
                            runningValue *= newValue;
                            break;
                        case DIVIDE:
                            runningValue /= newValue;
                            break;
                    }
                }
            }
            System.out.println("Your total so far is: " + runningValue);
        }
    }
}
