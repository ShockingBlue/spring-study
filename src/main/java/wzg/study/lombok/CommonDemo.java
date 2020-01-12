package wzg.study.lombok;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommonDemo {
    private String str;
    private int num;

    public static void main(String[] args) {
        var demo = new CommonDemo("abc", 123);
        System.out.println(demo);
    }
}
