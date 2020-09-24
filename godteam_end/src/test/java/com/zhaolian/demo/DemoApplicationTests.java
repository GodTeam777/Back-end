package com.zhaolian.demo;

import com.zhaolian.demo.data.dao.BankMapper;
import com.zhaolian.demo.data.dao.UsersMapper;
import com.zhaolian.demo.data.entity.Bank;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.data.entity.UsersExample;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    BankMapper dao;
    @Test
    void contextLoads() {
        System.out.println("!111111111");

        Bank bank= dao.selectByPrimaryKey(new BigDecimal(1));
        System.out.println(bank.toString());
    }

}
