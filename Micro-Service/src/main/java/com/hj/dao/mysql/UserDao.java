package com.hj.dao.mysql;


import com.hj.domain.mysql.User;


/**
 * Created by huangjing on 17-4-29.
 */
public interface UserDao {

    /**
     * 根据id进行查询
     * @param id
     * @return
     */
    User findUserById(Long id);

}
