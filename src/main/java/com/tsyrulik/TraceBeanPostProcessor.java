package com.tsyrulik;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TraceBeanPostProcessor implements BeanPostProcessor, Ordered {
    Set<String> beansToProcess = new HashSet<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean.getClass().isAnnotationPresent(Trace.class)) {
            beansToProcess.add(beanName);
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beansToProcess.contains(beanName)) {
            return Proxy.newProxyInstance(this.getClass().getClassLoader(), bean.getClass().getInterfaces(), (proxy, method, args) -> {
                System.out.println("Trace: " + beanName + " method " + method.getName() + " " + Arrays.toString(args));
                return method.invoke(bean, args);
            });
        }

        return bean;
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }
}
