package stringFilter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    List<Filter> filterList = new ArrayList<>();

    public FilterChain addFilter(Filter filter) {
        filterList.add(filter);
        return this;
    }

    public String doFilter(String string){
        String res=string;
        for (Filter filter : filterList) {
            res = filter.doFilter(res);
        }
        return res;
    }
}
