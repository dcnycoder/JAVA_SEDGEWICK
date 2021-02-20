/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("./nodes.txt");
            Scanner readMyFile = new Scanner(file);
            System.out.println("Number of elements = " + readMyFile.next());
            while (readMyFile.hasNextLine()) {
                // String data = readMyFile.nextLine();
                String elem1 = readMyFile.next();
                System.out.println("First elem: " + elem1);
                String elem2 = readMyFile.next();
                System.out.println("Second elem: " + elem2);
            }
            readMyFile.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
