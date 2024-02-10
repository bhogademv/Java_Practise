
public class WrapperDemo {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		int num_1 = 10;
		  
        int num_2 = 10;
  
        Integer wrapnum_1 = new Integer(10);
  
        Integer wrapnum_2 = new Integer(10);
  
        System.out.println(num_1 == num_2);  // true
  
        // Compares reference
        System.out.println(wrapnum_1 == wrapnum_2); // false
  
        // Compares value of object
        System.out.println(wrapnum_1.equals(wrapnum_2)); // true

	}

}
