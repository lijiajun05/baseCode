package string;

import java.io.UnsupportedEncodingException;

public class SplidQ {

	public static void main(String[] args) {

	//�ַ����Ĳ��
		String s = "  a#2#sd#ada";
		String s2 = "A#2#sd#ada";
		boolean regionMatches = s.regionMatches(true,s.indexOf('a'), s2, 0, s2.length());//trueλ���Դ�Сд�ıȽ�
		
		String[] split = s.split("#");
		System.out.println(split.length);
		for (String string : split) {
			System.out.println(string.trim());
		}
	
		String ss = "13";
		int as = Integer.parseInt(ss);
		ss="��";
		String valueOf = String.valueOf(8431);
		char[] charArray = ss.toCharArray();
		byte[] bytes=null;
		try {
			bytes = ss.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	String copyValueOf = String.copyValueOf(charArray);
	try {
		if (bytes==null) {
			return;
		}
		String string = new String(bytes, "UTF-8");
		System.out.println(string);
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	

}
