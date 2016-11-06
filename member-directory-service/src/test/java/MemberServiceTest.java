import com.sidgs.dao.MemberDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MemberServiceTest {

    ApplicationContext applicationContext;
    public MemberServiceTest( ) {

    }

    public void setup(){
        if (applicationContext == null)
        applicationContext =
                new ClassPathXmlApplicationContext("classpath:META-INF/member-directory-service-appContext.xml");

    }

    @Test
    public void testAppContextInit() {

        setup() ;
        assert (true);
        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
        assert (jdbcTemplate!= null );

        MemberDao memberDao = (MemberDao) applicationContext.getBean("MemberDao");
        assert (memberDao != null );

        //TODO
//        memberDao.addMember();

        //TODO
//        memberDao.deleteMember();

        memberDao.getAllMembers();


    }
}

