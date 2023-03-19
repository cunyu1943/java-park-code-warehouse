package io.github.cunyu1943;

/**
 * 逻辑运算符
 *
 * @author : 村雨遥
 * @version : 1.0
 * @package : io.github.cunyu1943
 * @className : LogicOperator.java
 * @createTime : 2023/3/19 21:30
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io/JavaPark
 */
public class LogicOperator {
    public static void main(String[] args) {

        boolean positive = true;
        boolean negative = false;

        System.out.println("positive && negative = " + (positive && negative));
        System.out.println("positive || negative = " + (positive || negative));
        System.out.println("!(positive || negative) = " + !(positive || negative));
    }
}
