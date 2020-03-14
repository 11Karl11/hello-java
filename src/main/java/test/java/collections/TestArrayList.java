package test.java.collections;

import java.util.*;

/**
 * @author 谢郑伟
 * Created on 2019-11-05 18:07
 */
public class TestArrayList {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("a");
        li.add("b");
        li.add("c");
        li.add("d");
        li.add("e");

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(10,"1","1"));
        students.add(new Student(2,"1","1"));
        students.add(new Student(10,"3","3"));
        students.add(new Student(300,"1","1"));
        students.add(new Student(31,"1","1"));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o1.getId() - o2.getId();
                if (i>0){
                    return 1;
                }else if (i<0){
                    return -1;
                }
                return 0;
            }
        });
        for (Student student : students) {
            System.out.println(student);
        }
        // li.remove("d");
        //Iterator<String> iterator = li.iterator();
        // while (iterator.hasNext()){
        //     System.out.println(iterator.next());
        // }
        // while (iterator.hasNext()) {
        //     //执行一次next（）就会指向下一个元素，所以这里输出的是c的下一个元素
        //     if ((iterator.next()).equals("c")) {
        //         System.out.println(iterator.next());
        //         continue;
        //     } else {
        //         System.out.println("不满足条件");
        //         continue;
        //     }
        // }
        // while (iterator.hasNext()){
        //     if (iterator.next().equals("a")){
        //         iterator.remove();
        //         break;
        //     }
        // }
        // while (iterator.hasNext()){
        //     System.out.println(iterator.next());
        // }
    }
}
