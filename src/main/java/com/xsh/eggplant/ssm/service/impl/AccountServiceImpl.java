package com.xsh.eggplant.ssm.service.impl;

import com.xsh.eggplant.ssm.domain.Account;
import com.xsh.eggplant.ssm.mapper.AccountMapper;
import com.xsh.eggplant.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    //查询全部账户信息
    public List<Account> findAll() {
        return accountMapper.findAll();
    }

}
