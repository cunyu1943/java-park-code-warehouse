package io.github.cunyu1943;

/**
 * 赋值运算符
 *
 * @author : 村雨遥
 * @version : 1.0
 * @package : io.github.cunyu1943
 * @className : AssignOperator.java
 * @createTime : 2023/3/19 21:33
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io/JavaPark
 */
public class AssignOperator {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 1000;

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 += num2 = " + (num1 += num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 -= num2 = " + (num1 -= num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 *= num2 = " + (num1 *= num2));
        System.out.println("num1 & num2 = " + (num1 & num2));
        System.out.println("num1 &= num2 = " + (num1 &= num2));
    }
}
