package test.main.java.springframework;

import main.java.springframework.BeanDefinition;
import main.java.springframework.BeanFactory;
import org.junit.Test;
import test.main.java.springframework.bean.UserService;

public class ApiTest {
    @Test
    public void  test_BeanFactory(){
        BeanFactory beanFactory = new BeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
