import java.util.HashSet;
import java.util.Set;

public class HashSet_Demo {

	public static void main(String[] args) {
		Set<String> hsd = new HashSet<String>() ;
		hsd.add("DS");
		hsd.add("ALGORITHMS");
		hsd.add("BLOCKCHAIN");
		hsd.add("MACHINE LEARNING");
        
        System.out.println(hsd.add("test"));  /// returns true for element added
        System.out.println(hsd.add("ALGORITHMS"));  /// returns false as already element present
        
        for (String s : hsd) 
			System.out.println(s);
		

	}

}
