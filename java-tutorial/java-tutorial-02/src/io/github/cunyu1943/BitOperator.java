package io.github.cunyu1943;

/**
 * 位运算符
 *
 * @author : 村雨遥
 * @version : 1.0
 * @package : io.github.cunyu1943
 * @className : BitOperator.java
 * @createTime : 2023/3/19 21:25
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io/JavaPark
 */
public class BitOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println("num1 & num2 = " + (num1 & num2));
        System.out.println("num1 | num2 = " + (num1 | num2));
        System.out.println("num1 ^ num2 = " + (num1 ^ num2));
        System.out.println("~ num2 = " + (~num2));
        System.out.println("num1 << 2 = " + (num1 << 2));
        System.out.println("num1 >> 2 = " + (num1 >> 2));
        System.out.println("num1 >>> 2 = " + (num1 >>> 2));
    }
}
