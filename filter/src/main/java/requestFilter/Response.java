package requestFilter;

public class Response {
    String resStr;

    public String getResStr() {
        return resStr;
    }

    public void setResStr(String resStr) {
        this.resStr = resStr;
    }

    @Override
    public String toString() {
        return "Response{" +
                "resStr='" + resStr + '\'' +
                '}';
    }
}
