package wzg.study.spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wzg.study.spring.annotation.bean.Company;
import wzg.study.spring.annotation.bean.Employee;
import wzg.study.spring.annotation.config.MyConfig;
import wzg.study.spring.annotation.service.MyService;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
        System.out.println(context.getBean("company", Company.class));
        System.out.println(context.getBean("employee", Employee.class));
        /* wzg:
        如果没有指定bean id，那么默认bean id的生成规则如下：
        类名首字母一个大写，只将首字母改为小写，其他不变；
        类名连续两个首字母大写，使用类名作为bean id；
        此外也可以直接在定义bean对象的注解里面指定bean的id，如下面的service；
        */
        System.out.println(context.getBean("service", MyService.class));

        /* wzg:
        使用纯注解实现IOC和DI
         */
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println(ctx.getBean("ee", Employee.class));

    }
}
