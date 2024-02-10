import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Demo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		  
        // use add() method to add elements in the list
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("10");
        list.add("20");
        list.add(2, "two");
  
        // Output the present list
        System.out.println("The list is:" + list);
  
        // Adding new elements at the beginning
        list.addFirst("First");
        list.addFirst("At");
  
        // Displaying the new list
        System.out.println("The new List is:" + list);
        
  
  List<String> strAL = Arrays.asList("abc_0702","abc_0701","abb_0605","xyz_0708","Lmn_0405");
  strAL.stream().sorted(Comparator.comparingInt(o -> Integer.parseInt(o.replaceAll("\\D", "")))).forEach(System.out::println);
        System.out.println(strAL);	
	}

}
