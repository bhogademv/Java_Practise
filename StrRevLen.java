public class StrRevLen
{
	// input:  I am Not String
	// output: g ni rtS toNmaI
	public static void main (String[] args)
	{
		String str = "I am Not String";
		int i,j,l=0,len=str.length();
		char[] ch = new char[len];
		
		for(i=0;i<len;i++)
		if(str.charAt(i)== ' ')
		   ch[i]=' ';
		   
		   j=len-1;
		for(i=len-1;i>=0;i--)
		{
			if(ch[l]==' ')
			    l++;
			    
			if(str.charAt(j)==' ')
			    j--;
			
			ch[l]=str.charAt(j);
			j--;  l++;
		}
		
		System.out.println("String: "+str);
		
		System.out.println("Reverse: ");
		for(i=0;i<len;i++)
		System.out.print(ch[i]);
		
		System.out.println("------- ");
	}
}