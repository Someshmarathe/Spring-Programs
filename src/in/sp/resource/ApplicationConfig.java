package in.sp.resource;

import in.sp.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean("student")
    public Student getStudent(){
        Student std = new Student();
        std.setId(2);
        std.setName("bhavesh");
        std.setEmail("bhavesh@gamil.com");
        std.setAddress("khandwa");
        return std;
    }
}
