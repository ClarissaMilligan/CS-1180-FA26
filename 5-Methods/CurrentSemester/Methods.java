
public class Methods
{
    public static void main(String[] args)
    {
        String classList = formatStudent("Clarissa", 4.0);
        classList = classList + "\n" + Methods.formatStudent("Reese", 4.0);
        System.out.println(classList);

        System.out.println(formatStudent("Bibek", 3.9, 4));


        // type-casting practice
        int personOneAge = 5;
        double personTwoAge = personOneAge; // implicit type cast with no information lost

        double studentOneGrade = 27.5;
        //int midtermGrade = studentOneGrade; // type cast with information lost; not allowed by default in Java
        int midtermGrade = (int) studentOneGrade; // explicit type cast; lossy: we lose all data after the decimal [truncation]

        double answer = 29 / (double) 5; // explicit type cast without info loss to get around integer division


        // not on midterm
        // "casting" between String and non-String types
        String midtermString = ((Integer) midtermGrade).toString();
        String num = "54.3";
        double value = Double.parseDouble(num);
        System.out.println(value * 10);
    }

    // formatStudent is an overloaded method because we have the same method name and different parameter data types
    // compiler identifies methods based on name and parameter data types (order matters)

    public static String formatStudent(String name, double GPA)
    {
        return "Student name: " + name + " received a GPA of " + GPA;
    }

    public static String formatStudent(double creditHours, String name)
    {
        return "Student name: " + name + " took a total of " + creditHours + " credit hours";
    }

    public static String formatStudent(String name, double GPA, int numClasses)
    {
        return formatStudent(name, GPA) + " having taken " + numClasses + " classes";
    }
}
