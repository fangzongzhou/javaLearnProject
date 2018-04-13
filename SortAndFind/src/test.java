import com.google.common.collect.Lists;

import java.util.List;
import java.util.Optional;

public class test {
    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList();
        list=null;
        TestBean testbean=null;
        System.out.println(Optional.ofNullable(testbean).map(TestBean::getCol1).orElse(""));
        System.out.println(list);
    }
}
