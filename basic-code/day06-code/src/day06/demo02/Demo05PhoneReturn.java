package day06.demo02;

public class Demo05PhoneReturn {

    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "pongguo";
        one.price = 8388.0;
        one.color = "玫瑰金";
        return one;
    }

}
