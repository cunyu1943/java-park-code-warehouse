package io.github.cunyu1943.domain;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created with IntelliJ IDEA.
 *
 * @Package : io.github.cunyu1943.domain
 * @ClassName : BookTest.java
 * @CreateTime : 2023/2/7 22:05
 * @Version : 1.0
 * @Author : 村雨遥
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io/JavaPark
 * @Description : 书本测试类
 */
class BookTest {
    private Logger logger = LoggerFactory.getLogger(BookTest.class);

    @Test
    void testDiSet() {
        Book book = new Book();
        book.setName("《狂飙》");
        book.setId(1L);
        book.setPrice(48.00D);
        logger.info(book.toString());
    }

    @Test
    void testDiConstructor() {
        Book book = new Book(1L, "《沉默的真相》", 56.00D, null, null, null);
        logger.info(book.toString());
    }

    @Test
    void testDiSetXml() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("di-set.xml");
        Book book = (Book) applicationContext.getBean("book");
        logger.info(book.toString());
    }

    @Test
    void testDiConstructorXml() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("di-constructor.xml");
        Book book = (Book) applicationContext.getBean("book");
        logger.info(book.toString());
    }

    @Test
    void testDiArrayXml() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("di-array.xml");
        Book book = (Book) applicationContext.getBean("book");
        logger.info(book.toString());
    }

    @Test
    void testDiBeanOuterXml() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("di-bean-outer.xml");
        Book book = (Book) applicationContext.getBean("book");
        logger.info(book.toString());
    }

    @Test
    void testDiListXml() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("di-list.xml");
        Book book = (Book) applicationContext.getBean("book");
        logger.info(book.toString());
    }

    @Test
    void testDiBeanInnerXml() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("di-bean-inner.xml");
        Book book = (Book) applicationContext.getBean("book");
        logger.info(book.toString());
    }

    @Test
    void testDiBeanCascadeXml() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("di-bean-cascade.xml");
        Book book = (Book) applicationContext.getBean("book");
        logger.info(book.toString());
    }

    @Test
    void testDiMapXml() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("di-map.xml");
        Author author = applicationContext.getBean("author", Author.class);
        logger.info(author.toString());
    }
}
