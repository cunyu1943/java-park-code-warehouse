package io.github.cunyu1943;

/**
 * 单次判断
 *
 * @author : 村雨遥
 * @version : 1.0
 * @package : io.github.cunyu1943
 * @className : SingleIf.java
 * @createTime : 2023/3/20 21:44
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io/JavaPark
 */
public class SingleIf {
    public static void main(String[] args) {
        int age = 17;

        if (age > 18) {
            System.out.println("您已成年，最多可以玩 8 小时的王者荣耀。");
        }
        System.out.println("很抱歉，您当前未成年，最多可以玩 2 小时的王者荣耀。");
    }
}
