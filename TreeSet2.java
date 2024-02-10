import java.util.*;
public class TreeSet2{
    
    public static void main(String[] args) {
        TreeSet t=new TreeSet();
        t.add(10);
        t.add(-32);
       t.add(13);
       t.add(27);
        t.add(32);
        
        
        System.out.println(t.tailSet(15));
        
        System.out.println(t.first());
        System.out.println(t.subSet(13,25));
        System.out.println("Hello, World!");
    }
    
}
