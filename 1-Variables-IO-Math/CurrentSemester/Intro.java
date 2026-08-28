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

        System.out.println("hi class!!");


    }
}