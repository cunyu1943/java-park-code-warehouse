package io.github.cunyu1943;

/**
 * while 语句测试
 *
 * @author : 村雨遥
 * @version : 1.0
 * @package : io.github.cunyu1943
 * @className : WhileDemo.java
 * @createTime : 2023/3/20 22:28
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io/JavaPark
 */
public class WhileDemo {
    public static void main(String[] args) {
        int sum = 0;
        int num = 1;
        while (num <= 50) {
            sum += num;
            num++;
        }
        System.out.println("1 + 2 + 3 + …… + 50 = " + sum);
    }
}
