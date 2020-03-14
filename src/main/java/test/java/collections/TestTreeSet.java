package test.java.collections;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 谢郑伟
 * Created on 2019-11-05 19:04
 */
public class TestTreeSet {
    public static void main(String[] args){
        TreeSet<Student> strings = new TreeSet<>();
      /*  strings.add("a");
        strings.add("a");
        strings.add("b");
        System.out.println(strings);*/
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student(1,"ss","aa"));
        students.add(new Student(2,"sssd","aa"));
        students.add(new Student(3,"ssgg","aa"));
        System.out.println(students);
    }

}
class Student{
    private Integer id;
    private String name;
    private String age;

    public Student(Integer id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}