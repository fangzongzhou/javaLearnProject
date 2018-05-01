package requestFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class WebFilterChain  {

    List<WebFilter> webFilters = new ArrayList<>();

    int filterIndex=0;


    public WebFilterChain addWebFilter(WebFilter webFilter) {
        webFilters.add(webFilter);
        return this;
    }

    public void doFilter(Request request, Response response) {
        if (filterIndex == webFilters.size()) {
            return;
        }
        WebFilter webFilter=webFilters.get(filterIndex);
        filterIndex++;
        webFilter.doFilter(request, response,this);


    }
}
