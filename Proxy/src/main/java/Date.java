import java.text.SimpleDateFormat;

public class Date {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        long qwer;
        qwer=3464525*1000;
        System.out.println((int)qwer);
        System.out.println(formatter.format(new java.util.Date()));
    }
}
