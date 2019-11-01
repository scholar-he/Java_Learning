/*
题目：求出1-100之间的偶数和。

思路：
1.既然范围已经确定了是1到100之间，那么我就从1、2、3...一直到100这么多数字一个一个进行检查。
2.总共有100个数字，并非所有的数字都能用。必须要是偶数才能用，判断(if语句)偶数：num % 2 == 0
3.需要一个变量，用来进行累加操作。也就好比一个存钱罐
*/


public class Demo12HundredSum {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("结果是：" + sum);
		
		int sum1, i;
		sum1 = 0;
		i = 1;
		while (i <= 100) {
			if (i % 2 == 0) {
				sum1 += i;
			}
			i++;
		}
		System.out.println("结果是：" + sum1);
		
		int sum2, i2;
		sum2 = 0;
		i2 = 1;
		do {
			if (i2 % 2 == 0) {
				sum2 += i2;
			}
			i2++;
		} while (i2 <= 100);
		System.out.println("结果是：" + sum2);
	}
}