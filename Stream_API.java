import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream_API {

	public static void main(String[] args) {
	    List < String > fruits = new ArrayList < String > ();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        List < String > sortedList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedList);

        List < String > sortedList1 = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(sortedList1);

        List < String > sortedList2 = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList2);
        
        // descending order
        List < String > sortedList3 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList3);

        List < String > sortedList4 = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(sortedList4);
        
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] reversed = IntStream.range(0, a.length).map(i -> a[a.length - 1 - i]).toArray();
        System.out.println("reversed: ");
        for(int i: reversed)
        	System.out.print(i);
        
        
        
        
	}

}
