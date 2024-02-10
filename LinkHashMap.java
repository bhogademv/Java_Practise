
import java.util.*;

public class LinkHashMap {
    public static void main(String[] args) {
       
        Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
 
        List<String> Gold = new ArrayList<String>();
        Gold.add("Yes");
        Gold.add("Gold");
        Gold.add("100");
        Gold.add("Zee");
        Gold.add("Sony");
        Gold.add("StarPlus");
        Gold.add("Discovery");
        Gold.add("NatGeo");
        
        List<String> Silver = new ArrayList<String>();
        Silver.add("No");
        Silver.add("Silver");
        Silver.add("50");
        Silver.add("Zee");
        Silver.add("Sony");
        Silver.add("StarPlus");
        
        map.put("Gold", Gold);
        map.put("Silver",Silver);
        
        // iterate and display values
        System.out.println("Fetching Keys and corresponding [Multiple] Values n");
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key = " + key);
            System.out.println("Values = " + values + "n");
        }
    }
}




