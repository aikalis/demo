package util;

import com.alibaba.fastjson.JSON;

/**
 * Created by Administrator on 2018/12/19 0019.
 */
public class ObjectToJsonUtil {
    public String objToJsonStr(Object obj){
        String str= JSON.toJSONString(obj);
        return str;
    }
}
