package com.interview.user.service;

import java.util.List;

import com.interview.user.domain.User;

public interface UserService {

	 //添加用户  
    void addUser(User user);  
    //更新用户
    void updateUser(User user);  
    //删除用户
    void deleteUser(long userId);  
    //查询某一个用户
    User findUserById(long l);  
    //查询所有用户
    List<User> findAllUser();  
	
}
