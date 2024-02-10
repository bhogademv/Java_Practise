
public class HashMap_countChar {
    public static void characterCount(String inputString) { 
  HashMap<Character, Integer>  hm=new HashMap<Character,Integer>(); 
        char[] strArray = inputString.toCharArray(); 

        for (char c : strArray) { 

            if (hm.containsKey(c)) {
                hm.put(c, charCountMap.get(c) + 1);
            } 

            else { 
           hm.put(c, 1); } 

        }  

        for (Map.Entry entry : charCountMap.entrySet()) { 

            System.out.println(entry.getKey() + " " + entry.getValue()); 

        } 

    } 

  

    // Driver Code 

    public static void main(String[] args) 

    { 

        String str = "Mallikarjunappa Bhogade"; 

       HashMap_countChar.characterCount(str); 

    } 

}