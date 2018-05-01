package requestFilter;

public class Main {
    public static void main(String[] args) {
        Request request=new Request();
        request.setReqStr("user:fzz");
        Response response=new Response();
        response.setResStr("user:response");
        WebFilterChain webFilterChain=new WebFilterChain();
        webFilterChain.addWebFilter(new UserFilter())
        .addWebFilter(new IdFilter());
        webFilterChain.doFilter(request, response);

        System.out.println(request.toString()+response.toString());
    }
}
