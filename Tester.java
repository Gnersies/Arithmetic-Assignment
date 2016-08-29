
public class Tester {

	public static void main(String[] args) {
		String a = ("79 + 3 * (4 + 82 – 68) – 7 + 19");
		int b = 79 + 3 * (4 + 82 - 68) - 7 + 19;
		
		String c = ("(179 + 21 + 10) / 7 + 181");
		int d = (179 + 21 + 10) / 7 + 181;
		
		String e =("10389 * 56 * 11 + 2246");
		int f = 10389 * 56 * 11 + 2246;
		
		System.out.println(a + " = " + b);
		System.out.println(c + " = " + d);
		System.out.println(e + " = " + f);
	}

}
