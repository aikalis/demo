package Test;

import Entity.Resultmsg;
import util.ObjectToJsonUtil;

/**
 * Created by Administrator on 2018/12/19 0019.
 */
public class TestMsg {
    public static void main(String[] args) {
        ReadTest readTest = new ReadTest();
       String str = readTest.getDir("D:\\xftp");
        Resultmsg rm=new Resultmsg(0,"success",str);
        ObjectToJsonUtil otju=new ObjectToJsonUtil();
       String msg= otju.objToJsonStr(rm);
        System.out.println(msg);
    }
}
