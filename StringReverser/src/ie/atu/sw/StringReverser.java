package ie.atu.sw;

public class StringReverser {
	public String reverse(String s) {
		
		String t = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			t = t + s.charAt(i); //Don't do this inside a loop, inefficient
		}
		
		return t;
	}
	
	public static void main(String[] args) {
		StringReverser sr = new StringReverser();
		String s = sr.reverse("The Quick Brown Fox");
		System.out.println(s);
	}
}
