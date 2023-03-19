package io.github.cunyu1943;

/**
 * 圆锥体的体积
 *
 * @author : 村雨遥
 * @version : 1.0
 * @package : io.github.cunyu1943
 * @className : ConeVolume.java
 * @createTime : 2023/3/18 22:52
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io/JavaPark
 */
public class ConeVolume {
    public static void main(String[] args) {
        double pi = 3.1415923D;

        int radius = 10;
        int height = 5;

        // 圆锥体体积 = PI * 底面积 * 高，而底面积 = 圆的面积
        double volume = pi * radius * radius * height;

        System.out.println("圆锥体的体积为：" + volume);
    }
}




