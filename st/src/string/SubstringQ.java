package string;

public class SubstringQ {
	public static void main(String[] args) {
		//asd
		String s="abcdef is good";
		int length = s.length();
		char c = s.charAt(1);
		int index1 = s.indexOf('a');//�еķ���>=0
		int index2 = s.indexOf('s');//û�еķ���-1
		int index3 = s.indexOf("is");
		int indexOf = s.indexOf("is", 3);
		int indexOf2 = s.indexOf(98, 0);
		
		int lastIndexOf = s.lastIndexOf('o');
		int lastIndexOf2 = s.lastIndexOf('d');
		
		
		String substring1 = s.substring(2,4);
		boolean contains = s.contains(substring1);
		boolean contain2 = s.contains("ac");
	}
}
