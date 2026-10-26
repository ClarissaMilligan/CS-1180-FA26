import java.util.Arrays;

public class MultiDimArrays
{
    public static void main(String[] args)
    {
        double[][] studentGPAsByClass = {
                {3.6, 4.0, 2.7, 2.3, 3.4, 1.9, 3.7, 3.8},
                {4.0, 3.8, 3.7, 3.2, 2.9, 3.0},
                {2.6, 2.4, 2.9, 2.8, 3.1, 3.4, 3.6} };

        System.out.println(studentGPAsByClass); // prints the memory address for the 2D-array
        System.out.println(Arrays.toString(studentGPAsByClass)); // prints the memory addresses of the internal arrays

        for (double[] classGPAs : studentGPAsByClass)
        {
            //System.out.println(classGPAs); // print the memory address for each internal array
            System.out.println(Arrays.toString(classGPAs)); // prints the data for each of the internal arrays
            for (double studentGPA : classGPAs)
            {
                System.out.println(studentGPA);
            }

            double[] allGPAAvgs = getAllAvgs(studentGPAsByClass);
            System.out.println(Arrays.toString(allGPAAvgs));
        }
    }

    public static double calcAvg(double[] data)
    {
        double avg = 0.0;
        for (double datum : data)
        {
            avg = avg + datum;
        }
        return avg / data.length;
    }

    public static double[] getAllAvgs(double[][] gpas)
    {
        double[] allAvgs = new double[gpas.length];

        for (int i = 0; i < gpas.length; i++)
        {
            allAvgs[i] = calcAvg(gpas[i]);
        }

        return allAvgs;
    }
}
