package com.hj.rest;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.hj.dao.mysql.UserDao;
import com.hj.domain.mongo.MongoUser;
import com.hj.domain.mysql.User;
import com.hj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Service(protocol = "rest")
@Path("/restService")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class RestApiImpl implements RestApi {

    @Autowired(required = true)
    UserService userService;

    @Path("/getMsg")
    @GET
    public String rest() {
        User user = userService.findUser(1L);
        System.out.println(JSON.toJSONString(user));
        return JSON.toJSONString(user);
    }

    @POST
    @Path("/saveUserByMongo")
    @Consumes({MediaType.APPLICATION_JSON})
    public String saveUserByMongo(User user) {
        MongoUser mongoUser= new MongoUser();
        mongoUser.setId(user.getId());
        mongoUser.setName(user.getName());
        mongoUser.setPassword(user.getPassword());
        userService.saveUserByMongo(mongoUser);
        System.out.println(JSON.toJSONString(user));
        return JSON.toJSONString(user);
    }
}
