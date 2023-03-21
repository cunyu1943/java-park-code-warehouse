package io.github.cunyu1943;

import java.util.Scanner;

/**
 * 奇偶性判断
 *
 * @author : 村雨遥
 * @version : 1.0
 * @package : io.github.cunyu1943
 * @className : Odevity.java
 * @createTime : 2023/3/21 20:02
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io/JavaPark
 */
public class Odevity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入一个整数");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " 是一个偶数。");
        }
        System.out.println(num + " 是一个奇数。");
        input.close();
    }
}
