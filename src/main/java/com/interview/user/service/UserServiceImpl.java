package com.interview.user.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.interview.user.domain.User;

@Service("userService")
public class UserServiceImpl implements UserService{

	private static Map<Long, User> users = new HashMap<Long, User>();
	
	/* (non-Javadoc)
	 * @see com.interview.user.service.UserService#addUser(com.interview.user.domain.User)
	 */
	public void addUser(User user) {
		// TODO Auto-generated method stub
		users.put(user.getUserid(), user);
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		users.put(user.getUserid(), user);
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

}
