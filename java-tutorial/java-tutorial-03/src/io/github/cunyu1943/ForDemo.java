package io.github.cunyu1943;

/**
 * for 语句
 *
 * @author : 村雨遥
 * @version : 1.0
 * @package : io.github.cunyu1943
 * @className : ForDemo.java
 * @createTime : 2023/3/20 22:39
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io/JavaPark
 */
public class ForDemo {
    public static void main(String[] args) {
        int sum = 0;
        for (int num = 1; num <= 50; num++) {
            sum += num;
        }

        System.out.println("1 + 2 + …… + 50 = " + sum);
    }
}
