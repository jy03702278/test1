package test_java;

import java.io.*;
import java.util.zip.*;
public class decompress {

    public static void ZipCon(){
        File file = new File("F:/zipfi.zip");
        try {
            ZipFile zipFile = new ZipFile(file);
            System.out.println("压缩文件的名称为：" + zipFile.getName());
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**  解压缩（解压缩单个文件）*/
    public static void ZipContraFile(String zippath ,String outfilepath ,String filename) {
        try {
        File file = new File(zippath);//压缩文件路径和文件名
        File outFile = new File(outfilepath);//解压后路径和文件名
        ZipFile zipFile = new ZipFile(file);
        ZipEntry entry = zipFile.getEntry(filename);//所解压的文件名
        InputStream input = zipFile.getInputStream(entry);
        System.out.println("    " + input.read());
        OutputStream output = new FileOutputStream(outFile);
        int temp = 0;
        while((temp = input.read()) != -1){
        output.write(temp);
        }
        input.close();
        output.close();
        } catch (Exception e) {
        e.printStackTrace();
        }
        }


    /**  解压缩（压缩文件中包含多个文件）可代替上面的方法使用。
     * ZipInputStream类
     * 当我们需要解压缩多个文件的时候，ZipEntry就无法使用了，
     * 如果想操作更加复杂的压缩文件，我们就必须使用ZipInputStream类
     * */
    public static String ZipContraMultiFile(String zippath ,String outzippath){
        //outzippath 输出的目录，例如   E://maoyujia//
        String name_path = "";
        try {
            File file = new File(zippath);
            File outFile = null;
            ZipFile zipFile = new ZipFile(file);
            ZipInputStream zipInput = new ZipInputStream(new FileInputStream(file));
            ZipEntry entry = null;
            InputStream input = null;
            OutputStream output = null;
            while((entry = zipInput.getNextEntry()) != null){
                System.out.println("解压缩" + entry.getName() + "文件");
                outFile = new File(outzippath + File.separator + entry.getName());
                if(!outFile.getParentFile().exists()){
                    outFile.getParentFile().mkdir();
                }
                if(!outFile.exists()){
                    outFile.createNewFile();
                }
                input = zipFile.getInputStream(entry);
                output = new FileOutputStream(outFile);
                int temp = 0;
                while((temp = input.read()) != -1){
                    output.write(temp);
                }
                input.close();
                output.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //以下是获取文件夹下面所有文件
        File file = new File(outzippath);
        System.out.println("\n是文件夹");
        String[] fileList = file.list();
        for (int i=0;i<fileList.length;i++){
            File readfile = new File(outzippath + fileList[i]);
            System.out.println("path="+readfile.getPath());
            System.out.println("absolutepath=" +readfile.getAbsolutePath());
            System.out.println("name="+readfile.getName());
            if(readfile.getName().contains("repor")){
                String name1 = readfile.getName();
                System.out.println(name1);
                name_path = outzippath+name1; // 输出路径+xls文件名
            }
            System.out.println("---------------------");
        }
        return name_path;
    }

    public static void main(String argv[]) {
        ZipContraMultiFile("F:\\zhengyi.zip","E:\\maoyujia\\");
    }


}
