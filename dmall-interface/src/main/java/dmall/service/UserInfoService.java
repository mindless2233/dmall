package dmall.service;

import dmall.bean.UserAddress;
import dmall.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
	//查询用户列表
	List<UserInfo> findAll();
	//查询用户收货地址
	List<UserAddress> getUserAddressByUserId(String userId);
}
