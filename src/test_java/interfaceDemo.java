package test_java;

/**
 * Created by mao on 2017/7/8.
 */

interface   Flyanimal{
    int size = 10; //定义接口的常量
    void fly();  //接口的普通方法，是抽象的，如果有类要实现该接口，就必须得实现这个普通方法。
    void eat(); //接口的普通方法，是抽象的，如果有类要实现该接口，就必须得实现这个普通方法。
}
class   Insect {
    int  legnum=6;
}
class  Bird {
    int  legnum=2;
    void egg(){};
}
class Ant extends Insect implements  Flyanimal {
    //实现接口，必须实现接口的普通方法。
    public void fly(){
        System.out.println("Ant can  fly");
    }
    //实现接口，必须实现接口的普通方法。
    public void eat(){
        System.out.println("Ant can eat...........");
    }
}
class Pigeon  extends Bird implements  Flyanimal {
    public void fly(){
        System.out.println("pigeon  can fly");
    }
    public void eat(){
        System.out.println("pigeon can eat...........");
    }
    public void egg(){
        System.out.println("pigeon  can lay  eggs ");
    }
}
public class interfaceDemo{
    public static void main(String args[]){
        Ant a=new Ant();
        a.fly();
        System.out.println("Ant's legs are"+ a.legnum);
        Pigeon p= new Pigeon();
        p.fly();
        p.egg();
        p.eat();
        System.out.println(Flyanimal.size);
    }
}