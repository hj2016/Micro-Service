package com.hj.service;

import com.hj.domain.mongo.MongoUser;
import com.hj.domain.mysql.User;

public interface UserService {
    public User findUser(Long id);
    public void saveUserByMongo(MongoUser user);
}
