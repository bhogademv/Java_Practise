class A{
    private int i;
    public int j;
    protected int k;
}

class B extends A{
    void display(){
        super.k=super.j+1;
        System.out.println(super.k+" "+super.j);
        
    }
}

class C extends B{
    
    void display(){
        super.k=111;
        System.out.println("in class c   k="+super.k);
    }
}
public class Extends1 {
    
    public static void main(String[] args) {
       
        B obj=new B();
        obj.k=1;
        obj.j=2;
        obj.display();
        C o1=new C();
        o1.display();
        //System.out.println("Hello, World!");
    }
    
}
