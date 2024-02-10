
public class SCP {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		String str3 = new String("HelloWorld");
		String str4 = str1 + str2;
		String str5="HelloWorld"; 
		String str6="HelloWorld";
		String str7="Hello";
		String str8=new String("Hello");		 
		 System.out.println(str3==str4); //false
		 System.out.println(str4==str5);//false
		 System.out.println(str5==str6);//true
		 System.out.println(str1==str7);//true
		 System.out.println(str1==str8);//false
		 System.out.println(str7==str8);//false
	}

}
