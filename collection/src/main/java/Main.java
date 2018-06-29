import bean.TestBean;
import com.google.common.collect.Lists;

import java.lang.reflect.Type;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<Integer> qwer = Lists.newArrayList(1, 3, 2);
        qwer.sort((o1,o2)->{return o1-o2;});
        System.out.println(qwer);
    }
}
