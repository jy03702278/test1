package test_java;

/**
 * Created by mao on 2017/6/13.
 */

public class test_b extends test_a{
    protected String d = "d";

    @Override
    public void add() {
        super.add();
        System.out.println("zzzzzzzzzz");
    }
    public void add(String kk) {
        String asd = kk+ "aaa";
        System.out.println(asd);

    }


    public static void main(String args[]){
        test_b bb = new test_b();
        String e = bb.d + bb.see();
        bb.add();
        bb.add("ascxv");
    }
}
