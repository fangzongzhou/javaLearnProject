import com.google.common.collect.Lists;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> ints = Lists.newArrayList(1, 3, 4, 2);
        ints.sort((o1, o2) -> o1 > o2 ? 1 : -1);
        for (int a:ints
             ) {
            System.out.println(a);
        }
        //step6 按月group订单
    }
}
