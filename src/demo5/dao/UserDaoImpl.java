package demo5.dao;

import demo5.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(User user) {
        String sql="insert into user values(?,?,?)";
        Object[] args={user.getUserId(), user.getUsername(), user.getUstatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void update(User user) {
        String sql="update user set username=?,ustatus=? where user_id=?";
        Object[] args={ user.getUsername(), user.getUstatus(),user.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void delete(String id) {
        String sql="delete from user where user_id=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }
}
