import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro
{
    public static void main(String[] args)
    {
        ArrayList<String> honorsStudents = new ArrayList<>();
        honorsStudents.add("Lucas");
        honorsStudents.add("Ben");
        honorsStudents.add("Rylan");
        honorsStudents.add("Blake");

        System.out.println(honorsStudents);

        honorsStudents.add(2, "Kate");
        System.out.println(honorsStudents);
        honorsStudents.add(0, "Xavier");

        System.out.println(honorsStudents);

        honorsStudents.set(1, "Bridget");

        System.out.println(honorsStudents);

        System.out.println(honorsStudents.remove(4));

        System.out.println(honorsStudents);

        System.out.println(honorsStudents.size());

        System.out.println(honorsStudents.get(3));

        System.out.println(honorsStudents.contains("Bob"));
        System.out.println(honorsStudents.contains("Kate"));

        System.out.println(honorsStudents.isEmpty());

        honorsStudents.clear();

        System.out.println(honorsStudents);
        System.out.println(honorsStudents.isEmpty());

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 8));
        System.out.println(nums);
    }
}
