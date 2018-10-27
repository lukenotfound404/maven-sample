package zazpi.maven_sample;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.AbstractCollection;
import java.util.AbstractList;

public class MyFirstMaven{
	/**
	 * Sums two Integer numbers and returns the result;
	 * @param: x Integer type.
	 * @param: y Integer type
	 * @return: return the sum of the given numbers*/
    public int suma(int x, int y) {
        // the following is just an example
        return x + y;
    }

    public static void main(String[] args) {
        try{
            PrintWriter writer = new PrintWriter("MavenTest.txt", "UTF-8");
            writer.println("The first line");
            writer.println("The second line");
            writer.close();
        } catch (IOException e) {
            // do something
        }
    }


}
