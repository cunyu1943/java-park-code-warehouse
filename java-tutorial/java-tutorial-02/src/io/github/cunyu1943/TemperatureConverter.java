package io.github.cunyu1943;

/**
 * 温度转换器
 *
 * @author : 村雨遥
 * @version : 1.0
 * @package : io.github.cunyu1943
 * @className : TemperatureConverter.java
 * @createTime : 2023/3/19 16:03
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io/JavaPark
 */
public class TemperatureConverter {
    public static void main(String[] args) {
        double F = 100D;
        double C = (F - 32) / 1.8;

        System.out.println("华氏度：" + F);
        System.out.println("摄氏度：" + C);
    }
}
