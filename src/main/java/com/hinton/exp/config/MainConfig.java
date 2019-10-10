package com.hinton.exp.config;

import com.hinton.exp.compent.*;
import com.hinton.exp.condition.HintonCondition;
import com.hinton.exp.filtertype.HintonFilterType;
import com.hinton.exp.importselect.HintonBeanDefinitionRegister;
import com.hinton.exp.importselect.HintonImportSelector;
import com.hinton.exp.service.HintonService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//@Configuration
//@ComponentScan(basePackages = {"com.hinton.exp"})
//@ComponentScan(basePackages = {"com.hinton.exp"},
//                excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Controller.class}),
//                                  @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = {HintonService.class})
//                })
//@ComponentScan(basePackages = {"com.hinton.exp"},
//        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Controller.class, Service.class}),
//                @ComponentScan.Filter(type = FilterType.CUSTOM,value = {HintonFilterType.class})
//        },useDefaultFilters = false)
@Configuration
//@Import(value = {Person.class, Car.class})
//@Import(value = {Person.class,Car.class, HintonImportSelector.class})
//@Import(value = {Person.class,Car.class, HintonImportSelector.class, HintonBeanDefinitionRegister.class})
public class MainConfig {
//  @Bean(name = "person2")
//    @Bean
//    @Scope(scopeName = "prototype")
//    @Lazy
//    public Person person(){
//        return new Person();
//    }
//    @Bean(name = "hintonAspect02")
//    public HintonAspect hintonAspect01(){
//        return new HintonAspect();
//    }
//
//    @Bean
//    @Conditional(value = HintonCondition.class)
//    public HintonLog hintonLog(){
//        return new HintonLog();
//    }

    @Bean
    public CarFactoryBean carFactoryBean(){
        return new CarFactoryBean();
    }

}
