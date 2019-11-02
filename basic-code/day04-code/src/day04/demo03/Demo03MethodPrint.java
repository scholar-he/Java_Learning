package day04.demo03;

/*
题目要求：
定义一个方法：用来打印指定次数的HelloWorld。
*/
public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(5);
    }

    public static void printCount(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("Hello world" + (i + 1));
        }
    }
}
