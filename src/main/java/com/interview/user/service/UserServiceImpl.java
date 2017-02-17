package com.interview.user.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import com.interview.user.domain.User;

@Service("userService")
public class UserServiceImpl implements IUserService{

	private static Map<Long, User> users = new HashMap<Long, User>();
	
	/* (non-Javadoc)
	 * @see com.interview.user.service.UserService#addUser(com.interview.user.domain.User)
	 */
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		boolean tmp = validateAdd(user);
		if(tmp){
			users.put(user.getUserid(), user);
		}
		return tmp;
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		boolean tmp = validateUpdate(user);
		if(tmp){
			users.put(user.getUserid(), user);
		}
		return tmp;
	}

	public void deleteUser(long userId) {
		// TODO Auto-generated method stub
		users.remove(userId);
	}

	public User findUserById(long userId) {
		// TODO Auto-generated method stub
		return users.get(userId);
	}

	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		List<User> userLists = new ArrayList<User>();
		Set<Long> userids = users.keySet();
		for(Long userid : userids){
			userLists.add(users.get(userid));
		}
		return userLists;
	}

	/**
	 * 新增一条记录的时候。需要验证的相关属性
	 * 1、用户名不能为空
	 * 2、userid需要在五位数之内
	 * 3、年龄需要在100岁之内
	 * 4、不能有重复的userid
	 * @param user
	 * @return
	 */
	public boolean validateAdd(User user){
		if(user.getUsername()==null||"".equals(user.getUsername())){
			return false;
		}else if(users.containsKey(user.getUserid())){
			return false;
		}else if(user.getUserid()>99999){
			return false;
		}else if(user.getAge()>100){
			return false;
		}else{
			return true;
		}
	}
	
	/**
	 * 更新一条记录的时候。需要验证的相关属性
	 * 1、用户名不能为空
	 * 2、年龄需要在100岁之内
	 * @param user
	 * @return
	 */
	public boolean validateUpdate(User user){
		if(user.getUsername()==null||"".equals(user.getUsername())){
			return false;
		}else if(user.getAge()>100){
			return false;
		}else{
			return true;
		}
	}
	
}
