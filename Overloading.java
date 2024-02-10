
public class Overloading {
    void add(int a, double b)
    {
        System.out.println("int  double");
    }
     void add(double a, int b)
    {
        System.out.println(" double int");
    }
    
    public static void main(String[] args) {
        
     Overloading o= new Overloading();
       o.add(4,4);
    }
    
}
