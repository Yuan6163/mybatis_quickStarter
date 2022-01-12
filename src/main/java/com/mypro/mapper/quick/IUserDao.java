package com.mypro.mapper.quick;



import com.mypro.pojo.User;

import java.io.IOException;
import java.util.List;

public interface IUserDao {

    //查询所有用户
    public List<User> findAll() throws IOException;

    //多条件组合查询：演示if
    public List<User> findByCondition(User user);


    //多值查询：演示foreach
    public List<User> findByIds(Long[] ids);

    public void saveUser(User user);

    public void deleteUser(Long id);


}
