package io.github.cunyu1943;

/**
 * continue 测试
 *
 * @author : 村雨遥
 * @version : 1.0
 * @package : io.github.cunyu1943
 * @className : ContinueDemo.java
 * @createTime : 2023/3/21 21:36
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io/JavaPark
 */
public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
