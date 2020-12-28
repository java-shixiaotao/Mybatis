import generate.Payment;
import mapper.PaymentMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import utils.SqlSessionFactoryUtil;

import java.io.IOException;

public class MyBatisTest {
    SqlSessionFactoryUtil sqlSessionFactoryUtil = new SqlSessionFactoryUtil();
    @Test
    public void payMentTest() throws IOException {
        SqlSessionFactory ssf = sqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = ssf.openSession();
        PaymentMapper mapper = sqlSession.getMapper(PaymentMapper.class);
        Payment payment = mapper.selectByPrimaryKey((long) 31);
        System.out.println(payment);

    }
}
