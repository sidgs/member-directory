import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
    }
}

