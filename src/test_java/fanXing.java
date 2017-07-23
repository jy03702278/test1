package test_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mao on 2017/7/8.
 * 泛型练习
 */
public class fanXing {
    public static void main(String[] args){
        List<String> books = new ArrayList<>();
        books.add("maoyujia");
        books.add("chenjingchou");
        System.out.println(books);
//        books.forEach(ele->System.out.println(ele.length()));

        assert books.contains("chenjingchou"):"chenjingchou is not exist";

        Map<String,Integer> company = new HashMap<>();
        company.put("salary1",3000);
        company.put("salary2",4000);
        System.out.println(company);
//        company.forEach((key,value)->System.out.println(key+":"+value));
        System.out.println(company.get("salary1"));

    }
}
