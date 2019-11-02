package day04.demo04;

/*
对于功能类似的方法来说，因为参数列表不一样，却需要记住那么多不同的方法名称，太麻烦。

方法的重载(Overload): 多个方法的名称一样，但是参数列表不一样。
好处：只需要记住唯一一个方法的名称就可以实现类似的多个功能。

方法重载与下列因素相关：
1.参数个数不同
2.参数类型不同

方法重载与下列因素无关：
1.与参数名称无关

*/

public class Demo01MethodOverload {
    public static void main(String[] args) {
        /*System.out.println(sumTwo(10, 20));
        System.out.println(sumThree(10, 20, 30));
        System.out.println(sumFour(10, 20, 30, 40));*/

        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
//        System.out.println(sum(10, 20, 30, 40, 50)); // 找不到任何方法来匹配，所以错误！
    }

    public static int sum(int a, double b) {
        return (int) (a+ b);
    }

    public static int sum(double a, int b) {
        return (int) (a+ b);
    }

    public static int sum(int a, int b) {
        System.out.println("有2个参数的方法执行！");
        return a+ b;
    }

    // 错误写法！与参数名称无关
    /*public static int sum(int x, int y) {
        return a+ b;
    }*/

    // 错误写法！与方法的返回值类型无关
    /*public static double sum(int a, int b) {
        System.out.println("有2个参数的方法执行！");
        return a + b;
    }*/

    public static int sum(double a, double b) {
        return (int) (a + b);
    }

    public static int sum(int a, int b, int c) {
        System.out.println("有3个参数的方法执行！");
        return a+ b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        System.out.println("有4个参数的方法执行！");
        return a+ b + d + d;
    }
}
