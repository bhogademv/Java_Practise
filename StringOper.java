
public class StringOper {

  public static void main(String[] args) {
    String str=new String("this is a string");
    System.out.println(str.indexOf('r'));
 System.out.println(str.contains("r"));
    System.out.println(str.concat("@#$%"));
  System.out.println(str.hashCode());
    System.out.println(str);
    int no=30;
    
    if(no==30 && no/0 == 3)
    System.out.println(333);
    else
      System.out.println(444);
  }

}
