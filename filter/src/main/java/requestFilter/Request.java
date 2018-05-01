package requestFilter;

public class Request {
    String reqStr;

    public String getReqStr() {
        return reqStr;
    }

    @Override
    public String toString() {
        return "Request{" +
                "reqStr='" + reqStr + '\'' +
                '}';
    }

    public void setReqStr(String reqStr) {
        this.reqStr = reqStr;
    }
}
