package com.bright.test;

import com.bright.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 徐亮亮
 * @date 2020/8/24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcCRUDTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testCreate() {
        jdbcTemplate.update("insert into account value (?, ?)", "Tom", 2000.87);
    }

    @Test
    public void testUpdate() {
        jdbcTemplate.update("update account set money=? where name=?", 200.23, "Tom");
    }

    @Test
    public void testDelete() {
        jdbcTemplate.update("delete from account where name=?", "Tom");
    }

    @Test
    public void testQueryAll() {
        List<Account> accountList = jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
        System.out.println("accountList = " + accountList);
    }

    @Test
    public void testQueryOne() {
        Account account = jdbcTemplate.queryForObject("select * from account where name=?", new BeanPropertyRowMapper<Account>(Account.class), "Tom");
        System.out.println("account = " + account);
    }

    @Test
    public void testQueryCount() {
        Long count = jdbcTemplate.queryForObject("select count(*) from account", Long.class);
        System.out.println("count = " + count);
    }
}
