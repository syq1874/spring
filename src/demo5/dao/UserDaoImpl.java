package demo5.dao;

import demo5.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    public int selectUser() {
        String sql="select count(*) from user";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public User findUserInfo(String id) {
        String sql="select * from user where user_id=?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
        return user;
    }

    @Override
    public List<User> findAllUser() {
        String sql="select * from user";
        List<User> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return bookList;
    }
}
