package string;

import java.math.BigDecimal;

public class NewQ {

	public static void main(String[] args) {
		//公共无参构造
		String s= new String();
		//带参
		String s1= new String("abc");
		byte[] ai={65,97,66};
		char[] ac={'a','b','c'};
		String s2= new String(ai);
		String s3= new String(ac);//相当于String str4 = new String("abc");不是同一个
		String s4 =new String(ac, 1, 2);
		
		String ss ="0.1230";
		double d =Double.valueOf(ss);
		System.out.println(d);
		
		BigDecimal bigDecimal = new BigDecimal(ss);
		System.out.println(bigDecimal.stripTrailingZeros());
	}

}
