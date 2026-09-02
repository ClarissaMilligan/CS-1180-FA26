public class Intro
{
    public static void main(String[] args)
    {
        // double slash starts a comment that the Java compiler will ignore

        /*
        This is a
        block comment
        that can go on multiple lines without the //
         */



        // Java primitive data types are built in to the language itself
        // always start with a lowercase letter
        // - byte
        // - short
        // - int
        // - long
        // - float
        // - double
        // - char
        // - boolean

        // int is the integer data type
        int variableName;                       // variable declaration

        // System.out.println(variableName);

        // = is the assignment operater: allows us to store info in a variable
        variableName = 8;                       // variable initialization


        // double is the data type we use for decimal numbers
        double radius = 5.78;                   // variable declaration and initialization


        // Java literals are the literal value that they appear to be
        // - numbers can just be typed as normal
        // - if you want text,
        //      - use single quotes for a single character
        //      - use double quotes for more than one character (aka string literals)
        // - boolean literal: true or false

        // char stands for character and can hold one single character (no more, no less)
        char singleCharacter = 'a';

        // boolean holds either the value true or false (both lowercase)
        boolean isStudentInClass = false;

        // String is an object in Java that can hold multi-character literals
        // objects are variables where the data type is a Java CLASS
        String multipleCharacters = "abcdefg";
        //String blah = new String("bhvsdbj");

        System.out.println("hi class!!");


        // MATH !!!! //
        double averageAge = 0.0;

        int personOneAge = 29;
        int personTwoAge = 54;
        int personThreeAge = 21;

        int personAgeSum = personOneAge + personTwoAge + personThreeAge;

        // use slash for divide, use asterisk for multiplication
        averageAge = personAgeSum / 3;                  // integer division occurs because both the divisor and dividend are ints
                                                        // does not matter if we store in a double because the calculation is still int division
        averageAge = personAgeSum / 3.0;                // no int division, java recognizes 3.0 as a double
        averageAge = personAgeSum / 3.;                 // no int division, java recognizes 3. as a double
        averageAge = ( (double) personAgeSum )/ 3;      // no int division, personAgeSum is cast to double
        averageAge = personAgeSum / (double) 3;         // no int division, personAgeSum is cast to double
        System.out.println(averageAge);

        // type casting: change the data type of a variable
        // put the new data type in parentheses
        int intAverageAge = (int) averageAge;           // lossy type cast: lose everything after decimal
        //int intAverageAge = averageAge;               // lossy conversions cannot be done without type casting in Java
        System.out.println(intAverageAge);

        //boolean booleanAverageAge = (boolean) averageAge; // can't cast things don't make sense (i.e. number into a boolean)

        // Java uses ASCII characters for char type
        // this means every character has an associated integer value
        char charAverageAge = (char) intAverageAge;
        // in this case, 34 is "
        System.out.println(charAverageAge);


        // i want to use my averageAge and calculate the area of a circle, where averageAge is the radius
        // Math class has many other useful math constants and functions
        // Math class exists in the lang package so it does not need imported
        double arbitraryArea = Math.PI * Math.pow(averageAge, 2);
        System.out.println(arbitraryArea);

        // modulus operator: finds the remainder of a division operation
        int remainder = 25 % 5;         // 25 is divisible by 5 so the remainder is 0
        System.out.println(remainder);
        remainder = 25 % 2;             // 25 is NOT divisible by 2 and the remainder is 1 (meaning it is odd)
        System.out.println(remainder);

    }
}