package test.java.collections;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author xzw
 * @date 2019/9/5
 **/
public class TestMapEquals {
    private String name; //姓名
    private String sex;  //性别
    private String idCard;//身份证号

    public TestMapEquals(String name, String sex, String idCard) {
        this.name = name;
        this.sex = sex;
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestMapEquals that = (TestMapEquals) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(idCard, that.idCard);
    }



    public static void main(String[] args){
        HashMap<TestMapEquals, TestMapEquals> test = new HashMap<>();
        TestMapEquals testMapEquals = new TestMapEquals("zhang", "man", "2222");
        TestMapEquals testMapEquals1 = new TestMapEquals("xie", "man", "2221112");
        test.put(testMapEquals,testMapEquals);
        System.out.println(test.get(testMapEquals));
    }
}
