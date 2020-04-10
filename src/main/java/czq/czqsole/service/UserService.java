package czq.czqsole.service;

import czq.czqsole.domain.User;

/**
 * Author: czqsole
 * Date: 2018/9/8
 */
public interface UserService {
    void add(User user);

    User getUser(String name);
}
