package demo1.d1015.service;

import demo1.d1015.dao.UserDao;

public class UserService {

    //创建UserDao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("add...........");
        userDao.update();
    }
}
