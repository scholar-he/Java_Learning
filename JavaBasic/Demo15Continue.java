/*
��һ��ѭ�����������continue�ؼ��֡�
һ��ִ�У���������ǰ��ѭ��ʣ�����ݣ����Ͽ�ʼ��һ��ѭ����
*/
public class Demo15Continue {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 4) {  // �����ǰ�ǵ�4��
 				continue;  // ��ô��������ǰѭ�������Ͽ�ʼ��һ��(�����)
			}
			System.out.println(i + "�㵽��");
		}
	}
}