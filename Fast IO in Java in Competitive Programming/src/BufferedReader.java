import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReader {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
			 throws IOException
    {
		BufferedReader br = new BufferedReader ();
		
		StringTokenizer st = new StringTokenizer(br.realine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int count = 0;
		while (n--> 0) {
			int X = Integer.parseInt((br.realine())); 
			 if (X % k == 0)
	                count++;
		}
		System.out.println(count);
	}

	private String realine() {
		// TODO Auto-generated method stub
		return null;
	}

	
	}

	
	


