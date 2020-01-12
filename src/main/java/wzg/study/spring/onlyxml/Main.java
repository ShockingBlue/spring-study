package wzg.study.spring.onlyxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import wzg.study.spring.onlyxml.bean.User;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
        User user = context.getBean("user", User.class);
        User newUser = context.getBean("newUser", User.class);
        User user1 = context.getBean("user1", User.class);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user.toString());
        System.out.println(newUser);
        System.out.println(user1);
        System.out.println(user2);
    }
}
