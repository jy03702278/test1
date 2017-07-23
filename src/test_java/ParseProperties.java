package test_java;

import java.io.*;
import java.util.Properties;

/**
 * Created by mao on 2017/7/23.
 * 读取properties的数据内容
 */
public class ParseProperties {
    private   Properties pro = new Properties();

    public  ParseProperties(String propertiesPath){
        this.loadProperties(propertiesPath);

    }

    private void  loadProperties(String propertiesPath){
        try {
            InputStream in = new FileInputStream(propertiesPath);
            InputStreamReader inr = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(inr);
            pro.load(br);
            }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    public  String getValue(String keyname) {
        String value = pro.getProperty(keyname);
        return value;

    }

    public static void main(String args[]){
        ParseProperties p = new ParseProperties("E:\\IDEA_project\\tools\\testData1");
        System.out.println(p.getValue("url"));

    }

}

