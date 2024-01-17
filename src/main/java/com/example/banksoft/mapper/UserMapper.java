package com.example.banksoft.mapper;

import com.example.banksoft.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from admin where username=#(username")
    User selectByUsername(String username);

    @Insert("insert into user(username,password)")
    void add(String username,String password);
}
