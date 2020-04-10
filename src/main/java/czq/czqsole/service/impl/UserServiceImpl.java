package czq.czqsole.service.impl;

import czq.czqsole.annotation.MethodLog;
import czq.czqsole.dao.UserMapper;
import czq.czqsole.domain.User;
import czq.czqsole.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Author: czqsole
 * Date: 2018/9/8
 */
@Component
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

    @Override
    @MethodLog(description = "user")
    public User getUser(String name) {
        return userMapper.select(name);
    }
}
