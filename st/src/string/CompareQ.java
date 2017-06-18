package string;

public class CompareQ {

	public static void main(String[] args) {

		String s = "Aabc";
		String s2 = "ABC";
		int compareTo = s.compareTo(s2);
		int compareToIgnoreCase = s.compareToIgnoreCase(s2);
		boolean equals = s.equals(s2);
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s2);
		String upperCase = s.toUpperCase();
		String lowerCase = s2.toLowerCase();
		
	}

}
