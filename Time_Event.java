public class Time_Event {  
    public static void main(String[] args) {  
    	//String[] Str= {"09:10AM-09:50AM","10:00AM-12:30PM","02:00PM-02:45PM"};
    	String[] Str= {"07:17AM-08:52AM","09:10AM-09:50AM","12:20AM-12:30PM","03:42PM-04:15PM","04:32PM-09:43PM"}; 
    	int [][] TArr=new int[Str.length][4]; // We can sort time in TArr[][] after it is converted to number
    	int [] diff=new int[Str.length];
    	int i,high=0;
    	for(i=0;i<Str.length;i++)
    	{
    		TArr[i][0]=((Character.getNumericValue(Str[i].charAt(0))*10)+(Character.getNumericValue(Str[i].charAt(1))));
    		if(Str[i].charAt(5) == 'P' && TArr[i][0]<12)
    		TArr[i][0]=TArr[i][0]+12;
    		
    		TArr[i][1]=((Character.getNumericValue(Str[i].charAt(3))*10)+(Character.getNumericValue(Str[i].charAt(4))));
    		
    		TArr[i][2]=((Character.getNumericValue(Str[i].charAt(8))*10)+(Character.getNumericValue(Str[i].charAt(9))));
    		if(Str[i].charAt(13) == 'P' && TArr[i][2]<12)
    		TArr[i][2]=TArr[i][2]+12;
    		
    		TArr[i][3]=((Character.getNumericValue(Str[i].charAt(11))*10)+(Character.getNumericValue(Str[i].charAt(12))));
    	}
    	
    	for(i=0;i<Str.length-1;i++)
    	{
    	diff[i]=(((TArr[i+1][0])*60)+(TArr[i+1][1]))-(((TArr[i][2])*60)+(TArr[i][3]));
    	if(diff[i]>high)     		high=diff[i];
    	System.out.print("("+(i+1)+") "+TArr[i][0]+":"+TArr[i][1]+" to "+TArr[i][2]+":"+TArr[i][3]);	
    	System.out.println("\t Free Time Difference between ("+(i+1)+") & ("+(i+2)+") -> "+(diff[i]/60)+":"+(diff[i]%60));
    	}
    	i=Str.length-1;
    	System.out.print("("+(i+1)+") "+TArr[i][0]+":"+TArr[i][1]+" to "+TArr[i][2]+":"+TArr[i][3]);	
    	
    	System.out.println("\n Largest Free Time is "+high/60+" hr:"+high%60+" min");
    }
}	
 /// bhogademv@gmail.com