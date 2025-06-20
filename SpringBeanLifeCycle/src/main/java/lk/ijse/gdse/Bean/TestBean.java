package lk.ijse.gdse.Bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TestBean implements DisposableBean {
    public TestBean() {
        System.out.println("TestBean Constructor");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("TestBean destroy");
    }
}
