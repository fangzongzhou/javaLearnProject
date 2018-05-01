package requestFilter;

public class UserFilter implements WebFilter {
    @Override
    public void doFilter(Request request, Response response,WebFilterChain webFilterChain) {
        request.setReqStr(request.getReqStr().replace("user", "name"));
        System.out.println("user filter request do");
        webFilterChain.doFilter(request, response);
        System.out.println("user filter response do");
    }
}
