package wzg.study.spring.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import wzg.study.spring.annotation.bean.Employee;

@Configuration
public class MyConfig {
    @Bean("ee")
    public Employee employee() {
        return new Employee();
    }
}
