

public class Demo07Switch {
	public static void main(String[] args) {
		int num = 1;
		switch (num) {
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期一");
				break;
			case 3:
				System.out.println("星期一");
				break;
			case 4:
				System.out.println("星期一");
				break;
			case 5:
				System.out.println("星期一");
				break;
			case 6:
				System.out.println("星期一");
				break;
			case 7:
				System.out.println("星期一");
				break;
			default:
				System.out.println("数据不合理");
				break; // 最后一个break语句可以省略，但是强烈推荐不要省略
		}
	}
}