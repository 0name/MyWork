package reflection;

import reflection.annotation.UserAnnotation;

public class TestClass {
    private final int intData;

    @UserAnnotation(author = "not me")
    private String strData;
    public String tst = "fsdfsf";

    public TestClass(int intData, String strData) {
        this.intData = intData;
        this.strData = strData;
    }

    public int getIntData() {

        return intData;
    }

    public String getStrData() {
        return strData;
    }

    public void setStrData(String strData) {
        this.strData = strData;
    }

    public void callPrivate(){
        System.out.println("Private method called");
    }

    @Override
    public String toString() {
        return "reflection{" +
                "intData=" + intData +
                ", strData='" + strData + '\'' +
                '}';
    }
}
