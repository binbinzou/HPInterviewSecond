package com.interview.user.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.interview.user.domain.User;
import com.interview.user.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@Controller  
@Scope("prototype")
public class UserAction extends ActionSupport{
	@Autowired
	@Qualifier("userService")
    private UserService userService;  
   
	private User user;  
    private List<User> userList;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}  
    
	public String addJsp() {  
        return "addUser";  
    }  
  
    public String updateJsp() {  
        user = userService.findUserById(user.getUserid());  
        return "updateUser";  
    }  
  
    public String add() {  
        userService.addUser(user);  
        return SUCCESS;  
    }  
  
    public String delete() {  
        userService.deleteUser(user.getUserid());  
        return SUCCESS;  
    }  
  
    public String update() {  
        userService.updateUser(user);  
        return SUCCESS;  
    }  
    public String queryAllUser() {  
        userList = userService.findAllUser();  
        return "userList";  
    }  
  
	
}
