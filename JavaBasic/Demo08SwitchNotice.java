/*
switch���ʹ�õ�ע�����

1.���case�������ֵ�������ظ�
2.switch����С������ֻ���������������ͣ�
�����������ͣ�byte/short/char/int
�����������ͣ�String�ַ�����enumö��

3.switch����ʽ���Ժ���ǰ��˳����Եߵ�����break��仹����ʡ�ԡ�
��ƥ����һ��case�ʹ���һ��λ������ִ�У�ֱ��������break�����������Ϊֹ����
*/
public class Demo08SwitchNotice {
	public static void main(String[] args) {
		int num = 2;
		switch (num) {
			case 1:
				System.out.println("AAA");
				break;
			case 2:
				System.out.println("BBB");
				// break;
			case 3:
				System.out.println("DDD");
				break;
			default:
				System.out.println("CCC");
				break;
		}
	}
}