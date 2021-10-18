package demo3.d1018.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "userImpl1")
public class UserImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao add......");
    }
}
