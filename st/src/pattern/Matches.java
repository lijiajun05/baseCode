package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matches {
	public static void main(String[] args) {

		/*
		 * ���õĵ���
		 * a����0����Σ�b
		 */

		Pattern p1 = Pattern.compile("a*b");

		String str1 = "aaaab";
		Matcher m1 = p1.matcher(str1);
		boolean b1 = m1.matches();
		System.out.println(b1);

		String str2 = "b";
		Matcher m2 = p1.matcher(str2);
		boolean b2 = m2.matches();
		System.out.println(b2);

		/*
		 * ��һ�ֵ��� ��Ч���������䣬���ܶ����ظ���ƥ�������Ч�ʲ��ߣ���Ϊ�������������ѱ����ģʽ��
		 * �����ɹ���������̰߳�ȫʹ��,������ĵ�����Ͳ��ǰ�ȫ��.
		 */
		boolean b3 = Pattern.matches("a*b", "aaab");
		System.out.println(b3);

		// Pattern���pattern����:��pattern���ʵ���з���ƥ��ģʽ���ַ�����ʾ
		String pattern1 = p1.pattern();
		System.out.println(pattern1);

		// Pattern���split����
		String[] arr1 = p1.split("rrrrraaabccccaaaaab");
		for (String string : arr1) {
			System.out.println(string + ">>>>");
		}

		/*
		 * Matcher��
		 * 
		 * matches����: �������Խ����������������ģʽƥ�� lookingAt����: ���Խ��������д�ͷ��ʼ���ģʽƥ��,�� matches
		 * �������ƣ� �˷���ʼ�մ�����Ŀ�ͷ��ʼ����֮��ͬ���ǣ�������Ҫƥ���������� find����:
		 * ����ɨ�����������Բ������ģʽƥ�����һ��������
		 */
		String str3 = "aabbcccaaaaaeeeaaaaaaaaagggga";
		Pattern p3 = Pattern.compile("a+");
		Matcher m3 = p3.matcher(str3);

		boolean bo4 = m3.matches();
		System.out.println("matches����:  " + bo4);

		/*
		 * lookingAt����,�ӿ�ͷ��һ���ַ�����ƥ��,ƥ��ɹ��˲��ټ���ƥ��, �ӵ�һ���ַ���ʼ,ƥ��ʧ����,Ҳ������ƥ��.����Ҫƥ����������
		 */
		boolean bo5 = m3.lookingAt();
		if (bo5) {
			// group����(��������)���صľ���ƥ������ַ���.
			System.out.println("lookingAt����:  " + m3.group());
		}

		// find����:�ҵ�һ��ƥ����Ӵ�,�����������һ���Ӵ�.
		while (m3.find()) {
			System.out.println("find����:  " + m3.group());
		}

		/*
		 * ��������group�����벻��������group��������
		 * ����������group����:find������lookingAt����ƥ�������������(��������ʾ) ��������group����:
		 * ��������ǰƥ������ڼ��ɸ����鲶������������С�
		 */
		String str6 = "aaabbbccc";
		Pattern p5 = Pattern.compile("(a+)(b+)(c+)");
		Matcher m5 = p5.matcher(str6);
		boolean boo = m5.matches();
		if (boo) {
			int k = m5.groupCount() + 1;// ��1���ǰ�0�±�������ַ����м���,��Ҳ��Ϊһ�����0�±��λ��.
			if (k > 0) {
				for (int i = 0; i < k; i++) {
					System.out.println(m5.group(i));
				}
			}
		}
	}
}
