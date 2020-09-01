package com.bright.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ResourceBundle;

/**
 * @author 徐亮亮
 * @date 2020/8/24
 */
public class JdbcTemplateTest {

    @Test
    // 测试 JdbcTemplate 开发步骤
    public void test1() {

        // 读取配置文件
        ResourceBundle rb = ResourceBundle.getBundle("jdbc");
        String driver = rb.getString("jdbc.driver");
        String url = rb.getString("jdbc.url");
        String username = rb.getString("jdbc.username");
        String password = rb.getString("jdbc.password");

        // 创建数据源对象 设置连接参数
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        // 1. 创建模板对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        // 2. 设置数据源对象 知道数据库在哪
        jdbcTemplate.setDataSource(dataSource);
        // 3. 执行操作
        int row = jdbcTemplate.update("insert into account value (?, ?)", "Tom", 20.0);
        System.out.println("row = " + row);

    }

    @Test
    // 测试 Spring 产生 JdbcTemplate 对象
    public void test2() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) app.getBean("jdbcTemplate");
        int row = jdbcTemplate.update("insert into account value (?, ?)", "张山", 2000.87);

        System.out.println("row = " + row);
    }
}
