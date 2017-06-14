package com.pengdf.web.demo.service.user;

import java.util.UUID;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.pengdf.utils.test.BaseJunit4Test;
import com.pengdf.web.demo.user.user.UserVO;

public class IUserServiceTest extends BaseJunit4Test {

		
	@Resource
	private IUserService userService;
	
	@Test
	//@Transactional
    //@Rollback(false) 
	public void test() {
		UserVO user = new UserVO();
		user.setUserId(UUID.randomUUID().toString());
		user.setUserName("test1");
		user.setPassword("123456");
		userService.addUser(user);
	}

}
