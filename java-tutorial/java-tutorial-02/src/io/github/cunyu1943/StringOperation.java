package io.github.cunyu1943;

/**
 * String 与基本数据类型的运算
 *
 * @author : 村雨遥
 * @version : 1.0
 * @package : io.github.cunyu1943
 * @className : StringOperation.java
 * @createTime : 2023/3/19 19:56
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io/JavaPark
 */
public class StringOperation {
    public static void main(String[] args) {
        String str = "村雨遥";

        char ch = '远';
        // 得到的是字符串：村雨遥远
        System.out.println(str + ch);

        int num = 1943;
        // 得到的是字符串：村雨遥1943
        System.out.println(str + num);

        float pi = 3.1415F;
        // 得到的是字符串 村雨遥3.1415
        System.out.println(str + pi);

        boolean flag = true;
        // 得到的是字符串：村雨遥true
        System.out.println(str + flag);
    }
}
