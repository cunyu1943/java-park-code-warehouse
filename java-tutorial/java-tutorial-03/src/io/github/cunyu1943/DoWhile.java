package io.github.cunyu1943;

/**
 * do…while 语句
 *
 * @author : 村雨遥
 * @version : 1.0
 * @package : io.github.cunyu1943
 * @className : DoWhile.java
 * @createTime : 2023/3/20 22:30
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io/JavaPark
 */
public class DoWhile {
    public static void main(String[] args) {
        int sum = 0;
        int num = 1;
        do {
            sum += num;
            num++;
        } while (num <= 50);
        System.out.println("1 + 2 + 3 + …… + 50 = " + sum);
    }
}
