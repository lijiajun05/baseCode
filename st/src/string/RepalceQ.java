package string;

import java.io.File;

public class RepalceQ {

	public static void main(String[] args) {

		String s = "sasd adopo asdosa aslks";
		String replace = s.replace("sa", File.separator);
		String replace2 = replace.replace('\\', '/');
		
		String replaceFirst = replace2.replaceFirst("/", "-");
		String replaceAll = replaceFirst.replaceAll("\\/|-", "~");//������ʽ��Ҫ��\ת�壬�磺\/����ʱ��Ҫ��\\����ʾ��\��
		System.out.println(replaceAll);
	}

}
