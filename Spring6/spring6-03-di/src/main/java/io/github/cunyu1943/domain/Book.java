package io.github.cunyu1943.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package : io.github.cunyu1943.domain
 * @ClassName : Book.java
 * @CreateTime : 2023/2/7 21:53
 * @Version : 1.0
 * @Author : 村雨遥
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io/JavaPark
 * @Description : 书本类
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private Long id;
    private String name;
    private Double price;
    private String[] tags;
    private List<String> comments;
    private Author author;
}
