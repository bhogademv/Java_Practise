
public class IfCondi {
    static int func(int x)
    {
        System.out.println("fun "+x);
        if (x>30)  
            return(10) ;
        else
            {func (30) ;
            return 10;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int c= func(30);
        
    }
    
}
