package com.rn;

import com.rn.dao.AccountDao;
import com.rn.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by level on 2019/12/22.
 */
public class KillerTest {
    @Test
    public  void Kk(){
        System.out.println("kkkkkk");
        ApplicationContext ac=new GenericXmlApplicationContext("beans.xml");
        AccountDao accountDao=ac.getBean("accountDao",AccountDao.class);
        AccountService accountService=ac.getBean("accountService", AccountService.class);
        System.out.println(accountDao);
        System.out.println(accountService);
        accountService.findAccountById(1);
    }
}
