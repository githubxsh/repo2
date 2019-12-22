package com.xsh.eggplant.ssm.controller;

import com.xsh.eggplant.ssm.domain.Account;
import com.xsh.eggplant.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    //查询全部账户信息
    @RequestMapping("/findAll")
    public List<Account> findAll() {
        return accountService.findAll();
    }

}
