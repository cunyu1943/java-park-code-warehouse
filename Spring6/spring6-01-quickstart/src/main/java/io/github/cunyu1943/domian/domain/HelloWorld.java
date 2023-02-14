package io.github.cunyu1943.domian.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package : io.github.cunyu1943
 * @ClassName : HelloWorld.java
 * @CreateTime : 2023/2/3 22:55
 * @Version : 1.0
 * @Author : 村雨遥
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io/JavaPark
 * @Description : Hello World 入门案例
 */
public class HelloWorld {
    private Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public void meeting() {
        logger.info("Hello Wrorld, Spring.");
    }
}
