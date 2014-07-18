package my.test;

import javax.ejb.Stateless;

@Stateless
public class TestBean {

    public String getTestValue() {
        return "FOO";
    }

}
