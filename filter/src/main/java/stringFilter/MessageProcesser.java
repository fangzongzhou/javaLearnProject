package stringFilter;

public class MessageProcesser {
    String message;

    stringFilter.FilterChain filterChain;

    public stringFilter.FilterChain getFilterChain() {
        return filterChain;
    }

    public void setFilterChain(stringFilter.FilterChain filterChain) {
        this.filterChain = filterChain;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    public String process() {


        return filterChain.doFilter(message);
    }
}
