package string;

import java.math.BigDecimal;

public class NewQ {

	public static void main(String[] args) {
		//�����޲ι���
		String s= new String();
		//����
		String s1= new String("abc");
		byte[] ai={65,97,66};
		char[] ac={'a','b','c'};
		String s2= new String(ai);
		String s3= new String(ac);//�൱��String str4 = new String("abc");����ͬһ��
		String s4 =new String(ac, 1, 2);
		
		String ss ="0.1230";
		double d =Double.valueOf(ss);
		System.out.println(d);
		
		BigDecimal bigDecimal = new BigDecimal(ss);
		System.out.println(bigDecimal.stripTrailingZeros());
	}

}
