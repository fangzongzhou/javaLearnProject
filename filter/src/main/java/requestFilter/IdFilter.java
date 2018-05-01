package requestFilter;

public class IdFilter implements WebFilter {
    @Override
    public void doFilter(Request request, Response response, WebFilterChain webFilterChain) {
        System.out.println("idfilter request do");
        webFilterChain.doFilter(request, response);
        System.out.println("idfilter response do");
    }
}
