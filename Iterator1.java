package TS;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

  public static void main(String[] args) {

ArrayList al= new ArrayList();
al.add(10);
al.add(20);
al.add(30);
al.add(40);
al.add(50);
al.add(60);

Iterator itr= al.iterator();
itr.next();
 while(itr.hasNext())
 {
   
  System.out.println(itr.next());
//itr.remove();
          
  // al.remove( itr.next());
 
 }
  System.out.println("ok"+al);
 
  }

}


