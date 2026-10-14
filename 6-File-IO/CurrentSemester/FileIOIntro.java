import java.io.*;
import java.util.Scanner;

public class FileIOIntro
{
    public static void main(String[] args)
    {
        try
        {
            // these two lines find your working directory by creating a file there
            PrintWriter output = new PrintWriter("myFirstFile.txt");
            output.println("Hello!!!");
            // end these two lines
            output.close();

            FileWriter file = new FileWriter("roster.txt", true);
            PrintWriter writer = new PrintWriter(file);
            writer.println("Alice");
            writer.println("Bob");
            writer.close();
            file.close();

            File fileHandle = new File("roster.txt");
            Scanner fileReader = new Scanner(fileHandle);

            while (fileReader.hasNextLine())
            {
                System.out.println(fileReader.nextLine());
            }
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("File does not exist!!!");
        }
        catch (IOException ioe)
        {
            System.out.println("Some other file issue!");
        }
    }
}
