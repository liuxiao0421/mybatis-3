package org.mybatis.example.mapper;


import org.mybatis.example.pojo.User;

/**
 * @Description: TODO
 * @ClassName: UserMapper
 * @Author: liu xiao
 * @Date: 2020/11/24 4:40 下午
 **/
public interface UserMapper {
  User getUser(int lfPartyId);

  int updateUser(int id);
}
