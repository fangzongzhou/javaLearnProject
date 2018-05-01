package stringFilter;

public class Main {
    public static void main(String[] args) {
        String string = "敏感r的p";
        MessageProcesser messageProcesser=new MessageProcesser();
        messageProcesser.setMessage(string);
        stringFilter.FilterChain filterChain=new stringFilter.FilterChain();
        filterChain.addFilter(new HTMLFilter())
                .addFilter(new SesitiveFilter());
        messageProcesser.setFilterChain(filterChain);
        System.out.println(messageProcesser.process());
    }
}
