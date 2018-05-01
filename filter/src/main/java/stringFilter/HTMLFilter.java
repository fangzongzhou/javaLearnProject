package stringFilter;

public class HTMLFilter implements Filter{
    @Override
    public String doFilter(String string) {
        String resStr=string.replace('r', 'p');
        return resStr;
    }
}
