package org.example;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@ToString
@Component
@PropertySource("classpath:application.properties")
public class BaseDao {


    @Value("${spring.datasource.url}")
    private String url;
}
