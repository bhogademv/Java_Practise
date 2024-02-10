
public class OctHex_num {
    int vv;
    
    void dis()
    {
        System.out.println(vv);
    }
    public static void main(String[] args) {
        int a = 101;
        int b = 0100;
        int c = 0xFace;
        int d = 0b1111;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d); 
        int h=53;
        float ft=5.64f;
       
     System.out.println ((char)h);
   System.out.println (ft);
        OctHex_num obj=new OctHex_num();
        System.out.println (obj.vv);
        obj.dis();
    }
    
}
