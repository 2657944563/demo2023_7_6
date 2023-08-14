package com.example.demo2023_7_6.myPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author yuanyi
 * @date 2023/7/20 16:33
 */
@Component
@Scope("prototype")
public class TestBeanPostProcessor implements BeanFactoryPostProcessor, BeanPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("BeanFactor自定义流程开始");
        for (String beanDefinitionName : configurableListableBeanFactory.getBeanDefinitionNames()) {
//            System.out.println(beanDefinitionName);
        }
        System.out.println("BeanFactor自定义流程结束");
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.contains("com.example")) {
            System.out.println(beanName);
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
