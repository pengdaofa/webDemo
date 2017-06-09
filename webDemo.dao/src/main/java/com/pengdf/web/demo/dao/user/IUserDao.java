package com.pengdf.web.demo.dao.user;

import org.apache.ibatis.annotations.Param;
import com.pengdf.web.demo.user.user.UserVO;

public interface IUserDao {
	void addUser(@Param("user") UserVO user);
}