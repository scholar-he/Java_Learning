/*
do-whileѭ���ı�׼��ʽ��

do {
	ѭ����
} while (�������);


��չ��ʽ��

do {
	ѭ����;
	�������;
} while (�������);
*/

public class Demo11DoWhile {
	public static void main(String[] args) {
		for (int i =1; i < 10; i++) {
			System.out.println("����������" + i);
		}
		System.out.println("==============");
		
		int i = 1;
		do {
			System.out.println("����������" + i);
			i++;
		} while (i <= 10);
	}
}