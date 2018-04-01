package com.hj.service.impl;

import com.hj.dao.mongo.MongoUserDao;
import com.hj.dao.mysql.UserDao;
import com.hj.domain.mongo.MongoUser;
import com.hj.domain.mysql.User;
import com.hj.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    public UserDao userDao;

    @Resource
    public MongoUserDao mongoUserDao;

    public User findUser(Long id) {
        return this.userDao.findUserById(id);
    }


    public List<MongoUser> findUserByMongo() {
        List<MongoUser> users = mongoUserDao.findAll();
        return users;
    }

    public void saveUserByMongo(MongoUser user) {
        mongoUserDao.insert(user);
    }
}
