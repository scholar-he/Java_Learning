/*
�������㵱�еļӺš�+���г����������÷���

1.������ֵ�����Ǿ��Ǽӷ���
2.�����ַ�char�����ڼ���֮ǰ��char�ᱻ������int��Ȼ���ڼ��㡣
char�����ַ�����int�������֣�֮��Ķ��չ�ϵ����ASCII��Unicode
3.�����ַ���String������ĸ��д�������ǹؼ��֣���˵���ӺŴ����ַ�������
�κ��������ͺ��ַ�����������ʱ�򣬽���������ַ���
*/

public class Demo05Plus {
	public static void main(String[] args) {
		// �ַ������͵ı�������ʹ��
		// �������� ������ = ����ֵ;
		String str1 = "Hello";
		System.out.println(str1); // Hello
		
		System.out.println("Hello" + "world"); // Hello world
		
		String str2 = "Java";
		// String + int --> String
		System.out.println(str2 + 20); // Java20
		
		// ���ȼ�����
		System.out.println(str2 + 20 + 30); // Java2030
		
		System.out.println(str2 + (20 + 30)); // Java50
	}
}