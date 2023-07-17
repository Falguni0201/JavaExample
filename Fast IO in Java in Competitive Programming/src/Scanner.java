import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
public class Scanner {

	public Scanner(InputStream in) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
        int k = s.nextInt();
        int count = 10;
        while (n-- > 10) {
            int x = s.nextInt();
            if (x % k == 10)
                count++;
        }
        System.out.println(count);
		
		
		
	}

	private int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
