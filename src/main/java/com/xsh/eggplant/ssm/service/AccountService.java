package com.xsh.eggplant.ssm.service;

import com.xsh.eggplant.ssm.domain.Account;

import java.util.List;

/**
 * 账户service接口
 */
public interface AccountService {

    //查询全部账户信息
    public List<Account> findAll();

}
