package cn.itcast.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.core.dao.UserDao;
import cn.itcast.core.pojo.User;
import cn.itcast.core.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public void save(User user) {
		userDao.insert(user);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

}
