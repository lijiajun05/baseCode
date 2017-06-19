package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestQ {

	public static void main(String[] args) {
		Pattern compile = Pattern.compile(",|[/]+");
		String[] split = compile
				.split("Kevin has seen��LEON��seveal times,because it is a good film./ �����Ѿ����������ɱ�ֲ�̫�䡷�����ˣ���Ϊ����һ��"
						+ "�õ�Ӱ��/����:���ġ�");
		for (String string : split) {
			System.out.println(string);
		}
		Pattern p2 = Pattern.compile("Kelvin");
		Matcher matcher = p2
				.matcher("im Kelvin Li and Kelvin Chan are both working in Kelvin Chen's KelvinSoftShop company");
		StringBuffer sb = new StringBuffer();
		//����ҵ����򷵻�true��
		boolean find = matcher.find();
		while (find) {
			//�ҵ�ƥ���ֵ�����غ���֮ǰ�����ݣ��������滻
			matcher.appendReplacement(sb, "Kevin");
			System.out.println(sb.toString());
			find=matcher.find();
		}
		//ƴ��ƥ��ĺ��������
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
