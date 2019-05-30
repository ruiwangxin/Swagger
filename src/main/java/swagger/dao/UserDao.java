package swagger.dao;


import org.apache.ibatis.annotations.*;
import swagger.bean.User;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("select * from User")
    public List<User> selectList();
    @Insert("insert into User values(#{id},#{name},#{del_flag},#{create_by},#{create_date},#{update_by},#{update_date})")
    public void addUser(User user);
    @Update("update User set name = #{name} where id = #{id}")
    public void updateUser(@Param("name") String name, @Param("id") String id);
    @Delete("delete from User where id = #{id}")
    public void deleteUserByid(@Param("id") String id);
}
