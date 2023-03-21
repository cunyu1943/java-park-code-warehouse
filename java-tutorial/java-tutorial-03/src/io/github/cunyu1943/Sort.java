package io.github.cunyu1943;

import java.util.Scanner;

/**
 * 排序
 *
 * @author : 村雨遥
 * @version : 1.0
 * @package : io.github.cunyu1943
 * @className : Sort.java
 * @createTime : 2023/3/21 20:24
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io/JavaPark
 */
public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("输入一个整数");
        int num1 = scanner.nextInt();
        System.out.println("输入一个整数");
        int num2 = scanner.nextInt();
        System.out.println("输入一个整数");
        int num3 = scanner.nextInt();

        int temp = 0;

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println(num1 + " < " + num2 + " < " + num3);
    }
}
