import java.util.Scanner;

public class IllustrateScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating object of Scanner class to
        // read input from keyboard
        Scanner scn = new Scanner(System.in);
 
        System.out.println("Enter an integer & a String");
 
        // Using nextInt() to parse integer values
        int a = scn.nextInt();
 
        // Using nextLine() to parse string values
        String b = scn.nextLine();
 
        // Display name and age entered above
        System.out.printf("You have entered:- " + a + " "
                          + "and name as " + b);
	}

}
