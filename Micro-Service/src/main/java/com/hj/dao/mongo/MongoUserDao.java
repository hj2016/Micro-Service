package com.hj.dao.mongo;

import com.hj.domain.mongo.MongoUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoUserDao extends MongoRepository<MongoUser, Long> {

}
