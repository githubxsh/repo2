package com.xsh.eggplant.ssm.domain;

import java.math.BigDecimal;

/**
 * 账户
 */
public class Account {
    private Integer id;
    private String name;
    private BigDecimal money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
