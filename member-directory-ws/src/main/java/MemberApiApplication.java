import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan (basePackages = "com.sidgs")
@Component
public class MemberApiApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MemberApiApplication.class, args);
    }
}