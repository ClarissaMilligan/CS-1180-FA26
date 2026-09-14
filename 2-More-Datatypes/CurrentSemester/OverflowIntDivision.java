import java.util.Scanner;

public class OverflowIntDivision
{
    public static void main(String[] args)
    {
        System.out.println("\"Hello!\" said Bob");
        System.out.print("a\nb\nc\n");

        System.out.printf("Your grade is %.2f%%\n", 75.38921);

        int reallyBigNumber = 2147483647;

        System.out.println(reallyBigNumber);
        reallyBigNumber = reallyBigNumber + 1;
        System.out.println(reallyBigNumber);
        reallyBigNumber = reallyBigNumber * 34;
        System.out.println(reallyBigNumber);

        byte num = 127;
        num = (byte) (num +  1);
        System.out.println(num);

        float f = 5.5f;

        long l = 55L;


        Scanner scnr = new Scanner(System.in);

        System.out.println("type in either + or -");
        String operator = scnr.nextLine();
        operator = operator.substring(0, 1);

        if (operator.equals( "+"))
        {
            System.out.println("PLUS!!!");
        }
        else if (operator.equals("-"))
        {
            System.out.println("MINUS");
        }
        else
        {
            System.out.println("NOT RECOGNIZED");
        }
    }
}
