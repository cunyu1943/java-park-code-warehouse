package io.github.cunyu1943.domian;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created with IntelliJ IDEA.
 *
 * @Package : io.github.cunyu1943
 * @ClassName : HelloWorld.java
 * @CreateTime : 2023/2/4 09:35
 * @Version : 1.0
 * @Author : 村雨遥
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io/JavaPark
 * @Description : Hello World 单元测试
 */

class HelloWorldTest {
    private final Logger logger = LoggerFactory.getLogger(HelloWorldTest.class);

    @Test
    void testHelloWorld1() {

        // 加载 Spring 配置文件，创建对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        // 获取创建的对象
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        logger.info("HelloWorld 对象创建成功！");
        logger.info("执行成功");

        // 用创建的对象调用方法进行测试
        helloWorld.meeting();
    }

    @Test
    void testHelloWorld2() throws Exception {
        // 获取类的 class 对象
        Class helloWorldClass = Class.forName("io.github.cunyu1943.domian.HelloWorld");

        // 调用方法创建对象
        HelloWorld helloWorld = (HelloWorld) helloWorldClass.getDeclaredConstructor().newInstance();
        logger.info("通过反射创建对象成功");
        helloWorld.meeting();
    }
}
