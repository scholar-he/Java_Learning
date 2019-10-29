/*
使用变量的时候，有一些注意事项

1. 如果创建多个变量，那么变量的名称不可以重复
2. 对于float和long；类型来，字母后缀F和L不要丢掉
3. 如果使用byte或者short类型的变量，那么右侧的数值不能超过左侧类型的数值范围
4. 没有进行赋值的变量，不能直接使用，一定要赋值之后才能使用
5. 变量使用不能超过作用域的范围
【作用域】：从定义变量一行开始，一直到直接所属的大括结束为止
6. 可以通过一个语句来多个变量，但一般情况不推荐这么写
*/
public class Demo03VariableNotice{
	public static void main(String[] args){
		int num1 = 10; // 创建了一个新的变量，明教num1
		// int num1 = 20; // 又创建了一个新的变量，名字也叫num1.错误！
		int num2 = 20;
		
		int num3;
		num3 = 30;
		
		int num4;  // 定义了一个变量。但是没有进行赋值
		// System.out.println(num4);
		
		// System.out.println(num5) // 在创建变量，不能使用这个变量
		
		int num5 = 500;
		System.out.println(num5);
		{
			int num6 = 60;
			System.out.println(num6);
		}
		// int num6;
		// System.out.println(num6); // 已经超出了大括的范围，超出了作用域，变量不能在使用了
		
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// 同时创建三个int变量，并且同时各自赋值
		int x = 100, y = 200, z = 300;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}

