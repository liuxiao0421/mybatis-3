package org.mybatis.example;

import org.mybatis.example.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.Reader;

/**
 * @Description: TODO
 * @ClassName: MybatisHelloWorld
 * @Author: liu xiao
 * @Date: 2020/11/24 4:38 下午
 **/
public class MybatisHelloWorld {
  public static void main(String[] args) {
    String resource = "org/mybatis/example/xmls/Configuration.xml";
    Reader reader;
    try {
      reader = Resources.getResourceAsReader(resource);
      SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);

      SqlSession session = sqlMapper.openSession();
      try {
        User user = session.selectOne("org.mybatis.example.mapper.UserMapper.getUser", 1);
        System.out.println(user.getLfPartyId() + "," + user.getPartyName());
      } finally {
        session.close();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
