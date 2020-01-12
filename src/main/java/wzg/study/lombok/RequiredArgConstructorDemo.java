package wzg.study.lombok;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import wzg.study.spring.onlyxml.bean.Info;

@RequiredArgsConstructor(staticName = "of", onConstructor = @__(@Autowired))
public class RequiredArgConstructorDemo {
    Info info;
    @NonNull private String str;

    public static void main(String[] args) {
        var demo1 = new RequiredArgConstructorDemo("abc");
        var demo2 = RequiredArgConstructorDemo.of("123");
    }
}
