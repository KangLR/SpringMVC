package com.kang.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.text.SimpleDateFormat;

/**
 * @author klr
 * @create 2020-03-21-11:41
 */
public class JsonUtils {
    public static String getJson(Object object) throws JsonProcessingException {
        return getJson(object,"YYYY-MM-DD HH:MM:ss");
        //很多源码的写法都是这样的，调用
    }
    public static String getJson(Object object, String dateFormat) throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();

        //不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        //自定义日期的格式
        SimpleDateFormat sdf=new SimpleDateFormat(dateFormat);
        mapper.setDateFormat(sdf);

        return mapper.writeValueAsString(object);
    }
}
