package com.zkh.springboot.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "school")
public class School {
    private String name;
    private String site;
    @Value("${money}")
    private String money;

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", site='" + site + '\'' +
                ", money='" + money + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
