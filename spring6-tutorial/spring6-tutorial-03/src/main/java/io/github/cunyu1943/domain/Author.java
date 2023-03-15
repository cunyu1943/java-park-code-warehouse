package io.github.cunyu1943.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package : io.github.cunyu1943.domain
 * @ClassName : Author.java
 * @CreateTime : 2023/2/9 19:57
 * @Version : 1.0
 * @Author : 村雨遥
 * @Email : 747731461@qq.com
 * @公众号 : 村雨遥
 * @Website : https://cunyu1943.github.io/JavaPark
 * @Description : 作者类
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Author {
    private String name;
    private Long age;
    private Map<String, Book> authorMap;
}
