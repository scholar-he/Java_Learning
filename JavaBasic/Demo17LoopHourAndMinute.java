public class Demo17LoopHourAndMinute {
	public static void main(String[] args) {  // 外层控制小时
		for (int hour = 0; hour < 24; hour++) {
			for (int minute = 0; minute < 60; minute++) {  // 内层控制小时之内的分钟
				System.out.println(hour + "点" + minute + "分");
			}	
		}
	}
}