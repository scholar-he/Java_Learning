/*
����һ�������ĸ�ʽ��

public static void ��������() {
	������
} 

�������Ƶ���������ͱ�����ʹ��С�շ塣
�����壺Ҳ���Ǵ������п��԰������������.

ע�����
1.����������Ⱥ�˳������ν��
2.�����Ķ��岻�ܲ���Ƕ�װ�����ϵ��

��ε��÷�������ʽ��
��������();
*/

public class Demo11Method {
	public static void main(String[] args) {
		farmar(); // ����ũ��ķ���
		seller(); // ����С�̷��ķ���
		cook(); // ���ó��ӵķ���
		me(); // �������Լ��ķ���
		
		
	}
	
	// ��
	public static void me() {
		System.out.println("��");
	}
	
	// ����
	public static void cook() {
		System.out.println("ϴ��");
		System.out.println("�в�");
		System.out.println("����");
		System.out.println("װ��");
	}
	
	
	// С�̷�
	public static void seller() {
		System.out.println("���䵽ũó�г�");
		System.out.println("̧�߼۸�");
		System.out.println("ߺ��");
		System.out.println("��������");
	}
	
	// ũ��
	public static void farmar() {
		System.out.println("����");
		System.out.println("��ˮ");
		System.out.println("ʩ��");
		System.out.println("����");
		System.out.println("�ո�");
		System.out.println("����С�̷�");
	}
}