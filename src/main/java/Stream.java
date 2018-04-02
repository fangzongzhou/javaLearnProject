import com.google.common.collect.Lists;

import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numList = Lists.newArrayList(1, null, 3, null, 5);
        System.out.println(numList.stream().filter(num -> num != null).count());
        numList.stream().map(Stream::add2).reduce(Stream::sum);
    }

    public static Integer add2(Integer num) {
        return num+2;
    }

    public static Integer sum(Integer a, Integer b) {

        return a+b;
    }
}
