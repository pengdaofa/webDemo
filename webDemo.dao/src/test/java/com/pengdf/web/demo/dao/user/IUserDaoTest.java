package com.pengdf.web.demo.dao.user;

import java.util.UUID;

import javax.annotation.Resource;

import org.junit.Test;

import com.pengdf.utils.test.BaseJunit4Test;
import com.pengdf.web.demo.user.user.UserVO;

public class IUserDaoTest extends BaseJunit4Test {
	@Resource
	private IUserDao userDao;

	@Test
	public void test() {
		UserVO user = new UserVO();
		user.setUserId(UUID.randomUUID().toString());
		user.setUserName("test1");
		user.setPassword("123456");
		userDao.addUser(user);
		// fail("Not yet implemented");
	}

}
