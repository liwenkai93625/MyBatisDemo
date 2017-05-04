import com.lwk.dao.StudentDao;
import com.lwk.model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by lianjia on 2017-5-4.
 */
public class MybatisTest {
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        Student student = new Student();
        student.setSid(1);
        student.setName("zhangsan");
        student.setSex("male");
        student.setTid(88801);
        try {
            StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
            boolean bool = studentDao.add(student);
            sqlSession.commit();
            sqlSession.close();
            System.out.println(bool);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
