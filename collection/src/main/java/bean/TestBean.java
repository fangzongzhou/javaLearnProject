package bean;

import java.util.List;

public class TestBean {
    String name;
    List phoneNumberList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getPhoneNumberList() {
        return phoneNumberList;
    }

    public void setPhoneNumberList(List phoneNumberList) {
        this.phoneNumberList = phoneNumberList;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "name='" + name + '\'' +
                ", phoneNumberList=" + phoneNumberList +
                '}';
    }
}
