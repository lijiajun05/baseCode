package string;

import java.io.File;

public class RepalceQ {

	public static void main(String[] args) {

		String s = "sasd adopo asdosa aslks";
		String replace = s.replace("sa", File.separator);
		String replace2 = replace.replace('\\', '/');
		
		String replaceFirst = replace2.replaceFirst("/", "-");
		String replaceAll = replaceFirst.replaceAll("\\/|-", "~");//正则表达式需要用\转义，如：\/，此时需要’\\‘表示‘\’
		System.out.println(replaceAll);
	}

}
