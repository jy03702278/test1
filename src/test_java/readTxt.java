package test_java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Created by mao on 2017/6/19.
 */
public class readTxt {
    //读取txt
    public static void readTxtFile(String filepath) {
        File file = new File(filepath);//获得一个文件句柄
        try {
            FileInputStream inputFile = new FileInputStream(file);//通过这条线路读取甲方的信息：new FileInputStream(file) 目前这个信息已经读进来内存当中了。
            InputStreamReader reader = new InputStreamReader(inputFile);//使用InputStreamReader()这个方法进行解读刚才装进来内存当中的数据
            BufferedReader buffer = new BufferedReader(reader);//解读完成后要输出呀。那当然要转换成IO可以识别的数据呀。那就需要调用字节码读取的方法BufferedReader()。
            String  text = buffer.readLine();//一次读取一行
            while (text != null){
                System.out.println(text);
            }
            buffer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String argv[]) {
        String filePath = "E:\\IDEA_project\\data\\txt1.txt";
        readTxtFile(filePath);

    }
}
