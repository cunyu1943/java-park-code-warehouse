package io.github.cunyu1943;

/**
 * switch 语句
 *
 * @author : 村雨遥
 * @version : 1.0
 * @package : io.github.cunyu1943
 * @className : SwitchCase.java
 * @createTime : 2023/3/20 22:02
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io/JavaPark
 */
public class SwitchCase {
    public static void main(String[] args) {
        int score = 84;
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
            case 6:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
                break;
        }
    }
}
