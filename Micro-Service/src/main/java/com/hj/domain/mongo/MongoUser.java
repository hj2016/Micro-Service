package com.hj.domain.mongo;

import org.springframework.data.annotation.Id;

public class MongoUser {
    /**
     * 标识ID信息
     * 插入数据时如果没有提供，MongoDB会自动生成
     */
    @Id
    private Long id;
    private String name;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
