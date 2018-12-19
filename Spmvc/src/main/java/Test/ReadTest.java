package Test;

import java.io.File;
import java.util.List;

/**
 * Created by Administrator on 2018/12/19 0019.
 */
public class ReadTest {
    public static void main(String[] args) {
        ReadTest rt=new ReadTest();
       String str= rt.getDir("D:\\xftp");
        System.out.println(str);
    }
    public String getDir(String filePath){
        File file=new File(filePath);
        File[] files= file.listFiles();
        StringBuffer sb=new StringBuffer();
        sb.append("[");
        for (File file1 : files) {
            if (file1.isDirectory()){
                sb.append("{\"label\":\""+file1.getName()+"\",\"state\":\"open\",\"href\":\""+file1.getPath()+"\",\"expand\":true,\"children\":["+getChildren(file1.getPath())+"]}");
            }else {
               sb.append("{\"label\":\"" + file1.getName()+"\",\"href\":\""+file1.getPath()+"\",\"expand\":false}");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public String getChildren(String filePath){
        File file=new File(filePath);
        File[] files= file.listFiles();
        StringBuffer sb=new StringBuffer();
        for (File file1 : files) {
            if (file1.isDirectory()){
                sb.append("{\"label\":\""+file1.getName()+"\",\"state\":\"open\",\"href\":\""+file1.getPath()+"\",\"expand\":true,\"children\":["+getChildren(file1.getPath())+"]}");
            }else {
                sb.append("{\"label\":\"" + file1.getName()+"\",\"href\":\""+file1.getPath()+"\",\"expand\":false}");
            }
        }
        return sb.toString();
    }
}
