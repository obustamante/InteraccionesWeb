package co.edu.usc.interacciones.utiles;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class DBUtils {

    static SqlSessionFactory sqlSessionFactory = null;

    public static SqlSession getSession() throws IOException {

        if (sqlSessionFactory == null) {

            String resource = "co/edu/usc/interacciones/dao/xml/mybatis-config.xml";

            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }

        SqlSession sqlSession = sqlSessionFactory.openSession();

        return sqlSession;
    }
}
