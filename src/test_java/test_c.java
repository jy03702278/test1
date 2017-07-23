package test_java;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by mao on 2017/7/5.
 */
public class test_c {

    public static void main(String args[]){
        //打印一个数组
        String [] i = {"1","sdf","f"};
        System.out.println("数组i的长度："+i.length);
        String ki = Arrays.toString(i);
        ArrayList<String >  list = new ArrayList<String>(Arrays.asList(i));
        System.out.println("数组i转换成字符串后是ki： "+ki );
        System.out.println("ki的长度是"+ki.length() );
        System.out.println("数组i转化成列表后，list是 "+list );
        list.add(0,"mao");
        System.out.println(list.get(1) );


    }
}
