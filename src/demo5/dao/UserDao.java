package demo5.dao;

import demo5.entity.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    void update(User user);

    void delete(String id);

    int selectUser();

    User findUserInfo(String id);

    List<User> findAllUser();
}
