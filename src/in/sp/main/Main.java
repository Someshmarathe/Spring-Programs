package in.sp.main;

import in.sp.bean.Student;
import in.sp.resource.AnnotationApplicationConfig;
import in.sp.resource.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resource/ApplicationConfig.xml");
       // ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationApplicationConfig.class);
        Student std = (Student) context.getBean("student");
        System.out.println(std);

    }
}