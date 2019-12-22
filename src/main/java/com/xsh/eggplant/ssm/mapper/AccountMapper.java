package com.xsh.eggplant.ssm.mapper;

import com.xsh.eggplant.ssm.domain.Account;

import java.util.List;

public interface AccountMapper {

    //查询全部账户信息
    public List<Account> findAll();

}
