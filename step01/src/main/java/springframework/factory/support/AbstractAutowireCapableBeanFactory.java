package main.java.springframework.factory.support;

import main.java.springframework.BeansException;
import main.java.springframework.factory.config.BeanDefinition;

public class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected BeanDefinition getBeanDefinition(String beanName) {
        return null;
    }

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
