package lk.ijse.gdse.Config;

import lk.ijse.gdse.Bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "lk.ijse.gdse.Bean")
public class AppConfig {

    @Bean
    @Scope("prototype")
    public MyConnection myConnection(){
        return new MyConnection();
    }
}
