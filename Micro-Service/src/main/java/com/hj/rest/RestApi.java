package com.hj.rest;

import com.hj.domain.mysql.User;

public interface RestApi {
    public String rest();
    public String saveUserByMongo(User user);
}
