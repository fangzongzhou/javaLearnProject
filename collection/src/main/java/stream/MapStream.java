package stream;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapStream {

    public static void main(String[] args) {

        Set<Long> ids = Sets.newHashSet();

        List<String> myIds = Lists.newArrayList();
        myIds.add("asdf");
        myIds.add("qwer");
        System.out.println(myIds.stream().map(String::toUpperCase).collect(Collectors.toList()));
        System.out.println(myIds);


    }
}
