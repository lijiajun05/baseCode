package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestQ {

	public static void main(String[] args) {
		Pattern compile = Pattern.compile(",|[/]+");
		String[] split = compile
				.split("Kevin has seen《LEON》seveal times,because it is a good film./ 凯文已经看过《这个杀手不太冷》几次了，因为它是一部"
						+ "好电影。/名词:凯文。");
		for (String string : split) {
			System.out.println(string);
		}
		Pattern p2 = Pattern.compile("Kelvin");
		Matcher matcher = p2
				.matcher("im Kelvin Li and Kelvin Chan are both working in Kelvin Chen's KelvinSoftShop company");
		StringBuffer sb = new StringBuffer();
		//如果找到，则返回true；
		boolean find = matcher.find();
		while (find) {
			//找到匹配的值，返回后期之前的内容，并进行替换
			matcher.appendReplacement(sb, "Kevin");
			System.out.println(sb.toString());
			find=matcher.find();
		}
		//拼接匹配的后面的内容
		matcher.appendTail(sb);
		System.out.println(sb.toString());
		System.out.println("-------------------------");
		test("java Email www.kevin@163.net ");
	}
	
	
	static void test(String s){
		Pattern p = Pattern.compile("^.|^@");
		Matcher m = p.matcher(s);
		if (m.find()) {
			p = Pattern.compile("^www.");
			m=p.matcher(s);
		}
		if (m.find()) {
			p = Pattern.compile("[^A-Za-z0-9.@_-~#]+");
			m=p.matcher(s);
		}
		StringBuffer sb =new StringBuffer();
		boolean find = m.find();
		while(find){
			m.appendReplacement(sb, "");
			find = m.find();
		}
		m.appendTail(sb);
		System.out.println(sb.toString());
	}

}
