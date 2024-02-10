public class pattern
{
 public static void main(String[] args)
  {
   int i,j,s=9,no=1,w=1;
   for(i=1;i<6;i++,s--,w=w+2)
   {
	for(j=1;j<s;j++) 
	System.out.print("  "); /// s is used to print space at left side
	   
	for(j=1;j<=w;j++)           /// w is used for width of row   nos to be printed
	{
	if(j==1 || j==w || i==5)	System.out.print(no+++" ");
	else						System.out.print("* ");
			
	if(no>9)no=1;
	}
		 System.out.println();
	}   
  }
}
    