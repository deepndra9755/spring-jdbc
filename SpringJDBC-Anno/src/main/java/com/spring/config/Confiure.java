package com.spring.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;


@Configuration
@ComponentScan("com.spring")
public class Confiure {
@Bean
public HikariDataSource mydd()
{
HikariDataSource d=new HikariDataSource();
d.setDriverClassName("com.mysql.cj.jdbc.Driver");
d.setJdbcUrl("jdbc:mysql://localhost:3306/emp");
d.setUsername("root");
d.setPassword("root");
d=new HikariDataSource(d);

return d;
}
@Bean("fop")
public JdbcTemplate setJDBC()
{
JdbcTemplate f=new JdbcTemplate(mydd());
return f;
}

}
