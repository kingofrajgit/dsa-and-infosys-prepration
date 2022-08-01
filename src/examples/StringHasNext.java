package examples;

public class StringHasNext {

	public static void main(String[] args) {
		String m = "akjkjkj";
		System.out.println(m.codePointAt(0)==86);
		System.out.println(m.codePointBefore(1));
		System.out.println(m.compareTo("a")==0);
		System.out.println(m.hashCode());
	}

}