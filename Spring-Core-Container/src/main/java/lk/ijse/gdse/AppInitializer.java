package lk.ijse.gdse;

import lk.ijse.gdse.Bean.MyConnection;
import lk.ijse.gdse.Bean.SpringBean;
import lk.ijse.gdse.Bean.TestBean1;
import lk.ijse.gdse.Bean.TestBean2;
import lk.ijse.gdse.Config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.register(AppConfig.class);

        SpringBean springBean1 = context.getBean(SpringBean.class);
        System.out.println(springBean1);

        SpringBean springBean2 = context.getBean(SpringBean.class);
        System.out.println(springBean2);

        TestBean1 testBean1 = context.getBean(TestBean1.class);
        System.out.println(testBean1);

        TestBean2 testBean2 = context.getBean(TestBean2.class);
        System.out.println(testBean2);

        //class Name
        SpringBean springBean3 = context.getBean(SpringBean.class);
        System.out.println(springBean3);

        //id
        SpringBean springBean4 = (SpringBean) context.getBean("springBean");
        System.out.println(springBean4);

        //class Name and Id
        SpringBean springBean5 = (SpringBean) context.getBean("springBean", SpringBean.class);
        System.out.println(springBean5);


        TestBean1 testBean3 = (TestBean1) context.getBean("Chamindu");
        System.out.println(testBean3);

        MyConnection myConnection = (MyConnection) context.getBean("myConnection");
        System.out.println(myConnection);

        context.registerShutdownHook();

    }
}