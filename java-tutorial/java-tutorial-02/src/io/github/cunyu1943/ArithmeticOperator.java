package io.github.cunyu1943;

/**
 * 算数运算符
 *
 * @author : 村雨遥
 * @version : 1.0
 * @package : io.github.cunyu1943
 * @className : ArithmeticOperator.java
 * @createTime : 2023/3/19 21:18
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io/JavaPark
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num2 / num1 = " + (num2 / num1));
        System.out.println("num2 % num1 = " + (num2 % num1));
        System.out.println("num3 % num1 = " + (num3 % num1));
        System.out.println("num1++   = " + (num1++));
        System.out.println("num1--   = " + (num1--));
// 查看 ++ 在操作数前后位置时结果的不同
        System.out.println("num4++   = " + (num4++));
        System.out.println("++num4   = " + (++num4));
    }
}
