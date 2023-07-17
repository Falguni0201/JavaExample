
public class Localvariable {

	
	static int x = 11;
    private int y = 33;
    public void method1(int x)
    {
    	Localvariable l = new Localvariable();
        this.x = 22;
        y = 44;
 
        System.out.println("Test.x: " + Localvariable.x);
        System.out.println("t.x: " + l.x);
        System.out.println("t.y: " + l.y);
        System.out.println("y: " + y);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Localvariable l = new Localvariable();
        l.method1(5);
	}

}
