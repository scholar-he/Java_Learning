/*
永远亭不下来的循环，叫死循环。

死循环的标准格式：
while (true) {
	循环体
}
*/

public class Demo16DeadLoop {
	public static void main(String[] args) {
		while (true) {
			System.out.println("I Love Java");
		}
		
		// System.out.println("I Love Java");  // 死循环后面写什么都白搭，会报错
	}
}