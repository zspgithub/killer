package com.rn.dao;

import com.rn.domain.Account;

/**
 * Created by level on 2019/12/23.
 */
public interface AccountDao {
    /**
     * 查找账户
     * @param accountId
     * @return
     */
    Account findAccountById(Integer accountId);
}
