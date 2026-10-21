import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {
        double[] nums = {3.4, 9.8, 37.3};
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));
        Scanner scnr = new Scanner(System.in);
        System.out.println(scnr);

        for (double number : nums)
        {
            System.out.println(number);
        }

        resetArray(nums);
        System.out.println("After method call:" + Arrays.toString(nums));
    }

    public static void resetArray(double[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = 0.0;
        }
    }
}
