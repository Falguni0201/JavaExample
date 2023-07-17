
public class nestedifstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		if (i == 10 || i < 15 ) {
			 // First if statement
			if (i < 15)
		System.out.println("i is smaller then 15");
			// Nested - if statement
            // Will only be executed if statement above
            // it is true
			if (i < 12 )
				System.out.println("i is smaller then 12 too");
		}
		else {
			System.out.println("i is grater then 15");
		}
		
	}

}
