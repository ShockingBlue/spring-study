package wzg.study.spring.annotation.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Getter
@Setter
@ToString
/*
 wzg: 等价注解说明
 对于dao层一般用@Repository，
 control层用@Controller，
 service层用@Service，
 一般的组件用@Component
 */
@Repository
public class Employee {
    @Value("wzg")
    private String name;
    @Value("35")
    private int age;
}
