package io.github.cunyu1943;

/**
 * 关系运算符
 *
 * @author : 村雨遥
 * @version : 1.0
 * @package : io.github.cunyu1943
 * @className : RelationOperator.java
 * @createTime : 2023/3/19 21:22
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io/JavaPark
 */
public class RelationOperator {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 220;

        System.out.println("num1 == num2 = " + (num1 == num2));
        System.out.println("num1 != num2 = " + (num1 != num2));
        System.out.println("num1 > num2 = " + (num1 > num2));
        System.out.println("num2 < num1 = " + (num2 < num1));
        System.out.println("num2 <= num1 = " + (num2 <= num1));
        System.out.println("num2 >= num1 = " + (num2 >= num1));
    }
}
