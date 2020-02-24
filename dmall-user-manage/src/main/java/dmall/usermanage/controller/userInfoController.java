package dmall.usermanage.controller;

import dmall.bean.UserAddress;
import dmall.bean.UserInfo;
import dmall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userInfoController {
	@Autowired
	private UserInfoService userInfoService;


	@RequestMapping("findAll")
	public List<UserInfo> findAll() {
		return userInfoService.findAll();


	}

	@RequestMapping("trade")
	List<UserAddress> getUserAddressByUserId(String userId) {
		return userInfoService.getUserAddressByUserId(userId);
	}
}
