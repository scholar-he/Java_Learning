/*
do-while循环的标准格式：

do {
	循环体
} while (条件语句);


扩展格式：

do {
	循环体;
	步进语句;
} while (条件语句);
*/

public class Demo11DoWhile {
	public static void main(String[] args) {
		for (int i =1; i < 10; i++) {
			System.out.println("天气真美丽" + i);
		}
		System.out.println("==============");
		
		int i = 1;
		do {
			System.out.println("天气真美丽" + i);
			i++;
		} while (i <= 10);
	}
}