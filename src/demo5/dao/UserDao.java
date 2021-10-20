package demo5.dao;

import demo5.entity.User;

public interface UserDao {
    void add(User user);

    void update(User user);

    void delete(String id);
}
