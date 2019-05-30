package swagger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swagger.bean.User;
import swagger.dao.UserDao;

import java.util.List;

@Service
public class serviceimpl implements service {
    @Autowired
    public UserDao userDao;

    @Override
    public List<User> selectList() {
        return userDao.selectList();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void update(String name, String id) {
        userDao.updateUser(name,id);
    }

    @Override
    public void deleteUserByid(String id) {
        userDao.deleteUserByid(id);
    }
}
