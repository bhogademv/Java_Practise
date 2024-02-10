
public class RemDupliChar4_String {

	public static void main(String[] args) {
		String str="mallikarjunappa bhogade";
		StringBuilder sb = new StringBuilder();
		str.chars().distinct().forEach(c -> sb.append((char) c));
		System.out.println(sb);
	}

}
