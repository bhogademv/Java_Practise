package PKJArgum;

public class Argum {
    
    public static void printvalue(int i,int j,int k)
    {
        System.out.println("int");
    }
    
    public static void printvalue(byte... b)
    {
        System.out.println("long");
    }
    
    
    public static void main(String[] args) {
        byte b=9;
        printvalue(b,b,b);
    }
    
}
