import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Formmatingdatedate {

	public static void main(String[] args) 
			throws ParseException
    {
        // Formatting as per given pattern in the argument
        SimpleDateFormat ft
            = new SimpleDateFormat("dd-MM-yyyy");
        String str = ft.format(new Date());
        System.out.println("Formatted Date : " + str);
 
        // parsing a given String
        str = "07/17/2023";
        ft = new SimpleDateFormat("MM/dd/yyyy");
        Date date = ft.parse(str);
 
        // this will print the date as per parsed string
        System.out.println("Parsed Date : " + date);
		// TODO Auto-generated method stub

	}

}
