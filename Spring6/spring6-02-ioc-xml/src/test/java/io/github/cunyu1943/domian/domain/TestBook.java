package io.github.cunyu1943.domian.domain;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package : io.github.cunyu1943.domain
 * @ClassName : TestBook.java
 * @CreateTime : 2023/2/6 20:24
 * @Version : 1.0
 * @Author : 村雨遥
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io/JavaPark
 * @Description : Book 单元测试
 */
public class TestBook {
    private Logger logger = LoggerFactory.getLogger(TestBook.class);

    @Test
    public void bookTest1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Book book = (Book) applicationContext.getBean("book");
        logger.info("Book 对象[根据 id]创建成功：" + book);
        book.read();
        logger.info("read() 方法已执行！");
    }

    @Test
    public void bookTest2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Book book = applicationContext.getBean(Book.class);

        logger.info("Book 对象[根据类型]创建成功：" + book);
        book.read();
        logger.info("read() 方法已执行！");
    }

    @Test
    public void bookTest3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Book book = applicationContext.getBean("book", Book.class);

        logger.info("Book 对象[根据 id 和类型]创建成功：" + book);
        book.read();
        logger.info("read() 方法已执行！");
    }
}
