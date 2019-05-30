package swagger.service;

import swagger.bean.User;

import java.util.List;

public interface service {
    public List<User> selectList();
    public void addUser(User user);
    public void update(String name,String id);
    public void deleteUserByid(String id);
}
