package wzg.study.spring.annotation.bean;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Getter
@Setter
@ToString
@Service
/*
 wzg:
 1. 注意构造函数如何添加注解以及NonNull参数生成构造函数的方法
 2. 说明不一定要定义不带参的构造函数，只要说明生成对象的方法即可作为bean类
 3. @AutoWired本身对代码没有任何副作用，只是协助容器生成对象
 */
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class Company {
    /*
    wzg:
    等价于xml中配置时的property注入
     */
    @Value("hw")
    private String name;
    @NonNull
    private Employee employee;

//    @Autowired
//    public Company(Employee employee) {
//        this.employee = employee;
//    }
}
