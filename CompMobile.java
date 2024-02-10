
public class CompMobile {
    
    int add()
{
        int a=5;
        
        try{
            a=a/2;
            System.out.println("try");
            return 0;
        }
        finally{
            
            System.out.println("finally");
        }
    }    
    
    public static void main(String[] args) {
       int b;
        CompMobile c =new CompMobile();
        b= c.add();
        b=b+2;
    }
    
}
