package lk.ijse.gdse.Bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyConnection implements BeanNameAware , BeanFactoryAware , ApplicationContextAware , InitializingBean , DisposableBean {
    public MyConnection(){
        System.out.println("MyConnection()");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposing Bean");
    }
}
