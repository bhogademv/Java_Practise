
public class Singelton_Demo {
	private static Singelton_Demo instance = null;
	private Singelton_Demo() {}

	public static Singelton_Demo getInstance() {
	if (instance == null) { 	instance = new Singelton_Demo(); 	}
	return instance;
	}
	
	public static void main(String args[]) {
		Singelton_Demo s1 = Singelton_Demo.getInstance();
		Singelton_Demo s2 = Singelton_Demo.getInstance();

		// s1 and s2 are the same instance
		System.out.println(s1 == s2);
	}
}
