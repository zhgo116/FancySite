package cn.fancy.modules.user.service.impl;

import cn.fancy.modules.user.dao.UserDao;
import cn.fancy.modules.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    public String getList(){
        return userDao.getList();
    }
}
