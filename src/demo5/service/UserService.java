package demo5.service;


import demo5.dao.UserDao;
import demo5.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void addUser(User user){
        userDao.add(user);
    }

    public void updateUser(User user){
        userDao.update(user);
    }

    public void deleteUser(String id){
        userDao.delete(id);
    }
}
