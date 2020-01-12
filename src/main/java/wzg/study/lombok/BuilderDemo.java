package wzg.study.lombok;

import lombok.Builder;
import lombok.Singular;

import java.util.Collections;
import java.util.List;

@Builder
public class BuilderDemo {
    private String name;
    private int num;

    @Singular("strList")
    private List<String> strList;

    public static void main(String[] args) {
        BuilderDemo demo = BuilderDemo.builder().strList("abc").name("name").num(1).build();
        System.out.println(demo.strList);
        // immutable list!!!!!!
        // demo.strList.add("123");
        System.out.println(demo.strList);
    }
}
