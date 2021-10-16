import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Project mybatisGit
 * @Description: test
 * @Author
 * @Explain
 * @Date 2021-10-16 20:35
 */
public class test {
    @Test
    public void testSelect(){
        SqlSession sqlSession = MybatisConfig.getSession();
        userDao mapper = sqlSession.getMapper(userDao.class);
        List<user> list = mapper.selectAll();
        System.out.println(list);
    }
}
