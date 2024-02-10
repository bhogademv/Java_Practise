import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class HashMap_Demo {

	public static void main(String[] args) {
		List<String> al=Arrays.asList("hello","world","hello","www","hello");
		HashMap<String,Integer> hm=new HashMap<>();
		for(String s: al){
		if(hm.get(s)==null) 	hm.put(s,1);
		else             		hm.put(s,hm.get(s)+1);
		}
		
		for(Entry<String, Integer> entry :hm.entrySet())
			System.out.println(entry.getKey()+" : "+entry.getValue());
	}

}
