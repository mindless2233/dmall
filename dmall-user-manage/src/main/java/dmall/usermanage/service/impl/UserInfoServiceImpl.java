package dmall.usermanage.service.impl;

import dmall.bean.UserAddress;
import dmall.bean.UserInfo;
import dmall.service.UserInfoService;
import dmall.usermanage.mapper.UserAddressMapper;
import dmall.usermanage.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
@Service
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private UserInfoMapper userInfoMapper;
	@Autowired
	private UserAddressMapper userAddressMapper;
	@Override
	public List<UserInfo> findAll() {
		return userInfoMapper.selectAll();
	}

	@Override
	public List<UserAddress> getUserAddressByUserId(String userId) {
		Example example = new Example(UserAddress.class);
		example.createCriteria().andEqualTo("userId",userId);

		return userAddressMapper.selectByExample(example);

	}
}
