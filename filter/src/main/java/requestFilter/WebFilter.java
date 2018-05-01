package requestFilter;

public interface WebFilter {
    public void doFilter(Request request, Response response,WebFilterChain webFilterChain);


}
