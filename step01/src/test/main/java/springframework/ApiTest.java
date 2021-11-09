package test.main.java.springframework;

import main.java.springframework.BeansException;
import main.java.springframework.factory.config.BeanDefinition;
import main.java.springframework.factory.BeanFactory;
import main.java.springframework.factory.support.DefaultListableBeanFactory;
import org.junit.Test;
import test.main.java.springframework.bean.UserService;

public class ApiTest {
    @Test
    public void  test_BeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        UserService userService2 = (UserService) beanFactory.getBean("userService");
        userService2.queryUserInfo();
    }
}
