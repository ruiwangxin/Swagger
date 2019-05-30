package swagger.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import swagger.bean.User;
import swagger.service.service;

import java.util.List;

@Api(value = "控制层")
@RestController
public class controller {
    @Autowired
    public service service;

    @ApiOperation(value = "获取全部信息")
    @GetMapping("/getInfo")
    public List<User> findUser() {
        return service.selectList();
    }

    @ApiOperation(value = "添加用户信息")
    @PostMapping("/add")
    public boolean addUser(User user) {
        System.out.println(user);
        if (user != null) {
            service.addUser(user);
            return true;
        } else {
            return false;
        }

    }

    @ApiOperation(value = "修改用户信息")
    @PostMapping("/update")
    public boolean update(String name, String id) {
        System.out.println(name + "======" + id);
        if (name != null) {
            service.update(name, id);

            return true;
        } else {
            return false;
        }
    }
    @ApiOperation(value = "删除用户信息")
    @PostMapping("/delete")
    public boolean delete(String id) {
        System.out.println(id);
        if (id != null) {
            service.deleteUserByid(id);

            return true;
        } else {
            return false;
        }
    }
}
