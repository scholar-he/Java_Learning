/*
��Ŀ�����1-100֮���ż���͡�

˼·��
1.��Ȼ��Χ�Ѿ�ȷ������1��100֮�䣬��ô�Ҿʹ�1��2��3...һֱ��100��ô������һ��һ�����м�顣
2.�ܹ���100�����֣��������е����ֶ����á�����Ҫ��ż�������ã��ж�(if���)ż����num % 2 == 0
3.��Ҫһ�����������������ۼӲ�����Ҳ�ͺñ�һ����Ǯ��
*/


public class Demo12HundredSum {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("����ǣ�" + sum);
		
		int sum1, i;
		sum1 = 0;
		i = 1;
		while (i <= 100) {
			if (i % 2 == 0) {
				sum1 += i;
			}
			i++;
		}
		System.out.println("����ǣ�" + sum1);
		
		int sum2, i2;
		sum2 = 0;
		i2 = 1;
		do {
			if (i2 % 2 == 0) {
				sum2 += i2;
			}
			i2++;
		} while (i2 <= 100);
		System.out.println("����ǣ�" + sum2);
	}
}