package com.hinton.exp;

import com.hinton.exp.compent.Person;
import com.hinton.exp.config.MainConfig;
import com.hinton.exp.controller.HintonController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
//        Person person = (Person) annotationConfigApplicationContext.getBean("person");
//        Person person1 = (Person) annotationConfigApplicationContext.getBean("person");
//        System.out.println(person == person1);
//        String[] beanDefinationNames = annotationConfigApplicationContext.getBeanDefinitionNames();
//        for(String name:beanDefinationNames){
//            System.out.println(name);
//        }
//        HintonController hintonController = annotationConfigApplicationContext.getBean(HintonController.class);
//        System.out.println(hintonController);
          Object bean = annotationConfigApplicationContext.getBean("carFactoryBean");
        System.out.println(bean);
    }
}
