import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating the instance of class BufferedReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        String name;
        try {
            System.out.println("Enter your name");
            name = reader.readLine(); // taking string input
            System.out.println("Name=" + name);
        }
        catch (Exception e) {
        }
        
	}

}
