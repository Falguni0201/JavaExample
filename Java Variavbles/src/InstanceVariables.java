
public class InstanceVariables {
	// Declared Instance Variable
    public String geek;
    public int i;
    public Integer I;
    public InstanceVariables() {
        // Default Constructor
        // initializing Instance Variable
        this.geek = "Shubham Jain";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Object Creation
		InstanceVariables name = new InstanceVariables();
 
        // Displaying O/P
        System.out.println("Geek name is: " + name.geek);
        System.out.println("Default value for int is "
                           + name.i);
       
        // toString() called internally
        System.out.println("Default value for Integer is "
                           + name.I);
	}

}
