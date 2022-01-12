package com.mypro.test;

import com.mypro.mapper.multi.IUserMapper;
import com.mypro.pojo.Order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author ColdCurrent
 * @Package com.mypro.test
 * @Description:
 * @date 2022/1/12 下午 5:33
 */
public class MybatisOrderTest {

    @Test
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = factory.openSession();
        IUserMapper userMapper = sqlSession.getMapper(IUserMapper.class);
        List<Order> order = userMapper.findOrder();
        for (Order order1 : order) {
            System.out.println(order1);
        }
    }
}
