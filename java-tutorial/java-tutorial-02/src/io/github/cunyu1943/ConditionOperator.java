package io.github.cunyu1943;

/**
 * @author : 村雨遥
 * @version : 1.0
 * @package : io.github.cunyu1943
 * @className : ConditionOperator.java
 * @createTime : 2023/3/19 21:35
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io/JavaPark
 */
public class ConditionOperator {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 300;

        int result = num1 > num2 ? num1 : num2;
        System.out.println("The max between num1 and num2 is " + result);
    }
}
