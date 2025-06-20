package lk.ijse.gdse;

import lk.ijse.gdse.Bean.MyConnection;
import lk.ijse.gdse.Bean.TestBean;
import lk.ijse.gdse.Config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.register(AppConfig.class);

        MyConnection myconnection = context.getBean(MyConnection.class);
        MyConnection myConnection1 = context.getBean(MyConnection.class);

        System.out.println(myconnection);
        System.out.println(myConnection1);

        context.registerShutdownHook();

    }
}