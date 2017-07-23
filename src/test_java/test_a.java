package test_java;

/**
 * Created by mao on 2017/6/13.
 */
public class test_a{
    private String a = "a";
    private String b = "b";
    public String eat(){
        return "food";
    }
    public String see(){
        return "view is good";
    }
    public void add(){
        String c = a + b ;
        System.out.println(c);
    }
    public static void main(String args[]){
        test_a aa = new test_a();
        aa.add();
}}
