package stringFilter;

public class SesitiveFilter implements Filter {
    @Override
    public String doFilter(String str) {

        String res = str.replace("敏感", "");
        return res;
    }
}
