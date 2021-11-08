package main.java.springframework.factory.config;

public class BeanDefinition {

    private Class bean;

    public BeanDefinition(Class bean) {
        this.bean = bean;
    }

    public Class getBeanClass() {
        return bean;
    }
}
