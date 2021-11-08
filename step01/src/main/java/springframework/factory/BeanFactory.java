package main.java.springframework.factory;


import main.java.springframework.BeansException;

public interface BeanFactory {

    public Object getBean(String name) throws BeansException;

}
