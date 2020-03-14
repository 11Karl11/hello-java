package test.java.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 谢郑伟
 * Created on 2019-11-05 19:09
 */
public class TestHashMap {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>();
        map.put("s","1");
        map.put("r","2");
        map.put("t","u");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key:"+entry.getKey());
            System.out.println("key:"+entry.getValue());
        }

    }
}
