package io.github.cunyu1943;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : 村雨遥
 * @version : 1.0
 * @package : io.github.cunyu1943
 * @className : HelloServlet.java
 * @createTime : 2023/3/29 22:41
 * @email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @website : https://cunyu1943.github.io/JavaPark
 */
public class HeroServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, IOException {
        response.getWriter().write("欢迎来到，王者荣耀！");
    }
}
