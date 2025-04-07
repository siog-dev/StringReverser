package ie.atu.sw;

public class StringReverser {
	public String reverse(String s) {
		
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		StringReverser sr = new StringReverser();
		String s = sr.reverse("The Quick Brown Fox");
		System.out.println(s);
	}
}
