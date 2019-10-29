/*
四则运算当中的加号“+”有常见的三种用法：

1.对于数值来，那就是加法。
2.对于字符char来，在计算之前。char会被提升成int，然后在计算。
char类型字符，和int类型数字，之间的对照关系表：ASCII、Unicode
3.对于字符串String（首字母大写，并不是关键字）来说，加号代表字符串连。
任何数据类型和字符串进行连的时候，结果都会变成字符串
*/

public class Demo05Plus {
	public static void main(String[] args) {
		// 字符串类型的变量基本使用
		// 数据类型 变量名 = 数据值;
		String str1 = "Hello";
		System.out.println(str1); // Hello
		
		System.out.println("Hello" + "world"); // Hello world
		
		String str2 = "Java";
		// String + int --> String
		System.out.println(str2 + 20); // Java20
		
		// 优先级问题
		System.out.println(str2 + 20 + 30); // Java2030
		
		System.out.println(str2 + (20 + 30)); // Java50
	}
}