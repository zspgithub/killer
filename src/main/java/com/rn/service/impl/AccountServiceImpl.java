package com.rn.service.impl;

import com.rn.dao.AccountDao;
import com.rn.domain.Account;
import com.rn.service.AccountService;

/**
 * Created by level on 2019/12/23.
 */
public class AccountServiceImpl implements AccountService{
    AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    /**
     *
     * @param accountId
     * @return
     */
    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }
}
