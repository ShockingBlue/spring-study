package wzg.study.spring.annotation.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import wzg.study.spring.annotation.bean.Company;

@Getter
@Setter
@ToString
@Service("service")
@Scope("prototype")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class MyService {
    private Company company;

//    @Autowired
//    public MyService(Company company) {
//        this.company = company;
//    }
}
