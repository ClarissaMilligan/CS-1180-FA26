import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class FileGenerator
{
    public static void main(String[] args) throws FileNotFoundException
    {
        PrintWriter pw;
        for (int i = 0; i < 10; i++)
        {
            pw = new PrintWriter(i + ".txt");
            pw.print(generateLetters(10));
            pw.close();
        }
    }

    // method that takes in a number and generates that many random letters stored in a String
    // ASCII 97 - 122 (inclusive)
    public static String generateLetters(int num)
    {
        Random rng = new Random();
        String letters = "";
        for (int i = 0; i < num; i++)
        {
            char letter = (char) rng.nextInt(97, 123);
            letters = letters + letter;
        }
        return letters;
    }
}
