package lk.ijse.gdse.Config;

import lk.ijse.gdse.Bean.MyConnection;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse.Bean")
public class AppConfig {
    public MyConnection myconnection(){
        return new MyConnection();
    }

}
