/*
������ ���������ڼ䣬���ݿ��Է����ı������

����һ����������ʹ�õĸ�ʽ

�������� ��������; // ������һ������

�������� = ����ֵ; // ��ֵ�����ұߵ�����ֵ����ֵ������ߵı���

һ����λ�ĸ�ʽ��

�������� �������� = ����ֵ; // �ڴ���һ��������ͬʱ��������ָ��������ֵ

*/
public class Demo02Variable {
	public static void main(String[] args) {
		// ����һ������
		// ��ʽ���������� ��������;
		int num1;
		// ��������д���һ������
		// ��ʽ���������� = ����ֵ;
		num1 = 10;
		// ����ӡ����������Ƶ�ʱ����ʾ�������Ǳ���������
		System.out.println(num1); // 10
		
		// �ı�������е����֣�����µ�����
		num1 = 20;
		System.out.println(num1);
		
		// ʹ��һ����λ�ĸ�ʽ���������
		// ��ʽ���������� �������� = ����ֵ;
		int num2 = 25;
		System.out.println(num2);
		
		num2 = 35;
		System.out.println(num2);
		System.out.println("===================");
		
		byte num3 = 30; // ע�⣺�Ҳ����ֵ�ķ�Χ���ܳ�������������͵�ȡֵ��Χ
		System.out.println(num3);
		
		// byte num4 = 400; // �Ҳ೬��byte���ݷ�Χ������
		
		short num5 = 50;
		System.out.println(num5);
		
		long num6 = 3000000000L;
		System.out.println(num6);
		
		float num7 = 2.5F;
		System.out.println(num7);
		
		double num8 = 1.2;
		System.out.println(num8);
		
		char zifu1 = 'A';
		System.out.println(zifu1);
		
		zifu1 = '��';
		System.out.println(zifu1);
		
		boolean var1 = true;
		System.out.println(var1);
		
		var1 = false;
		System.out.println(var1);
		
		// ��һ���������������ݣ���ֵ������һ������
		// �Ҳ�ı�������var1�Ѿ����ڣ�����װ����false����ֵ
		// ���Ҳ�ı��������falseֵ�����󽻸�var2�������д洢
		boolean var2 = var1;
		System.out.println(var2);
	}
}