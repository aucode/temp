import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Project mybatisGit
 * @Description: MybatisConfig
 * @Author
 * @Explain
 * @Date 2021-10-16 20:16
 */
public class MybatisConfig {

    private static SqlSessionFactory sessionFactory;

    static {
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static SqlSession getSession() {
        return sessionFactory.openSession();
    }


}
