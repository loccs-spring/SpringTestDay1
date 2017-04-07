package cn.edu.sjtu.property;

import cn.edu.sjtu.user.User;

/**
 * Created by spring on 2017/3/28.
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        userDao.add();
    }
}
