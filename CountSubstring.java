
public class CountSubstring {

	public static void main(String[] args) {
		String mainString="awshellotestawshelloaws";
		String substring="aws";
		int count = 0,j=0;
        int lastIndex = 0;
//
//        while (lastIndex != -1) {
//            lastIndex = mainString.indexOf(substring, lastIndex);
//            if (lastIndex != -1) {
//                count++;
//                lastIndex += substring.length();
//            }
//        }
//        System.out.println("Occurence:"+count);
        count = 0;
        for(int i=0;i<=(mainString.length()-substring.length());i++) {
        	if(mainString.charAt(i)==substring.charAt(0)){
        		for(j=0;j<substring.length()&&(mainString.charAt(i+j)==substring.charAt(j));j++);
        		if(j==3) { count++; i=i+j; }
        	}
        }
		System.out.println("Occurence="+count);
	}
}
