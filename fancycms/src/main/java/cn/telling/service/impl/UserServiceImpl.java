package cn.telling.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.fancy.base.ServiceMybatis;
import cn.fancy.model.User;
import cn.fancy.service.IUserService;

/**   
 * @Title: UserServiceImpl.java 
 * @Package cn.fancy.service.impl 
 * @Description: (描述该文件做什么) 
 * @author 操圣
 * @date 2017年5月19日 上午11:19:07 
 * @version V1.0   
 */
@Service(value="UserServiceImpl")
public class UserServiceImpl extends ServiceMybatis<User> implements IUserService{

	@Override
	public List<User> findList() {
		//  Auto-generated method stub
		System.out.println("=======================");
		return null;
	}


}

