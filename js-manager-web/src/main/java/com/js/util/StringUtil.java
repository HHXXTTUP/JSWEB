package com.js.util;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 判断是否为空却做模糊查询格式化
 * @author 
 *
 */
public class StringUtil {

	public static boolean isEmpty(String str){
		if(str==null||"".equals(str.trim())){
			return true;
		}else{
			return false;
		}
	}
	

	public static boolean isNotEmpty(String str){
		if((str!=null)&&!"".equals(str.trim())){
			return true;
		}else{
			return false;
		}
	}
	

	public static String formatLike(String str){
		
			return "%"+str+"%";
	
	}
	

	public static Date dateTimeString2Date(String date_str) {
        try {
            Calendar cal = Calendar.getInstance();//日期类
            java.sql.Timestamp timestampnow = new java.sql.Timestamp(cal.getTimeInMillis());//转换成正常的日期格式
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            ParsePosition pos = new ParsePosition(0);
            java.util.Date current = formatter.parse(date_str, pos);
            timestampnow = new java.sql.Timestamp(current.getTime());
            return timestampnow;
        }
        catch (NullPointerException e) {
            return null;
        }
    }
	
	public static Date dateTimeString2Dateinfo(String date_str) {
        try {
            Calendar cal = Calendar.getInstance();//日期类
            java.sql.Timestamp timestampnow = new java.sql.Timestamp(cal.getTimeInMillis());//转换成正常的日期格式
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            ParsePosition pos = new ParsePosition(0);
            java.util.Date current = formatter.parse(date_str, pos);
            timestampnow = new java.sql.Timestamp(current.getTime());
            return timestampnow;
        }
        catch (NullPointerException e) {
            return null;
        }
    }
	
	
	
}
