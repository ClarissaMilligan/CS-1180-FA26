import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileExample
{
    public static void main(String[] args)
    {
        Scanner usrInput = new Scanner(System.in);

        boolean continueLooping = true;

        while (continueLooping)
        {
            System.out.println("Enter the file number:");
            try
            {
                int fileNum = usrInput.nextInt();
                if (fileNum < 10 && fileNum > -1)
                {
                    continueLooping = false;
                    File fileToRead = new File(fileNum + ".txt");

                    System.out.println(countLetter('a', fileToRead));
                }
                else
                {
                    System.out.println("Not a valid file number! Must be between 0 and 9 inclusive");
                }
            }
            catch (InputMismatchException ime)
            {
                System.out.println("Wrong data type! Must be an int");
                usrInput.nextLine();
                continueLooping = true;
            }
            catch (FileNotFoundException fnfe)
            {
                System.out.println("Sorry that file does not exist! Please try again");
                continueLooping = true;
            }
        }
    }

    // write a method that reads the contents of a file and counts how many times a specified letter occurs
    public static int countLetter(char chosenLetter, File fileToRead) throws FileNotFoundException
    {
        Scanner fileInput = new Scanner(fileToRead);
        int letterCount = 0;
        while (fileInput.hasNextLine())
        {
            String contents = fileInput.nextLine();
            for (int i = 0; i < contents.length(); i++)
            {
                char letter = contents.charAt(i);
                if (letter == chosenLetter)
                {
                    letterCount++;
                }
            }
        }
        fileInput.close();
        return letterCount;
    }
}
