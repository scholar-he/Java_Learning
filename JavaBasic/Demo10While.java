/*
while ѭ����һ����׼��ʽ������һ����

��׼��ʽ��
while (�����ж�) {
	ѭ����
}

��չ��ʽ��

��ʼ�����;
while (�����ж�) {
	ѭ����;
	�������;
}
*/

public class Demo10While {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("������ã�" + i);
		}
		System.out.println("===================");
		
		int i = 1;
		while (i <= 10) {
			System.out.println("������ã�" + i);
			i++;
		}
	}
}